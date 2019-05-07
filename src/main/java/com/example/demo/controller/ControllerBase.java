package com.example.demo.controller;


import com.example.demo.common.util.ExcelUtil;
import com.example.demo.common.util.ObjectUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * @program: mms
 * @description: ControllerBase
 * @author: wuxuyang
 * @create: 2019-03-21 17:28
 **/

public abstract  class ControllerBase {

    /**
     * 导出excel
     *
     * @param list
     *            数据
     * @param cellName
     *            列名，注意key 是中文列名， value 对应 list数据对象属性名称
     * @param sheetName
     *            输入sheet名称，同时是输入文件名称
     * @param <T>
     *            数据对象
     * @throws IOException excel写入异常
     */
    protected <T> void exportExcel(List<T> list, Map<String, String> cellName,
                                   String sheetName) throws IOException {

        List<Map<String, Object>> maps = new ArrayList<>();

        Set<String> keys = cellName.keySet();

        for (T obj : list) {
            Map<String, Object> map = ObjectUtil.transBeanToMap(obj);

            Map<String, Object> nMap = new HashMap<>();
            for (Map.Entry<String, String> entry : cellName.entrySet()) {
                nMap.put(entry.getKey(), map.get(entry.getValue()));
            }

            maps.add(nMap);
        }

        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes()).getResponse();
        ServletOutputStream outputStream = response.getOutputStream();

        Workbook workbook = null;

        try {
            workbook = ExcelUtil.exportToWorkBook(null, maps,
                    keys.toArray(new String[] {}), sheetName,
                    ExcelUtil.ExcelFileType.XLSX);

            response.setHeader("Content-disposition", "attachment; filename="
                    + new String(sheetName.getBytes("gbk"), "ISO-8859-1") + ".xlsx");// 组装附件名称和格式

            workbook.write(outputStream);
            outputStream.flush();
            outputStream.close();
        }finally {
            if (workbook != null) {
                workbook.close();
            }
        }

    }


   /* protected Integer currentUserId(HttpServletRequest request) {
        String tokenHeader = request.getHeader(TokenService.KEY);
        String userId = TokenService.getUserId(tokenHeader);
        return Integer.valueOf(userId);
    }
*/

}
