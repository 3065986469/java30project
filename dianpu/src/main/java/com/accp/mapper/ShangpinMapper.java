package com.accp.mapper;

import com.accp.domain.Shangpin;
import com.accp.domain.ShangpinExample;
import com.accp.domain.Shangpinxiang;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ShangpinMapper {
    int countByExample(ShangpinExample example);

    int deleteByExample(ShangpinExample example);

    int deleteByPrimaryKey(Integer spid);

    int insert(Shangpin record);

    int insertSelective(Shangpin record);

    List<Shangpin> selectByExample(ShangpinExample example);

    Shangpin selectByPrimaryKey(Integer spid);

    int updateByExampleSelective(@Param("record") Shangpin record, @Param("example") ShangpinExample example);

    int updateByExample(@Param("record") Shangpin record, @Param("example") ShangpinExample example);

    int updateByPrimaryKeySelective(Shangpin record);

    int updateByPrimaryKey(Shangpin record);
    
    List<Shangpin> selectspguanli(Shangpin record);
    
    int deleteBYid(Integer spid);
    
    Shangpin selectspno(String spno);
    
    List<Shangpinxiang> selectspxno(String spno);
    
    @Select("select * from shangpin")
    List<Shangpin> yyquery();
    
}