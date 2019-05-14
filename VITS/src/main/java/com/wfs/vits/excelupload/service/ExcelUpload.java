package com.wfs.vits.excelupload.service;

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
import org.springframework.stereotype.Service;

import com.wfs.vits.excelupload.dao.ExcelUploadException;
import com.wfs.vits.excelupload.dao.Excelcolumn;
import com.wfs.vits.excelupload.repository.ExcelColumnRepository;
@Service
public class ExcelUpload {
	
	@Autowired(required=true)
	private ExcelColumnRepository excelColumnRepository;

	public void readExcelFile(File f) {
		try
        {	
			if(!isXlsxFile(f.getName())) {
				throw new ExcelUploadException(ExcelUploadException.NOT_XLSX_TYPE);
			}
			
            FileInputStream file = new FileInputStream(f);
 
            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
 
            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
 
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            rowIterator.next();//Skiping the first row as it is a header
            excelColumnRepository.findByTemplateid(1001L);
            List<Excelcolumn> excelColumnDaos = excelColumnRepository.findByTemplateidOrderByColumnsequenceAsc(1001L);
            List<Map<String,Object>> sheetRows = new ArrayList<>();
            while (rowIterator.hasNext())
            {
 	           Iterator<Excelcolumn>  excelColumnDaosIterator = excelColumnDaos.iterator();

                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();
                //int 
            	Map<String,Object> columns = new HashMap<>();
                while (cellIterator.hasNext() && excelColumnDaosIterator.hasNext())
                {	
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType())
                    {
                    case STRING :
                    	columns.put(excelColumnDaosIterator.next().getColumnname(), cell.getStringCellValue());
                    	break;
                    case NUMERIC :
                    	columns.put(excelColumnDaosIterator.next().getColumnname(), cell.getNumericCellValue());
                    	break;
                    }
                }
                sheetRows.add(columns);
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
