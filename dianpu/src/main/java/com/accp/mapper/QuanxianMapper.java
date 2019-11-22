package com.accp.mapper;

import com.accp.domain.Quanxian;
import com.accp.domain.QuanxianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface QuanxianMapper {
    int countByExample(QuanxianExample example);

    int deleteByExample(QuanxianExample example);

    int deleteByPrimaryKey(Integer qxid);

    int insert(Quanxian record);

    int insertSelective(Quanxian record);

    List<Quanxian> selectByExample(QuanxianExample example);

    Quanxian selectByPrimaryKey(Integer qxid);

    int updateByExampleSelective(@Param("record") Quanxian record, @Param("example") QuanxianExample example);

    int updateByExample(@Param("record") Quanxian record, @Param("example") QuanxianExample example);

    int updateByPrimaryKeySelective(Quanxian record);

    int updateByPrimaryKey(Quanxian record);
    
    @Select("SELECT qxlb,qxname as qxlbname\r\n" + 
    		"FROM quanxianleibie")
    List<Quanxian> queryQuanXianLeiBie();
    
    @Select("SELECT qxname,qxid,qxlbid\r\n" + 
    		"FROM `quanxian`")
    List<Quanxian> queryQuanXian();
    
    
}