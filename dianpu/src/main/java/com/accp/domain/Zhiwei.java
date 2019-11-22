package com.accp.domain;

import java.util.List;

public class Zhiwei {
    private Integer zwid;

    private String zwname;

    private Integer dpid;

    private String qxid;

    private Integer sid;

    private String dpname;
    
    private List<String> qxids;
    
    public List<String> getQxids() {
		return qxids;
	}

	public void setQxids(List<String> qxids) {
		this.qxids = qxids;
	}

	public String getDpname() {
		return dpname;
	}

	public void setDpname(String dpname) {
		this.dpname = dpname;
	}

	public Integer getZwid() {
        return zwid;
    }

    public void setZwid(Integer zwid) {
        this.zwid = zwid;
    }

    public String getZwname() {
        return zwname;
    }

    public void setZwname(String zwname) {
        this.zwname = zwname;
    }

    public Integer getDpid() {
        return dpid;
    }

    public void setDpid(Integer dpid) {
        this.dpid = dpid;
    }

    public String getQxid() {
        return qxid;
    }

    public void setQxid(String qxid) {
        this.qxid = qxid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
}