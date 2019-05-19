package com.infotech.Excel;

import java.io.FileOutputStream;
import java.io.FileReader;

import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.opencsv.CSVReader;

public class CsvToExcelConverter {

	static Workbook workbook = null;
	static CSVReader reader = null;
	
	public static void csvConverter(String csvLocation, String xlsx, String sheetName) throws Exception {
		
		workbook = new XSSFWorkbook();
        CreationHelper helper = workbook.getCreationHelper();
        Sheet sheet = workbook.createSheet(sheetName);

        reader = new CSVReader(new FileReader(csvLocation));
        String[] line;
        int r = 0;
        while ((line = reader.readNext()) != null) {
            Row row = sheet.createRow((short) r++);

            for (int i = 0; i < line.length; i++)
                row.createCell(i)
                   .setCellValue(helper.createRichTextString(line[i]));
        }

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream(xlsx);
        workbook.write(fileOut);
        fileOut.close();	
	}
}
