package com.zw.stock.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * 历史行情
 * 
 * @author Administrator
 *
 */
@Document(collection = "details")
public class HistoryDetail {

	@Id
	public String id;

	/**
	 * 股票代码
	 */
	public String code;

	/**
	 * 
	 */
	@Field("date")
	private Date date;

	/**
	 * 开盘价
	 */
	private Float openingPrice;

	/**
	 * 收盘价
	 */
	private Float closingPrice;

	/**
	 * 最高价
	 */
	private Float heightPrice;

	/**
	 * 最低价
	 */
	private double lowPrice;

	/**
	 * 涨跌幅
	 */
	private double changeRate;

	/**
	 * 涨跌额
	 */
	private double changeAmount;

	/**
	 * 换手
	 */
	private double handover;

	/**
	 * 成交量
	 */
	private double volume;

	/**
	 * 成交额
	 */
	private double turnover;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Float getOpeningPrice() {
		return openingPrice;
	}

	public void setOpeningPrice(Float openingPrice) {
		this.openingPrice = openingPrice;
	}

	public Float getClosingPrice() {
		return closingPrice;
	}

	public void setClosingPrice(Float closingPrice) {
		this.closingPrice = closingPrice;
	}

	public Float getHeightPrice() {
		return heightPrice;
	}

	public void setHeightPrice(Float heightPrice) {
		this.heightPrice = heightPrice;
	}

	public double getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(double lowPrice) {
		this.lowPrice = lowPrice;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getChangeRate() {
		return changeRate;
	}

	public void setChangeRate(double changeRate) {
		this.changeRate = changeRate;
	}

	public double getChangeAmount() {
		return changeAmount;
	}

	public void setChangeAmount(double changeAmount) {
		this.changeAmount = changeAmount;
	}

	public double getHandover() {
		return handover;
	}

	public void setHandover(double handover) {
		this.handover = handover;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

}
