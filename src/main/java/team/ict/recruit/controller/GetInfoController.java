package team.ict.recruit.controller;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import team.ict.recruit.service.GetInfoService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@RestController
public class GetInfoController {
    @Autowired
    GetInfoService service;

    public GetInfoController() {
    }

    @GetMapping(value = "/download" ,produces = "application/json;charset=UTF-8")
    public String GetInfo(HttpServletResponse response) {
        HSSFWorkbook workbook = this.service.getAllInfo();
        String filename = "ICTExcel.xls";
        ServletOutputStream out = null;

        try {
            out = response.getOutputStream();
            response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(filename, "UTF-8"));
            response.setContentType("application/msexcel;charset=UTF-8");
            workbook.write(out);
            out.flush();
        } catch (IOException var14) {
            var14.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException var13) {
                var13.printStackTrace();
            }

        }

        return "下载即将开始";
    }
}
