package com.example.demo.common.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * 配置统一格式返回数据类
 * 
 * @author 13
 */
@JsonInclude(Include.NON_NULL)
public class ResponseMsg implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public int code; // 状态码
	public String message; // 消息
	public Object data; // 数据

	public ResponseMsg() {

	}

	public ResponseMsg(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public ResponseMsg(int code, Object data) {
		super();
		this.code = code;
		this.data = data;
	}

	public ResponseMsg(int code, String message, Object data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public static ResponseMsg responseMsgOK(String message, Object data) {
		return new ResponseMsg(HttpStatus.OK.value(), message, data);
	}

	public static ResponseMsg responseMsgOK(String message) {
		return new ResponseMsg(HttpStatus.OK.value(), message);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}