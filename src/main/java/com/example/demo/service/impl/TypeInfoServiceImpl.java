package com.example.demo.service.impl;

import com.example.demo.common.exception.RException;
import com.example.demo.common.model.CodeEnum;
import com.example.demo.common.util.ExcelUtil;
import com.example.demo.common.util.StringUtils;
import com.example.demo.entity.TypeinfoEntity;
import com.example.demo.repository.TypeInfoRepository;
import com.example.demo.service.TypeInfoService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.w3c.dom.TypeInfo;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by goodwuxuyang on 2019/5/7.
 */
@Service
public class TypeInfoServiceImpl implements TypeInfoService{

    @Autowired
    private TypeInfoRepository typeInfoRepository;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean batchImport(String fileName, MultipartFile file) throws Exception {
        boolean notNull = false;
        /*List<TypeinfoEntity> typeInfoList = new ArrayList<>();
        if (!fileName.matches("^.+\\.(?i)(xls)$") && !fileName.matches("^.+\\.(?i)(xlsx)$")) {
            throw new RException("上传文件格式不正确", CodeEnum.EXCEPTION.getCode());
        }
        boolean isExcel2003 = true;
        if (fileName.matches("^.+\\.(?i)(xlsx)$")) {
            isExcel2003 = false;
        }
        InputStream is = file.getInputStream();
        Workbook wb = null;
        if (isExcel2003) {
            wb = new HSSFWorkbook(is);
        } else {
            wb = new XSSFWorkbook(is);
        }
        Sheet sheet = wb.getSheetAt(0);
        if(sheet!=null){
            notNull = true;
        }
        TypeinfoEntity typeInfo;
        for (int r = 1; r <= sheet.getLastRowNum(); r++) {
            Row row = sheet.getRow(r);
            if (row == null){
                continue;
            }

            typeInfo = new TypeinfoEntity();

            if( row.getCell(0).getCellType() !=1){
                throw new RException("导入失败(第"+(r+1)+"行,姓名请设为文本格式)", CodeEnum.EXCEPTION.getCode());
            }
            String ttype = row.getCell(0).getStringCellValue();

            if(StringUtils.isEmpty(ttype)){
                throw new RException("导入失败(第"+(r+1)+"行,姓名未填写)", CodeEnum.EXCEPTION.getCode());
            }

            String timage = row.getCell(1).getStringCellValue();
            if(StringUtils.isEmpty(timage)){
                throw new RException("导入失败(第"+(r+1)+"行,电话未填写)", CodeEnum.EXCEPTION.getCode());
            }

            typeInfo.setTtype(ttype);
            typeInfo.setTimage(timage);
            typeInfoList.add(typeInfo);
        }
         typeInfoRepository.saveAll(typeInfoList);*/
        List<Map<String, Object>> dataFromExcelBySheetNo = ExcelUtil.getDataFromExcelBySheetNo(file.getInputStream(), 1, 0);

        return notNull;
    }



}
