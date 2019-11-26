package com.accp.domain;

import java.util.Date;


import com.fasterxml.jackson.annotation.JsonFormat;

public class Chongzhi {
    private Integer czid;
    
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date czdate;

    private String czweixin;

    private String czname;

    private String czphone;

    private Float czprice;

    private Integer czzengsong;

    private String czbezhu;
    
    private int vid;
    
    private String vname;
    
    private String vphone;

    public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getVphone() {
		return vphone;
	}

	public void setVphone(String vphone) {
		this.vphone = vphone;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public Integer getCzid() {
        return czid;
    }

    public void setCzid(Integer czid) {
        this.czid = czid;
    }

    public Date getCzdate() {
        return czdate;
    }

    public void setCzdate(Date czdate) {
        this.czdate = czdate;
    }

    public String getCzweixin() {
        return czweixin;
    }

    public void setCzweixin(String czweixin) {
        this.czweixin = czweixin;
    }

    public String getCzname() {
        return czname;
    }

    public void setCzname(String czname) {
        this.czname = czname;
    }

    public String getCzphone() {
        return czphone;
    }

    public void setCzphone(String czphone) {
        this.czphone = czphone;
    }

    public Float getCzprice() {
        return czprice;
    }

    public void setCzprice(Float czprice) {
        this.czprice = czprice;
    }

    public Integer getCzzengsong() {
        return czzengsong;
    }

    public void setCzzengsong(Integer czzengsong) {
        this.czzengsong = czzengsong;
    }

    public String getCzbezhu() {
        return czbezhu;
    }

    public void setCzbezhu(String czbezhu) {
        this.czbezhu = czbezhu;
    }
}