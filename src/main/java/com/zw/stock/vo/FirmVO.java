package com.zw.stock.vo;

import java.util.Date;

import com.zw.stock.model.Firm;

public class FirmVO {

	private Date startDate;
	private Date endDate;
	private String firmName;
	private String firmCode;
	private String[] type = {};
	private int maxFirmCode;
	private int minFirmCode;
	
	private Firm firm;
	
	
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getFirmName() {
		return firmName;
	}
	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}
	public String getFirmCode() {
		return firmCode;
	}
	public void setFirmCode(String firmCode) {
		this.firmCode = firmCode;
	}
	public String[] getType() {
		return type;
	}
	public void setType(String[] type) {
		this.type = type;
	}
	public Firm getFirm() {
		return firm;
	}
	public void setFirm(Firm firm) {
		this.firm = firm;
	}
	public int getMaxFirmCode() {
		return maxFirmCode;
	}
	public void setMaxFirmCode(int maxFirmCode) {
		this.maxFirmCode = maxFirmCode;
	}
	public int getMinFirmCode() {
		return minFirmCode;
	}
	public void setMinFirmCode(int minFirmCode) {
		this.minFirmCode = minFirmCode;
	}
}
