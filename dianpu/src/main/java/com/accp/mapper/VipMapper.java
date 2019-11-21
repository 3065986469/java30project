package com.accp.mapper;

import com.accp.domain.Vip;
import com.accp.domain.VipExample;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface VipMapper {
    int countByExample(VipExample example);

    int deleteByExample(VipExample example);

    int deleteByPrimaryKey(Integer vid);

    int insert(Vip record);

    int insertSelective(Vip record);

    List<Vip> selectByExample(VipExample example);

    Vip selectByPrimaryKey(Integer vid);

    int updateByExampleSelective(@Param("record") Vip record, @Param("example") VipExample example);

    int updateByExample(@Param("record") Vip record, @Param("example") VipExample example);

    int updateByPrimaryKeySelective(Vip record);

    int updateByPrimaryKey(Vip record);
    
    @Insert("INSERT INTO `dianpu`.`vip` (`vid`,`djid`,`vname`,`vphone`,`vyue`,`vjifen`,`vpwd`,`vaddress`,`sid`) \r\n" + 
    		"	VALUES(#{vip.vid},#{vip.djid},#{vip.vname},#{vip.vphone},#{vip.vyue},#{vip.vjifen},#{vip.vpwd},#{vip.vaddress},#{vip.sid}) ")
	int hyadd(Vip vip);
}