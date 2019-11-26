package com.accp.mapper;

import com.accp.domain.Guadanxiang;
import com.accp.domain.GuadanxiangExample;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
    
    int guadan(@Param("list")List<Guadanxiang> list,@Param("cjno")String cjno);
    
    @Select("SELECT sp.spid AS spid,sp.spname AS spname,gdx.`spnum` AS spnum,gdx.`spdanjia` AS spdanjia,v.vname AS hyname,gd.`hyid` AS hyid,gd.`spprice` AS spprice,vdj.djzhekou AS djzhekou\r\n" + 
    		"FROM `guadan` gd\r\n" + 
    		"INNER JOIN `guadanxiang` gdx ON gd.`cjno`=gdx.`cjno`\r\n" + 
    		"INNER JOIN `shangpin` sp ON gdx.`spid`=sp.spid\r\n" + 
    		"INNER JOIN `vip` v ON gd.`hyid`=v.`vid`\r\n" + 
    		"INNER JOIN `vipdengji` vdj ON v.`djid`=vdj.djid\r\n" + 
    		"WHERE gd.`cjno`=#{cjon}")
    List<Guadanxiang> queryGuaDanByNo(String cjno);
    
    
    
    @Select("SELECT sp.spid AS spid,sp.spname AS spname,gdx.`spnum` AS spnum,gdx.`spdanjia` AS spdanjia,gd.`spprice` AS spprice\r\n" + 
    		"    FROM `guadan` gd\r\n" + 
    		"    INNER JOIN `guadanxiang` gdx ON gd.`cjno`=gdx.`cjno`\r\n" + 
    		"    INNER JOIN `shangpin` sp ON gdx.`spid`=sp.spid\r\n" + 
    		"    WHERE gd.`cjno`=#{cjno}")
    List<Guadanxiang> queryGuaDanByNo2(String cjno);
    
    @Delete("delete from guadanxiang where cjno=#{cjno}")
    int deleteGuaDanByNo(String cjno);
}