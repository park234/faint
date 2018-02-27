package com.faint.domain;

import java.util.Date;

public class PostVO {
	private int ID;
	private int USERID;
	private int CATEID;
	private String CAPTION;
	private Date REGDATE;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getUSERID() {
		return USERID;
	}
	public void setUSERID(int uSERID) {
		USERID = uSERID;
	}
	public int getCATEID() {
		return CATEID;
	}
	public void setCATEID(int cATEID) {
		CATEID = cATEID;
	}
	public String getCAPTION() {
		return CAPTION;
	}
	public void setCAPTION(String cAPTION) {
		CAPTION = cAPTION;
	}
	public Date getREGDATE() {
		return REGDATE;
	}
	public void setREGDATE(Date rEGDATE) {
		REGDATE = rEGDATE;
	}
	@Override
	public String toString() {
		return "PostVO [ID=" + ID + ", USERID=" + USERID + ", CATEID=" + CATEID + ", CAPTION=" + CAPTION + ", REGDATE="
				+ REGDATE + "]";
	}
	
	
	
	
}
