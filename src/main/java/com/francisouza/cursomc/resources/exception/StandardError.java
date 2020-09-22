package com.francisouza.cursomc.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Long tipeStamp;
	
	public StandardError(Integer status, String msg, Long tipeStamp) {
		super();
		this.status = status;
		this.msg = msg;
		this.tipeStamp = tipeStamp;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Long getTipeStamp() {
		return tipeStamp;
	}
	public void setTipeStamp(Long tipeStamp) {
		this.tipeStamp = tipeStamp;
	}
}
