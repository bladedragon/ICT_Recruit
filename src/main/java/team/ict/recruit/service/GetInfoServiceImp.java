package team.ict.recruit.service;


import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.ict.recruit.DAO.InfoMapper;
import team.ict.recruit.model.Applicant;
import team.ict.recruit.utils.CommonUtil;

import java.util.Iterator;
import java.util.List;

@Service
public class GetInfoServiceImp implements GetInfoService {
    @Autowired
    InfoMapper infoMapper;

    public GetInfoServiceImp() {
    }

    public HSSFWorkbook getAllInfo() {
        List<Applicant> applicants = this.infoMapper.getAllInfo();
        int i = 3;
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("sheet1");
        HSSFCellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setFillForegroundColor((new HSSFColor.GREY_25_PERCENT()).getIndex());
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setWrapText(true);
        HSSFRow title = sheet.createRow(0);
        CellRangeAddress cra0 = new CellRangeAddress(0, 1, 0, 14);
        sheet.addMergedRegion(cra0);
        title.createCell(0).setCellValue("ict报名信息表");
        HSSFRow titleRow = sheet.createRow(2);
        titleRow.createCell(0).setCellValue("学生姓名");
        titleRow.createCell(1).setCellValue("学号");
        titleRow.createCell(2).setCellValue("班级");
        titleRow.createCell(3).setCellValue("联系方式");
        titleRow.createCell(4).setCellValue("专业");
        titleRow.createCell(5).setCellValue("年级");
        titleRow.createCell(6).setCellValue("qq号");
        titleRow.createCell(7).setCellValue("综合排名");
        titleRow.createCell(8).setCellValue("专业排名");
        CellRangeAddress cra1 = new CellRangeAddress(2, 2, 9, 12);
        sheet.addMergedRegion(cra1);
        titleRow.createCell(9).setCellValue("爱好特长");
        titleRow.createCell(13).setCellValue("填写时间");
        titleRow.createCell(14).setCellValue("已加入组织");

        for (Iterator var10 = applicants.iterator(); var10.hasNext(); ++i) {
            Applicant applicant = (Applicant) var10.next();
            HSSFRow approw = sheet.createRow(i);
            approw.createCell(0).setCellValue(applicant.getStuname());
            approw.createCell(1).setCellValue(applicant.getClassid());
            approw.createCell(2).setCellValue(applicant.getClassid());
            approw.createCell(3).setCellValue(applicant.getTelephone());
            approw.createCell(4).setCellValue(CommonUtil.changeToCollege(applicant.getCollege()));
            approw.createCell(5).setCellValue(CommonUtil.changeToGrade(applicant.getGrade()));
            approw.createCell(6).setCellValue(applicant.getQid());
            approw.createCell(7).setCellValue((double) applicant.getRank_com());
            approw.createCell(8).setCellValue((double) applicant.getRank_spec());
            CellRangeAddress cra2 = new CellRangeAddress(i, i, 9, 12);
            sheet.addMergedRegion(cra2);
            approw.createCell(9).setCellValue(applicant.getHobby());
            approw.createCell(13).setCellValue(applicant.getFill_time());
            approw.createCell(14).setCellValue(applicant.getExperience());
        }

        return workbook;
    }
}