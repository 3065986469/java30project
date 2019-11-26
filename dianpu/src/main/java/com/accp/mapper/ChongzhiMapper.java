package com.accp.mapper;

import com.accp.domain.Chongzhi;
import com.accp.domain.ChongzhiExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ChongzhiMapper {
    int countByExample(ChongzhiExample example);

    int deleteByExample(ChongzhiExample example);

    int deleteByPrimaryKey(Integer czid);

    int insert(Chongzhi record);

    int insertSelective(Chongzhi record);

    List<Chongzhi> selectByExample(ChongzhiExample example);

    Chongzhi selectByPrimaryKey(Integer czid);

    int updateByExampleSelective(@Param("record") Chongzhi record, @Param("example") ChongzhiExample example);

    int updateByExample(@Param("record") Chongzhi record, @Param("example") ChongzhiExample example);

    int updateByPrimaryKeySelective(Chongzhi record);

    int updateByPrimaryKey(Chongzhi record);
    
    int czadd(Chongzhi record);
    
    @Select("SELECT v.vname,v.`vphone`,c.* FROM chongzhi AS c,vip AS v \r\n" + 
    		"WHERE c.vid=v.vid")
    List<Chongzhi> pageQuery();
    
    @Select("SELECT v.vname,v.`vphone`,c.* FROM chongzhi AS c,vip AS v \r\n" + 
    		"WHERE c.vid=v.vid AND v.vname LIKE CONCAT('%',#{vname},'%')")
    List<Chongzhi> pageQueryVname(String vname);
    
    @Select("SELECT v.vname,v.`vphone`,c.* FROM chongzhi AS c,vip AS v \r\n" + 
    		"WHERE c.vid=v.vid AND c.czdate>=#{date} AND c.czdate<=#{dates}")
    List<Chongzhi> pageQueryDate(String date,String dates);
    
    
    @Select("SELECT v.vname,v.`vphone`,c.* FROM chongzhi AS c,vip AS v \r\n" + 
    		"WHERE c.vid=v.vid AND c.czdate>=#{date} AND c.czdate<=#{dates} AND v.vname LIKE CONCAT('%',#{vname},'%')")
    List<Chongzhi> pageQueryVnameDate(String date,String dates,String vname);
}