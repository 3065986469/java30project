package com.accp.domain;

import java.util.Date;
import java.util.List;

public class Chengjiao {
    private Integer cjid;

    private String cjno;

    private Integer hyid;

    private Integer cjnum;

    private Float cjprice;

    private String cjfangshi;

    private Date cjdate;

    private Integer vid;
    
    private List<Chengjiaoxiang> list;

    public List<Chengjiaoxiang> getList() {
		return list;
	}

	public void setList(List<Chengjiaoxiang> list) {
		this.list = list;
	}

	public Integer getCjid() {
        return cjid;
    }

    public void setCjid(Integer cjid) {
        this.cjid = cjid;
    }

    public String getCjno() {
        return cjno;
    }

    public void setCjno(String cjno) {
        this.cjno = cjno;
    }

    public Integer getHyid() {
        return hyid;
    }

    public void setHyid(Integer hyid) {
        this.hyid = hyid;
    }

    public Integer getCjnum() {
        return cjnum;
    }

    public void setCjnum(Integer cjnum) {
        this.cjnum = cjnum;
    }

    public Float getCjprice() {
        return cjprice;
    }

    public void setCjprice(Float cjprice) {
        this.cjprice = cjprice;
    }

    public String getCjfangshi() {
        return cjfangshi;
    }

    public void setCjfangshi(String cjfangshi) {
        this.cjfangshi = cjfangshi;
    }

    public Date getCjdate() {
        return cjdate;
    }

    public void setCjdate(Date cjdate) {
        this.cjdate = cjdate;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }
}