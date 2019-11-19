package com.accp.mapper;

import com.accp.domain.Yuangong;
import com.accp.domain.YuangongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface YuangongMapper {
    int countByExample(YuangongExample example);

    int deleteByExample(YuangongExample example);

    int deleteByPrimaryKey(Integer ygid);

    int insert(Yuangong record);

    int insertSelective(Yuangong record);

    List<Yuangong> selectByExample(YuangongExample example);

    Yuangong selectByPrimaryKey(Integer ygid);

    int updateByExampleSelective(@Param("record") Yuangong record, @Param("example") YuangongExample example);

    int updateByExample(@Param("record") Yuangong record, @Param("example") YuangongExample example);

    int updateByPrimaryKeySelective(Yuangong record);

    int updateByPrimaryKey(Yuangong record);
    
    @Select("SELECT * FROM `yuangong`\r\n" + 
    		"WHERE `ygname`=#{name} AND ygpwd=#{pwd} AND sid=1")
    Yuangong queryByNameAndPwd(@Param("name")String name,@Param("pwd")String pwd);
    
    @Select("SELECT a.ygid  as ygid,a.ygname as ygname,b.dpname as dpname,c.zwname as zwname\r\n" + 
    		"FROM `yuangong` a,`dianpu` b,`zhiwei` c\r\n" + 
    		"WHERE a.dpid=b.dpid AND a.sid=1 AND a.zwid=c.zwid AND c.sid=1")
    List<Yuangong> queryAllYuanGong();
    
    @Select("SELECT a.ygid,a.ygname,b.dpname,c.zwname\r\n" + 
    		"FROM `yuangong` a,`dianpu` b,`zhiwei` c\r\n" + 
    		"WHERE a.dpid=b.dpid AND a.sid=1 AND a.zwid=c.zwid AND c.sid=1 AND a.ygname LIKE '%${ygname}%'")
    List<Yuangong> yuangongguanliquery(String ygname);
    
    
    @Select("SELECT a.ygid,a.ygname,b.dpname,c.zwname\r\n" + 
    		"    FROM `yuangong` a,`dianpu` b,`zhiwei` c\r\n" + 
    		"    WHERE a.dpid=b.dpid AND a.sid=1 AND a.zwid=c.zwid AND c.sid=1 AND b.dpid=#{dpid}")
    List<Yuangong> yuangongguanliqueryByDianPu(Integer dpid);
    
    @Select("SELECT a.ygid,a.ygname,b.dpname,c.zwname\r\n" + 
    		"    FROM `yuangong` a,`dianpu` b,`zhiwei` c\r\n" + 
    		"    WHERE a.dpid=b.dpid AND a.sid=1 AND a.zwid=c.zwid AND c.sid=1 AND c.zwid=#{zwid}")
    List<Yuangong> yuangongguanliqueryByZhiWei(Integer zwid);
}