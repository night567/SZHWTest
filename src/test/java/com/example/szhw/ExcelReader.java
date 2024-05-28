package com.example.szhw;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader {
    public static void main(String[] args) throws Exception {
        List<ExcelData> res = readExcel("D:\\test.xlsx");
        System.out.println(res);
    }
    public static List<ExcelData> readExcel(String filePath) throws Exception {
        List<ExcelData> excelDataList = new ArrayList<>();

        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fileInputStream)) {
            Sheet sheet = workbook.getSheetAt(0);

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                ExcelData excelData = new ExcelData();

                excelData.setSystemName(getCellValue(row.getCell(0)));
                excelData.setListCode(getCellValue(row.getCell(1)));
                excelData.setItemName(getCellValue(row.getCell(2)));
                excelData.setParameter(getCellValue(row.getCell(3)));
                excelData.setUnit(getCellValue(row.getCell(4)));
                excelData.setQuantity(Double.parseDouble(getCellValue(row.getCell(5))));
                excelData.setUnitPrice(Double.parseDouble(getCellValue(row.getCell(6))));
                excelData.setBrand(getCellValue(row.getCell(7)));
                excelData.setSpecification(getCellValue(row.getCell(8)));
                excelData.setModelNumber(getCellValue(row.getCell(9)));
                excelData.setLabourOrMaterial(getCellValue(row.getCell(10)));
                excelData.setMaterialOrLabour(getCellValue(row.getCell(11)));
                excelData.setItemType(getCellValue(row.getCell(12)));
                excelData.setTaxType(getCellValue(row.getCell(13)));
                excelData.setTaxRate(Double.parseDouble(getCellValue(row.getCell(14))));

                excelDataList.add(excelData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return excelDataList;
    }

    private static String getCellValue(Cell cell) {
        if (cell == null) {
            return "";
        }

        switch (cell.getCellType()) {
            case Cell.CELL_TYPE_NUMERIC:
                return String.valueOf(cell.getNumericCellValue());
            case Cell.CELL_TYPE_STRING:
                return cell.getStringCellValue();
            default:
                return "";
        }
    }
}
