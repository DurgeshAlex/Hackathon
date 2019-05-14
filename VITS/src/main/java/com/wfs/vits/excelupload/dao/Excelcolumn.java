package com.wfs.vits.excelupload.dao;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Excelcolumn {

	@Id
	@GeneratedValue
	private long id;
	private String columnname;
	private String columndisplayname;
	private long templateid;
	private int columnsequence;
	private boolean required;
	private String validationmethod;
	private String datatype ;
	private String defaultvalue;
	private String  createdby; 
	private LocalDateTime createtedon;
	private String updatedby;
	private LocalDateTime updatedon;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getColumnname() {
		return columnname;
	}
	public void setColumnname(String columnname) {
		this.columnname = columnname;
	}
	public String getColumndisplayname() {
		return columndisplayname;
	}
	public void setColumndisplayname(String columndisplayname) {
		this.columndisplayname = columndisplayname;
	}

	public long getTemplateid() {
		return templateid;
	}
	public void setTemplateid(long templateid) {
		this.templateid = templateid;
	}
	public int getColumnsequence() {
		return columnsequence;
	}
	public void setColumnsequence(int columnsequence) {
		this.columnsequence = columnsequence;
	}
	public boolean isRequired() {
		return required;
	}
	public void setRequired(boolean required) {
		this.required = required;
	}
	public String getValidationmethod() {
		return validationmethod;
	}
	public void setValidationmethod(String validationmethod) {
		this.validationmethod = validationmethod;
	}
	public String getDatatype() {
		return datatype;
	}
	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}
	public String getDefaultvalue() {
		return defaultvalue;
	}
	public void setDefaultvalue(String defaultvalue) {
		this.defaultvalue = defaultvalue;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public LocalDateTime getCreatetedon() {
		return createtedon;
	}
	public void setCreatetedon(LocalDateTime createtedon) {
		this.createtedon = createtedon;
	}
	public String getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}
	public LocalDateTime getUpdatedon() {
		return updatedon;
	}
	public void setUpdatedon(LocalDateTime updatedon) {
		this.updatedon = updatedon;
	}

	

}

