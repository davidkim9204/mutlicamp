package day19;

import java.io.Serializable;

public class Message implements Serializable{
	private int code;
	private String msg;
	private Serializable obj;
	
	
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
	public Serializable getObj() {
		return obj;
	}
	public void setObj(Serializable obj) {
		this.obj = obj;
	}
	
	

}
