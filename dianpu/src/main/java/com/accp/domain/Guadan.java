package com.accp.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Guadan {
    private Integer gdid;

    private String ddno;

    private String spid;

    private Integer spnum;

    private Float spprice;

    private Integer dpid;

    private Integer hyid;

    private String cjno;
    
    private String hyname;
    
    private String djzhekou;
    
	public String getDjzhekou() {
		return djzhekou;
	}

	public void setDjzhekou(String djzhekou) {
		this.djzhekou = djzhekou;
	}
    
    private List<Guadanxiang> list;
    
    public String getHyname() {
		return hyname;
	}

	public void setHyname(String hyname) {
		this.hyname = hyname;
	}

	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT")
    private Date gddate;
    
    public Date getGddate() {
		return gddate;
	}

	public void setGddate(Date gddate) {
		this.gddate = gddate;
	}

	public List<Guadanxiang> getList() {
		return list;
	}

	public void setList(List<Guadanxiang> list) {
		this.list = list;
	}

	public String getCjno() {
		return cjno;
	}

	public void setCjno(String cjno) {
		this.cjno = cjno;
	}

	public Integer getGdid() {
        return gdid;
    }

    public void setGdid(Integer gdid) {
        this.gdid = gdid;
    }

    public String getDdno() {
        return ddno;
    }

    public void setDdno(String ddno) {
        this.ddno = ddno;
    }

    public String getSpid() {
        return spid;
    }

    public void setSpid(String spid) {
        this.spid = spid;
    }

    public Integer getSpnum() {
        return spnum;
    }

    public void setSpnum(Integer spnum) {
        this.spnum = spnum;
    }

    public Float getSpprice() {
        return spprice;
    }

    public void setSpprice(Float spprice) {
        this.spprice = spprice;
    }

    public Integer getDpid() {
        return dpid;
    }

    public void setDpid(Integer dpid) {
        this.dpid = dpid;
    }

    public Integer getHyid() {
        return hyid;
    }

    public void setHyid(Integer hyid) {
        this.hyid = hyid;
    }
}