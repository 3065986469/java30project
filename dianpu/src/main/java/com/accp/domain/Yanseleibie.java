package com.accp.domain;

import java.util.List;

public class Yanseleibie {
    private Integer yslbid;

    private String yslbtype;
    
    private List<Yanse> ys;

    public List<Yanse> getYs() {
		return ys;
	}

	public void setYs(List<Yanse> ys) {
		this.ys = ys;
	}

	public Integer getYslbid() {
        return yslbid;
    }

    public void setYslbid(Integer yslbid) {
        this.yslbid = yslbid;
    }

    public String getYslbtype() {
        return yslbtype;
    }

    public void setYslbtype(String yslbtype) {
        this.yslbtype = yslbtype;
    }
}