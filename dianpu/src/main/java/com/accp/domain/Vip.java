package com.accp.domain;

public class Vip {
    private Integer vid;

    private Integer djid;

    private String vname;

    private String vphone;

    private Float vyue;

    private Integer vjifen;

    private String vpwd;

    private String vaddress;

    private Integer sid;
    
    private int count;			//成交次数
    
    private String price;		//成交金额
    
    private int jqcount ;		//最近成交次数
    
    private String djname;		//等级名字

    public String getDjname() {
		return djname;
	}

	public void setDjname(String djname) {
		this.djname = djname;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getJqcount() {
		return jqcount;
	}

	public void setJqcount(int jqcount) {
		this.jqcount = jqcount;
	}

	public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getDjid() {
        return djid;
    }

    public void setDjid(Integer djid) {
        this.djid = djid;
    }

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

    public Float getVyue() {
        return vyue;
    }

    public void setVyue(Float vyue) {
        this.vyue = vyue;
    }

    public Integer getVjifen() {
        return vjifen;
    }

    public void setVjifen(Integer vjifen) {
        this.vjifen = vjifen;
    }

    public String getVpwd() {
        return vpwd;
    }

    public void setVpwd(String vpwd) {
        this.vpwd = vpwd;
    }

    public String getVaddress() {
        return vaddress;
    }

    public void setVaddress(String vaddress) {
        this.vaddress = vaddress;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
}