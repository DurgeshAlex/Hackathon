package com.excelupload.dao;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ExcelColumn {

	@Id
	@GeneratedValue
	private long id;
	private String columnName;
	private String columnDisplayName;
	private long templateId;
	private int columnSequence;
	private boolean required;
	private String validationMethod;
	private String dataType ;
	private String defaultValue;
	private long  createdBy; 
	private LocalDateTime createtedOn;
	private long updatedBy;
	private LocalDateTime updatedOn;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getColumnDisplayName() {
		return columnDisplayName;
	}
	public void setColumnDisplayName(String columnDisplayName) {
		this.columnDisplayName = columnDisplayName;
	}
	public long getTemplateId() {
		return templateId;
	}
	public void setTemplateId(long templateId) {
		this.templateId = templateId;
	}
	public int getColumnSequence() {
		return columnSequence;
	}
	public void setColumnSequence(int columnSequence) {
		this.columnSequence = columnSequence;
	}
	public boolean isRequired() {
		return required;
	}
	public void setRequired(boolean required) {
		this.required = required;
	}
	public String getValidationMethod() {
		return validationMethod;
	}
	public void setValidationMethod(String validationMethod) {
		this.validationMethod = validationMethod;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}
	public LocalDateTime getCreatetedOn() {
		return createtedOn;
	}
	public void setCreatetedOn(LocalDateTime createtedOn) {
		this.createtedOn = createtedOn;
	}
	public long getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(long updatedBy) {
		this.updatedBy = updatedBy;
	}
	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}
	

}
