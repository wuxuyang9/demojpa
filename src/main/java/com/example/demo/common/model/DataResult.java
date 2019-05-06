package com.example.demo.common.model;

import java.io.Serializable;
import java.util.List;

public class DataResult implements Serializable {
	private boolean rel;
	private String msg;
	private List<?> list;
	private Long count;
	public boolean isRel() {
		return rel;
	}
	public void setRel(boolean rel) {
		this.rel = rel;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

}
