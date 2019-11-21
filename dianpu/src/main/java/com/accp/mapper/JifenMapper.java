package com.accp.mapper;

import com.accp.domain.Jifen;
import com.accp.domain.JifenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface JifenMapper {
    int countByExample(JifenExample example);

    int deleteByExample(JifenExample example);

    int insert(Jifen record);

    int insertSelective(Jifen record);

    List<Jifen> selectByExample(JifenExample example);

    int updateByExampleSelective(@Param("record") Jifen record, @Param("example") JifenExample example);

    int updateByExample(@Param("record") Jifen record, @Param("example") JifenExample example);
    
    @Select("SELECT * FROM jifen")
    Jifen jfquery();
    
    @Update("UPDATE jifen SET sid=#{sid}")
    int jfupd(int sid);
    
    @Update("UPDATE jifen SET `num`=#{num}")
    int jfupds(int num);
}