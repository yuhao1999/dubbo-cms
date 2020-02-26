package com.yh.pojo;

import java.io.Serializable;

public class Condition implements Serializable{

	private static final long serialVersionUID = -2774964706612350388L;
	private String startDate;
	private String endDate;
	private String orderMethod;
	private String orderName;

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getOrderMethod() {
		return orderMethod;
	}

	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	@Override
	public String toString() {
		return "Condition [startDate=" + startDate + ", endDate=" + endDate + ", orderMethod=" + orderMethod
				+ ", orderName=" + orderName + "]";
	}

}
