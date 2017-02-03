package cn.hjycjc.dubbo.basis.entity;

import java.io.Serializable;

public class Result implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1228865288137877974L;

	private String code;
	
	private String msg;
	
	private String data;

	public Result() {
		// TODO Auto-generated constructor stub
	}

	public Result(String code, String msg, String data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Result [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}
}
