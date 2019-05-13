package com.excelupload.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelupload.dao.ExcelColumn;

public interface ExcelColumnRepository extends JpaRepository<ExcelColumn, Integer> {
	
	public List<ExcelColumn> findByTemplateId(long templateId);

}
