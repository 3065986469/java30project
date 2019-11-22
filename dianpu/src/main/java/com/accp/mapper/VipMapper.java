package com.accp.mapper;

import com.accp.domain.Vip;
import com.accp.domain.VipExample;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface VipMapper {
    int countByExample(VipExample example);

    int deleteByExample(VipExample example);

    int deleteByPrimaryKey(Integer vid);

    int insert(Vip record);

    int insertSelective(Vip record);

    List<Vip> selectByExample(VipExample example);

    Vip selectByPrimaryKey(Integer vid);

    int updateByExampleSelective(@Param("record") Vip record, @Param("example") VipExample example);

    int updateByExample(@Param("record") Vip record, @Param("example") VipExample example);

    int updateByPrimaryKeySelective(Vip record);

    int updateByPrimaryKey(Vip record);
    
    @Select("SELECT v.*,(SELECT COUNT(vid) FROM  chenjiao AS cj WHERE cj.vid=v.`vid`)AS `count`,\r\n" + 
    		"(SELECT	SUM(cjprice) FROM chenjiao AS cj WHERE cj.vid=v.vid)AS price,\r\n" + 
    		"(SELECT COUNT(cj.cjdate) FROM chenjiao AS cj WHERE DATE_SUB(CURDATE(),INTERVAL 7 DAY)<=cjdate AND cj.vid=v.`vid`)AS jqcount,d.`djname`\r\n" + 
    		"FROM vip AS v,vipdengji AS d \r\n" + 
    		"WHERE  v.`djid`=d.`djid`")
    List<Vip> vipPage();
    
    @Select("SELECT v.*,(SELECT COUNT(vid) FROM  chenjiao AS cj WHERE cj.vid=v.`vid`)AS `count`,\r\n" + 
    		"(SELECT	SUM(cjprice) FROM chenjiao AS cj WHERE cj.vid=v.vid)AS price,\r\n" + 
    		"(SELECT COUNT(cj.cjdate) FROM chenjiao AS cj WHERE DATE_SUB(CURDATE(),INTERVAL 7 DAY)<=cjdate AND cj.vid=v.`vid`)AS jqcount,d.`djname`\r\n" + 
    		"FROM vip AS v,vipdengji AS d\r\n" + 
    		"WHERE  v.`djid`=d.`djid`AND v.`djid`=#{djid}")
    List<Vip> vipPagedijd(int djid);
    
    @Select("SELECT v.*,(SELECT COUNT(vid) FROM  chenjiao AS cj WHERE cj.vid=v.`vid`)AS `count`,\r\n" + 
    		"(SELECT	SUM(cjprice) FROM chenjiao AS cj WHERE cj.vid=v.vid)AS price,\r\n" + 
    		"(SELECT COUNT(cj.cjdate) FROM chenjiao AS cj WHERE DATE_SUB(CURDATE(),INTERVAL 7 DAY)<=cjdate AND cj.vid=v.`vid`)AS jqcount,d.`djname`\r\n" + 
    		"FROM vip AS v,vipdengji AS d \r\n" + 
    		"WHERE  v.`djid`=d.`djid`AND v.`vname` LIKE CONCAT(#{vname},'%')")
    List<Vip> vipPageVname(String vname);
    
    @Select("SELECT v.*,(SELECT COUNT(vid) FROM  chenjiao AS cj WHERE cj.vid=v.`vid`)AS `count`,\r\n" + 
    		"(SELECT	SUM(cjprice) FROM chenjiao AS cj WHERE cj.vid=v.vid)AS price,\r\n" + 
    		"(SELECT COUNT(cj.cjdate) FROM chenjiao AS cj WHERE DATE_SUB(CURDATE(),INTERVAL 7 DAY)<=cjdate AND cj.vid=v.`vid`)AS jqcount,d.`djname`\r\n" + 
    		"FROM vip AS v,vipdengji AS d \r\n" + 
    		"WHERE  v.`djid`=d.`djid`AND v.`djid`=#{djid} AND v.`vname` LIKE CONCAT(#{vname},'%')")
    List<Vip> vipPagev(int djid,String vname);
    
    @Select("SELECT v.*,(SELECT d.`djname` FROM vipdengji AS d WHERE d.`djid`=v.djid)AS djname FROM vip AS v WHERE v.vid=#{vid}")
    Vip vipQueryById(int vid);
    
    
    int hyupd(Vip record);
    
    @Select("SELECT v.vid as vid,v.vyue as vyue,v.vname as vname,SUM(cj.cjprice) as chengjiao,vd.djname as djname\r\n" + 
    		"FROM `vip` v\r\n" + 
    		"INNER JOIN `vipdengji` vd ON v.djid=vd.djid AND vd.sid=1\r\n" + 
    		"INNER JOIN `chenjiao` cj ON v.vid=cj.vid\r\n" + 
    		"GROUP BY v.vid")
    List<Vip> queryAllHuiYuan();
    
    @Select("SELECT v.vid as vid,v.vyue as vyue,v.vname as vname,SUM(cj.cjprice) as chengjiao,vd.djname as djname\r\n" + 
    		"FROM `vip` v\r\n" + 
    		"INNER JOIN `vipdengji` vd ON v.djid=vd.djid AND vd.sid=1\r\n" + 
    		"INNER JOIN `chenjiao` cj ON v.vid=cj.vid\r\n" + 
    		"WHERE vd.djid=#{djid}\r\n" + 
    		"GROUP BY v.vid")
    List<Vip> queryHuiYuanByLeiBie(Integer djid);
    
    @Select("SELECT vd.djzhekou\r\n" + 
    		"FROM `vip` v,`vipdengji` vd\r\n" + 
    		"WHERE v.djid=vd.djid AND v.vid=#{vid}")
    String shiyong(Integer vid);
    
    @Insert("INSERT INTO `dianpu`.`vip` (`vid`,`djid`,`vname`,`vphone`,`vyue`,`vjifen`,`vpwd`,`vaddress`,`sid`) \r\n" + 
    		"	VALUES(#{vip.vid},#{vip.djid},#{vip.vname},#{vip.vphone},#{vip.vyue},#{vip.vjifen},#{vip.vpwd},#{vip.vaddress},#{vip.sid}) ")
	int hyadd(Vip vip);
}