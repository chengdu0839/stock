package com.zw.stock.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "firms")
public class Firm {

	@Id
	private String id;

	/**
	 * 股票代码
	 */
	@Field("code")
	@Indexed   //单字段索引
	private String code;

	/**
	 * 公司名称
	 */
	@Indexed
	private String name;

	/**
	 * 上市地址
	 */
	private String type;

	/**
	 * 主题概念(板块)
	 */
	private String[] sectors = {};

	/**
	 * 公司行业
	 */
	private String[] industries = {};

	/**
	 * 说明
	 */
	private String[] description = {};

	// 建立两个集合之间的关联关系。
	@DBRef(db="details")
	@Field("detail")
	private List<HistoryDetail> historyDetails = new ArrayList<HistoryDetail>();

	@DBRef(db="remarks")
	private List<Remark> remarks = new ArrayList<Remark>();
	
	@Transient
	private boolean exit = false;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String[] getSectors() {
		return sectors;
	}

	public void setSectors(String[] sectors) {
		this.sectors = sectors;
	}

	public String[] getIndustries() {
		return industries;
	}

	public void setIndustries(String[] industries) {
		this.industries = industries;
	}

	public String[] getDescription() {
		return description;
	}

	public void setDescription(String[] description) {
		this.description = description;
	}

	public List<HistoryDetail> getHistoryDetails() {
		return historyDetails;
	}

	public void setHistoryDetails(List<HistoryDetail> historyDetails) {
		this.historyDetails = historyDetails;
	}

	public List<Remark> getRemarks() {
		return remarks;
	}

	public void setRemarks(List<Remark> remarks) {
		this.remarks = remarks;
	}

	public boolean isExit() {
		return exit;
	}

	public void setExit(boolean exit) {
		this.exit = exit;
	}

}
