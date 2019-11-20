package com.accp.domain;

public class Quanxian {
    private Integer qxid;

    private String qxname;

    private Integer qxlbid;
    
    private String qxlbname;

    private Integer qxlb;
    
    
    public Integer getQxlb() {
		return qxlb;
	}

	public void setQxlb(Integer qxlb) {
		this.qxlb = qxlb;
	}

	public String getQxlbname() {
		return qxlbname;
	}

	public void setQxlbname(String qxlbname) {
		this.qxlbname = qxlbname;
	}

	public Integer getQxid() {
        return qxid;
    }

    public void setQxid(Integer qxid) {
        this.qxid = qxid;
    }

    public String getQxname() {
        return qxname;
    }

    public void setQxname(String qxname) {
        this.qxname = qxname;
    }

    public Integer getQxlbid() {
        return qxlbid;
    }

    public void setQxlbid(Integer qxlbid) {
        this.qxlbid = qxlbid;
    }
}