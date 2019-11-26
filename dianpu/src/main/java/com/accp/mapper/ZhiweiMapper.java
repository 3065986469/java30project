package com.accp.mapper;

import com.accp.domain.Zhiwei;
import com.accp.domain.ZhiweiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ZhiweiMapper {
    int countByExample(ZhiweiExample example);

    int deleteByExample(ZhiweiExample example);

    int deleteByPrimaryKey(Integer zwid);

    int insert(Zhiwei record);

    int insertSelective(Zhiwei record);

    List<Zhiwei> selectByExample(ZhiweiExample example);

    Zhiwei selectByPrimaryKey(Integer zwid);

    int updateByExampleSelective(@Param("record") Zhiwei record, @Param("example") ZhiweiExample example);

    int updateByExample(@Param("record") Zhiwei record, @Param("example") ZhiweiExample example);

    int updateByPrimaryKeySelective(Zhiwei record);

    int updateByPrimaryKey(Zhiwei record);
    
    @Select("SELECT a.zwid as zwid,a.zwname as zwname,b.dpname as dpname\r\n" + 
    		"FROM `zhiwei` a,`dianpu` b\r\n" + 
    		"WHERE a.dpid=b.dpid AND a.sid=1 and b.sid=1")
    List<Zhiwei> queryAllZhiWei();
    
    @Select("SELECT a.zwid as zwid,a.zwname as zwname,b.dpname as dpname\r\n" + 
    		"FROM `zhiwei` a,`dianpu` b \r\n" + 
    		"WHERE a.dpid=b.dpid AND a.sid=1 and b.sid=1 group by a.zwname")
    List<Zhiwei> queryAllZhiWei2();
    
    @Select("SELECT zw.qxid\r\n" + 
    		"FROM `yuangong` yg\r\n" + 
    		"INNER JOIN `zhiwei` zw ON yg.zwid=zw.zwid\r\n" + 
    		"WHERE yg.ygid=#{ygid}")
    Zhiwei queryQuanXianByYuanGongId(Integer ygid);
}