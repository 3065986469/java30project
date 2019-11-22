package com.accp.mapper;

import com.accp.domain.Guadanxiang;
import com.accp.domain.GuadanxiangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GuadanxiangMapper {
    int countByExample(GuadanxiangExample example);

    int deleteByExample(GuadanxiangExample example);

    int deleteByPrimaryKey(Integer gdxid);

    int insert(Guadanxiang record);

    int insertSelective(Guadanxiang record);

    List<Guadanxiang> selectByExample(GuadanxiangExample example);

    Guadanxiang selectByPrimaryKey(Integer gdxid);

    int updateByExampleSelective(@Param("record") Guadanxiang record, @Param("example") GuadanxiangExample example);

    int updateByExample(@Param("record") Guadanxiang record, @Param("example") GuadanxiangExample example);

    int updateByPrimaryKeySelective(Guadanxiang record);

    int updateByPrimaryKey(Guadanxiang record);
}