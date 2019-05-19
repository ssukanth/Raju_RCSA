package com.infotech.Excel;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.supercsv.io.CsvMapReader;
import org.supercsv.io.ICsvMapReader;
import org.supercsv.prefs.CsvPreference;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class CsvReaderWriter {
	
	String file;
	
	public CsvReaderWriter(String file) {
		this.file = file;
	}
	
	
	public void csvReader(String name) throws Exception {
		ICsvMapReader mapReader = new CsvMapReader(
			      new FileReader(file), CsvPreference.EXCEL_PREFERENCE);
			 try {
			  final String[] headers = mapReader.getHeader(true);
			  Map<String, String> row;
			  while( (row = mapReader.read(headers)) != null) {
				  
				  String read = row.get(name);
				  System.out.println(read);
			  }
			} finally {
			  mapReader.close();
			}
		}	
	
	
	 public void csvWriter(String replace,
		    int row, int col) throws IOException {

		 File inputFile = new File(file);
		 CSVWriter writer = new CSVWriter(new FileWriter(inputFile), ',');
		 try {
				// Read existing file 
				CSVReader reader = new CSVReader(new FileReader(inputFile), ',');
				List<String[]> csvBody = reader.readAll();
				// get CSV row column  and replace with by using row and column
				csvBody.get(row)[col] = replace;
				reader.close();

				// Write to CSV file which is open
				writer.writeAll(csvBody);
		} finally {
			writer.flush();
			writer.close();
		}
	}
}
