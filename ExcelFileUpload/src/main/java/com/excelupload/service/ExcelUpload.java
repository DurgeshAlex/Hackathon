package com.excelupload.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;

import com.excelupload.exception.ExcelUploadException;
import com.excelupload.repository.ExcelColumnRepository;

public class ExcelUpload {
	
		public ExcelUpload(File file) throws ExcelUploadException {
			if(!isXlsxFile(file.getName())) {
				throw new ExcelUploadException(ExcelUploadException.NOT_XLSX_TYPE);
			}
			readExcelFile(file);
		}
		@Autowired
		private ExcelColumnRepository excelColumnRepository;

		private void readExcelFile(File f) {
			try
	        {
	            FileInputStream file = new FileInputStream(f);
	 
	            //Create Workbook instance holding reference to .xlsx file
	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	 
	            //Get first/desired sheet from the workbook
	            XSSFSheet sheet = workbook.getSheetAt(0);
	 
	            //Iterate through each rows one by one
	            Iterator<Row> rowIterator = sheet.iterator();
	            rowIterator.hasNext();//Skinping the first row as it is a header
	            while (rowIterator.hasNext())
	            {
	                Row row = rowIterator.next();
	                //For each row, iterate through all the columns
	                Iterator<Cell> cellIterator = row.cellIterator();
	                List<Map<Integer,Object>> sheetRows = new ArrayList<>();
	                //int 
	                while (cellIterator.hasNext())
	                {
	                	Map<Integer,Object> columns = new HashMap<>();
	                    Cell cell = cellIterator.next();
	                    //Check the cell type and format accordingly
	                    switch (cell.getCellType())
	                    {
	                    case STRING :
	                    	
	                    }
	                }
	                System.out.println("");
	            }
	            file.close();
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }	
		}

		private boolean isXlsxFile(String name) {
			String type= name.substring(name.indexOf("."));
			if(null!=name && !".xlsx".equalsIgnoreCase(type)) {
				return false;
			}
			return true;
		}
}
