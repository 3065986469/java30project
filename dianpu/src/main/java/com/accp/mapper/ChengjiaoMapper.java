package com.accp.mapper;

import com.accp.domain.Chengjiao;
import com.accp.domain.ChengjiaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ChengjiaoMapper {
    int countByExample(ChengjiaoExample example);

    int deleteByExample(ChengjiaoExample example);

    int deleteByPrimaryKey(Integer cjid);

    int insert(Chengjiao record);

    int insertSelective(Chengjiao record);

    List<Chengjiao> selectByExample(ChengjiaoExample example);

    Chengjiao selectByPrimaryKey(Integer cjid);

    int updateByExampleSelective(@Param("record") Chengjiao record, @Param("example") ChengjiaoExample example);

    int updateByExample(@Param("record") Chengjiao record, @Param("example") ChengjiaoExample example);

    int updateByPrimaryKeySelective(Chengjiao record);

    int updateByPrimaryKey(Chengjiao record);
    
    @Select("SELECT c.*,v.vname,v.vphone FROM chenjiao AS c,vip AS v WHERE c.vid=v.vid")
    List<Chengjiao> query();
    
    @Select("SELECT c.*,v.vname,v.vphone FROM chenjiao AS c,vip AS v WHERE c.vid=v.vid AND v.vname LIKE CONCAT('%',#{vname},'%')")
    List<Chengjiao> pageQueryVname(String vname);
    
    @Select("SELECT c.*,v.vname,v.vphone FROM chenjiao AS c,vip AS v WHERE c.vid=v.vid AND c.cjdate>=#{date} AND c.cjdate<=#{dates}")
    List<Chengjiao> pageQueryDate(String date,String dates);
    
    @Select("SELECT c.*,v.vname,v.vphone FROM chenjiao AS c,vip AS v WHERE c.vid=v.vid AND c.cjdate>=#{date} AND c.cjdate<=#{dates} AND v.vname LIKE CONCAT('%',#{vname},'%')")
    List<Chengjiao> pageQueryVnameDate(String date,String dates,String vname);

}