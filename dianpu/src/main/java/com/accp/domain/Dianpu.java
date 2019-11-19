package com.accp.domain;

public class Dianpu {
    private Integer id;

    private String dpid;

    private String dpname;

    private String dplianxiren;

    private String dpphone;

    private String dpaddress;

    private Integer sid;

    private String count;
    
    private String ygname;
    
    
    public String getYgname() {
		return ygname;
	}

	public void setYgname(String ygname) {
		this.ygname = ygname;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDpid() {
        return dpid;
    }

    public void setDpid(String dpid) {
        this.dpid = dpid;
    }

    public String getDpname() {
        return dpname;
    }

    public void setDpname(String dpname) {
        this.dpname = dpname;
    }

    public String getDplianxiren() {
        return dplianxiren;
    }

    public void setDplianxiren(String dplianxiren) {
        this.dplianxiren = dplianxiren;
    }

    public String getDpphone() {
        return dpphone;
    }

    public void setDpphone(String dpphone) {
        this.dpphone = dpphone;
    }

    public String getDpaddress() {
        return dpaddress;
    }

    public void setDpaddress(String dpaddress) {
        this.dpaddress = dpaddress;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
}