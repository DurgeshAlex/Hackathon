package com.excelupload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelupload.dao.ExcelTemplate;
@Repository
public interface ExcelTemplateRepository extends  JpaRepository<ExcelTemplate, Integer> {

}
