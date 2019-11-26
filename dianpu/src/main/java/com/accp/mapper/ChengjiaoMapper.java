package com.accp.mapper;

import com.accp.domain.Chengjiao;
import com.accp.domain.ChengjiaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}