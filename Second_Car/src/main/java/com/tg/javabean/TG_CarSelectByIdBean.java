package com.tg.javabean;

import com.tg.domain.TG_Car;

public class TG_CarSelectByIdBean {

	private int code;
	private String msg;
	private TG_CarAdapter car;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public TG_CarAdapter getCar() {
		return car;
	}

	public void setCar(TG_CarAdapter car) {
		this.car = car;
	}
}
