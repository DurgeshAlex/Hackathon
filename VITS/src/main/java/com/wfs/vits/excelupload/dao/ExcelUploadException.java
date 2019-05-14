package com.wfs.vits.excelupload.dao;

public class ExcelUploadException extends Exception {
public static String NOT_XLSX_TYPE= "Uploaded file is not of .xlsx type";
public static String NOT_FILE = "uploaded file is not a file";
	public ExcelUploadException(String s)  {
		super(s);
	}
}
