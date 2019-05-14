package com.wfs.vits.excelupload.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wfs.vits.excelupload.dao.Excelcolumn;

@Repository
public interface ExcelColumnRepository extends JpaRepository<Excelcolumn, Integer> {
	
	public List<Excelcolumn> findByTemplateidOrderByColumnsequenceAsc(long templateId);
	public List<Excelcolumn> findByTemplateid(long templateId);
	
}
