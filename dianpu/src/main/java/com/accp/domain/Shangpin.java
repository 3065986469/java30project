package com.accp.domain;

import java.util.List;

public class Shangpin {
    private Integer spid;

    private String spno;

    private String spname;

    private Integer spcount;

    private Float spxiaoshou;

    private Float spchengben;

    private Integer lbid;

    private Integer dpid;

    private String spimg;

    private String spmiaoshu;

    private Integer sid;
    
    private String ysname;
    
    private String ccname;
    
    private String spxtm;
    
    private String spxcount;
    
    private List<Shangpinxiang> spx;
    
    private String lbname;
    
    public String getLbname() {
		return lbname;
	}

	public void setLbname(String lbname) {
		this.lbname = lbname;
	}

	public List<Shangpinxiang> getSpx() {
		return spx;
	}

	public void setSpx(List<Shangpinxiang> spx) {
		this.spx = spx;
	}

	public String getYsname() {
		return ysname;
	}

	public void setYsname(String ysname) {
		this.ysname = ysname;
	}

	public String getCcname() {
		return ccname;
	}

	public void setCcname(String ccname) {
		this.ccname = ccname;
	}

	public String getSpxtm() {
		return spxtm;
	}

	public void setSpxtm(String spxtm) {
		this.spxtm = spxtm;
	}

	public String getSpxcount() {
		return spxcount;
	}

	public void setSpxcount(String spxcount) {
		this.spxcount = spxcount;
	}

	public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }

    public String getSpno() {
        return spno;
    }

    public void setSpno(String spno) {
        this.spno = spno;
    }

    public String getSpname() {
        return spname;
    }

    public void setSpname(String spname) {
        this.spname = spname;
    }

    public Integer getSpcount() {
        return spcount;
    }

    public void setSpcount(Integer spcount) {
        this.spcount = spcount;
    }

    public Float getSpxiaoshou() {
        return spxiaoshou;
    }

    public void setSpxiaoshou(Float spxiaoshou) {
        this.spxiaoshou = spxiaoshou;
    }

    public Float getSpchengben() {
        return spchengben;
    }

    public void setSpchengben(Float spchengben) {
        this.spchengben = spchengben;
    }

    public Integer getLbid() {
        return lbid;
    }

    public void setLbid(Integer lbid) {
        this.lbid = lbid;
    }

    public Integer getDpid() {
        return dpid;
    }

    public void setDpid(Integer dpid) {
        this.dpid = dpid;
    }

    public String getSpimg() {
        return spimg;
    }

    public void setSpimg(String spimg) {
        this.spimg = spimg;
    }

    public String getSpmiaoshu() {
        return spmiaoshu;
    }

    public void setSpmiaoshu(String spmiaoshu) {
        this.spmiaoshu = spmiaoshu;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
}