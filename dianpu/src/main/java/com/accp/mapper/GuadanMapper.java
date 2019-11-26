package com.accp.mapper;

import com.accp.domain.Guadan;
import com.accp.domain.GuadanExample;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface GuadanMapper {
    int countByExample(GuadanExample example);

    int deleteByExample(GuadanExample example);

    int deleteByPrimaryKey(Integer gdid);

    int insert(Guadan record);

    int insertSelective(Guadan record);

    List<Guadan> selectByExample(GuadanExample example);

    Guadan selectByPrimaryKey(Integer gdid);

    int updateByExampleSelective(@Param("record") Guadan record, @Param("example") GuadanExample example);

    int updateByExample(@Param("record") Guadan record, @Param("example") GuadanExample example);

    int updateByPrimaryKeySelective(Guadan record);

    int updateByPrimaryKey(Guadan record);
    
    @Insert("INSERT INTO `dianpu`.`guadan` (\r\n" + 
    		"  `cjno`,\r\n" + 
    		"  `spprice`,\r\n" + 
    		"  `hyid`,\r\n" + 
    		"  `gddate`\r\n" + 
    		") \r\n" + 
    		"VALUES\r\n" + 
    		"  (\r\n" + 
    		"    #{cjno},\r\n" + 
    		"    #{spprice},\r\n" + 
    		"    #{hyid},\r\n" + 
    		"    #{gddate}\r\n" + 
    		"  )")
    int guadan(Guadan guadan);
    
    @Select("select count(1) from guadan")
    String queryGuaDanNum();
    
    @Select("SELECT gd.cjno as cjno,gd.`gddate` AS gddate,v.`vname` AS hyname,gd.`spprice` AS spprice\r\n" + 
    		"FROM `guadan` gd\r\n" + 
    		"INNER JOIN `guadanxiang` gdx ON gd.`cjno`=gdx.`cjno`\r\n" + 
    		"INNER JOIN `vip` v ON gd.`hyid`=v.`vid`\r\n" + 
    		"GROUP BY gd.`cjno`")
    List<Guadan> queryGuaDan();
    
    @Select("SELECT gd.`gddate` AS gddate,v.`vid` AS hyid,v.`vname` AS hyname,gd.`spprice` AS spprice,vdj.djzhekou AS djzhekou\r\n" + 
    		"FROM `guadan` gd\r\n" + 
    		"INNER JOIN `guadanxiang` gdx ON gd.`cjno`=gdx.`cjno`\r\n" + 
    		"INNER JOIN `vip` v ON gd.`hyid`=v.`vid`\r\n" +
    		"INNER JOIN `vipdengji` vdj ON v.`djid`=vdj.djid\r\n" + 
    		"WHERE gd.`cjno`= #{cjno}\r\n" + 
    		"GROUP BY gd.`cjno`")
    Guadan queryGuaDanByNo(String cjno);
    
    @Select("SELECT gd.`gddate` AS gddate,gd.`spprice` AS spprice\r\n" + 
    		"FROM `guadan` gd\r\n" + 
    		"INNER JOIN `guadanxiang` gdx ON gd.`cjno`=gdx.`cjno`\r\n" + 
    		"WHERE gd.`cjno`= #{cjno}\r\n" + 
    		"GROUP BY gd.`cjno`")
    Guadan queryGuaDanByNo2(String cjno);
    
    @Select("select * from guadan where cjno=#{cjno}")
    Guadan queryGuaDanHuiYuan(String cjno);
    
    @Delete("delete from guadan where cjno=#{cjno}")
    int deleteGuaDanByNo(String cjno);
}