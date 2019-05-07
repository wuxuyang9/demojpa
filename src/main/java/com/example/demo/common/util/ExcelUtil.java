package com.example.demo.common.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by lhp on 2017/4/11.
 * excel 数据操作
 */
public class ExcelUtil {

    private static Log logger = LogFactory.getLog(ExcelUtil.class);

    private ExcelUtil(){}

    public static Workbook getWorkbookByStream(InputStream excelInputStream){
        try {
            return new XSSFWorkbook(excelInputStream);
        } catch (Exception e) {
            logger.error(e);

            try {
                return new HSSFWorkbook(excelInputStream);
            } catch (IOException e2) {
                logger.error(e2);
            }
        }


        return null;
    }
    
    public static List<HashMap<String, Object>> getDataFromExcelBySheetName(InputStream excelInputStream, String sheetName, int startRowno) throws IOException {
        ArrayList list = new ArrayList();

        Workbook workbook = getWorkbookByStream(excelInputStream);

        if (ObjectUtil.isEmpty(workbook))
            throw new IOException("读取excel异常");

        Sheet sheet = workbook.getSheet(sheetName);
        Row firstRow = sheet.getRow(startRowno);
        String[] cellName = new String[firstRow.getLastCellNum()];
        int cellNum = firstRow.getLastCellNum();
        for(int i=0; i < cellNum; ++i) {
            Cell cell = firstRow.getCell(i);

            String cellValue = getCellStringValue(cell);
            if (ObjectUtil.isEmpty(cellValue)) {
                break;
            }

            cellName[i] = cellValue.replaceAll("\t|\r|\n", "");
        }

        FormulaEvaluator formulaEvaluator = workbook.getCreationHelper().createFormulaEvaluator();

        for(int rowno=startRowno + 1; rowno <= sheet.getLastRowNum(); ++rowno) {
            Row var17 = sheet.getRow(rowno);
            if(ObjectUtil.nonEmpty(var17)) {
                boolean var18 = true;
                HashMap rowMap = new HashMap();


                for(int cellno = 0; cellno < cellNum; ++cellno) {
                    Cell cell = var17.getCell(cellno);
                    Object value = getCellValueFormula(cell, formulaEvaluator);
                    if(value != null && !value.equals("")) {
                        var18 = false;
                    }

                    rowMap.put(cellName[cellno], value);
                }

                if(!var18) {
                    list.add(rowMap);
                }
            }
        }

        return list;
    }

    public static List<Map<String, Object>> getDataFromExcelBySheetNo(InputStream excelInputStream, int sheetNo, int startRowno) throws IOException {
        ArrayList list = new ArrayList();
        Workbook workbook = getWorkbookByStream(excelInputStream);

        if (ObjectUtil.isEmpty(workbook))
            throw new IOException("读取excel异常");

        Sheet sheet = workbook.getSheetAt(sheetNo);
        Row firstRow = sheet.getRow(startRowno);
        String[] cellName = new String[firstRow.getLastCellNum()];

        for(int i=0; i < firstRow.getLastCellNum(); ++i) {
            Cell cell = firstRow.getCell(i);
            String cellValue = getCellStringValue(cell);
            if (ObjectUtil.isEmpty(cellValue)) {
                break;
            }

            cellName[i] = cellValue.replaceAll("\t|\r|\n", "");
        }

        FormulaEvaluator formulaEvaluator = workbook.getCreationHelper().createFormulaEvaluator();
        for(int rowno = startRowno + 1; rowno <= sheet.getLastRowNum(); ++rowno) {
            Row var17 = sheet.getRow(rowno);
            if(var17 != null) {
                boolean var18 = true;
                HashMap rowMap = new HashMap();

                for(int cellno = 0; cellno < firstRow.getLastCellNum(); ++cellno) {
                    Cell cell = var17.getCell(cellno);
                    Object value = getCellValueFormula(cell, formulaEvaluator);
                    if(value != null && !value.equals("")) {
                        var18 = false;
                    }

                    rowMap.put(cellName[cellno], value);
                }

                if(!var18) {
                    list.add(rowMap);
                }
            }
        }

        return list;
    }

    public static Workbook exportToWorkBook(Workbook workbook, List<Map<String, Object>> list, String[] cellName, String sheetName, ExcelFileType fileType) {
        if(workbook == null) {
            if(ExcelFileType.XLS == fileType) {
                workbook = new HSSFWorkbook();
            } else if(ExcelFileType.XLSX == fileType) {
                workbook = new XSSFWorkbook();
            }
        }

        Sheet sheet = ((Workbook)workbook).createSheet(sheetName);
        CellStyle cellStyle = ((Workbook)workbook).createCellStyle();
        Row row = sheet.createRow(0);

        int currentRowNum;
        for(currentRowNum = 0; currentRowNum < cellName.length; ++currentRowNum) {
            String name = cellName[currentRowNum];
            Cell map = row.createCell(currentRowNum);
            map.setCellValue(name);
        }

        currentRowNum = 1;

        for(Iterator var15 = list.iterator(); var15.hasNext(); ++currentRowNum) {
            HashMap var16 = (HashMap)var15.next();
            Row currentRow = sheet.createRow(currentRowNum);

            for(int i = 0; i < cellName.length; ++i) {
                String name1 = cellName[i];
                Cell cell = currentRow.createCell(i);
                setCellValue(cell, var16.get(name1), (Workbook)workbook, cellStyle);
            }
        }

        return (Workbook)workbook;
    }

    public static Workbook exportExcelWithCheckInfo(List<Map<String, Object>> list, InputStream excelInputStream, ExcelFileType fileType, String sheetName, int startRowno) throws IOException {
        Workbook workbook = getWorkbookByStream(excelInputStream);
        if (ObjectUtil.isEmpty(workbook))
            throw new IOException("无法读取excel文件流");


        Sheet sheet = workbook.getSheet(sheetName);
        CellStyle cellStyle = workbook.createCellStyle();
        Row firstRow = sheet.getRow(startRowno);
        String[] cellName = new String[firstRow.getLastCellNum()];

        int currentRowNum;
        for (currentRowNum = 0; currentRowNum < firstRow.getLastCellNum(); ++currentRowNum) {

            Cell cell = firstRow.getCell(currentRowNum);

            String cellValue = getCellStringValue(cell);
            if (ObjectUtil.isEmpty(cellValue)) {
                break;
            }

            cellName[currentRowNum] = cellValue.replaceAll("\t|\r|\n", "");
        }

        currentRowNum = startRowno + 1;

        for(Iterator var18 = list.iterator(); var18.hasNext(); ++currentRowNum) {
            HashMap var19 = (HashMap)var18.next();
            Row currentRow = sheet.createRow(currentRowNum);

            for(int i = 0; i < cellName.length; ++i) {
                String name = cellName[i];
                Cell cell1 = currentRow.createCell(i);
                setCellValue(cell1, var19.get(name), workbook, cellStyle);
            }
        }

        return workbook;
    }


    public static void setCellValue(Cell cell, Object value, Workbook wb, CellStyle cellStyle) {
        CreationHelper createHelper = wb.getCreationHelper();
        Font cellFont = wb.createFont();
        if(value instanceof String) {
            if(((String)value).startsWith("HYPERLINK") || ((String)value).startsWith("=HYPERLINK")) {
                cellFont.setUnderline((byte) 1);
                cellFont.setColor((byte) 12);
                cellStyle.setFont(cellFont);
                cell.setCellStyle(cellStyle);
                cell.setCellFormula((String)value);
            }

            cell.setCellValue((String)value);
        } else if(value instanceof Date) {
            cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("YYYY/MM/DD hh:mm:ss"));
            cell.setCellValue((Date)value);
            cell.setCellStyle(cellStyle);
        } else if(value instanceof Double) {
            cell.setCellValue(((Double)value).doubleValue());
        } else if(value instanceof Integer) {
            String str = String.valueOf(value);
            cell.setCellValue(Double.parseDouble(str));
        } else if(value instanceof Boolean) {
            cell.setCellValue(((Boolean)value).booleanValue());
        } else if(value instanceof  BigDecimal){
            cell.setCellValue(((BigDecimal) value).toPlainString());
        }

    }

    public static Object getCellValue(Cell cell) {
        switch(cell.getCellType()) {
            case 0:
                if(DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue();
                }

                cell.setCellType(1);
                return new BigDecimal(cell.getStringCellValue());
            case 1:
                return cell.getRichStringCellValue().getString().trim();
            case 2:
            default:
                return null;
            case 3:
                return "";
            case 4:
                return Boolean.valueOf(cell.getBooleanCellValue());
            case 5:
                return Byte.valueOf(cell.getErrorCellValue());
        }
    }

    public static Object getCellValueFormula(Cell cell, FormulaEvaluator formulaEvaluator) {
        if(cell != null && formulaEvaluator != null) {
            if(cell.getCellType() == 2) {
                CellValue value = formulaEvaluator.evaluate(cell);
                switch(value.getCellType()) {
                    case 0:
                        if(DateUtil.isCellDateFormatted(cell)) {
                            return cell.getDateCellValue();
                        }

                        cell.setCellType(1);
                        return new BigDecimal(cell.getStringCellValue());
                    case 1:
                        return cell.getRichStringCellValue().getString().trim();
                    case 2:
                    default:
                        break;
                    case 3:
                        return "";
                    case 4:
                        return Boolean.valueOf(cell.getBooleanCellValue());
                    case 5:
                        return Byte.valueOf(cell.getErrorCellValue());
                }
            }

            return getCellValue(cell);
        } else {
            return null;
        }
    }

    public static String getCellStringValue(Cell cell) {

        if (ObjectUtil.isEmpty(cell))
            return "";

        if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC && DateUtil.isCellDateFormatted(cell)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = DateUtil.getJavaDate(cell.getNumericCellValue());
            return dateFormat.format(date);
        }

        if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
            cell.setCellType(1);
        }

        return cell.toString().trim()
                .replaceAll("\n", "")
                .replaceAll(" ", "")
                .replaceAll("\t", "");
    }

    public static enum ExcelFileType {
        XLS,
        XLSX;

        private ExcelFileType() {
        }
    }

}
