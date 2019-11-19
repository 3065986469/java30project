package com.accp.mapper;

import com.accp.domain.Dianpu;
import com.accp.domain.DianpuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface DianpuMapper {
    int countByExample(DianpuExample example);

    int deleteByExample(DianpuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dianpu record);

    int insertSelective(Dianpu record);

    List<Dianpu> selectByExample(DianpuExample example);

    Dianpu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dianpu record, @Param("example") DianpuExample example);

    int updateByExample(@Param("record") Dianpu record, @Param("example") DianpuExample example);

    int updateByPrimaryKeySelective(Dianpu record);

    int updateByPrimaryKey(Dianpu record);
    
    @Select("SELECT b.ygname AS ygname,a.dpid as dpid,a.dpname AS dpname,a.dplianxiren AS dplianxiren,a.dpphone AS dpphone,a.dpaddress AS dpaddress,COUNT(b.dpid) AS COUNT\r\n" + 
    		"    		FROM `dianpu` a,`yuangong` b\r\n" + 
    		"    		WHERE a.sid=1\r\n" + 
    		"    		 GROUP BY a.dpid")
    List<Dianpu> queryAllDianPu();
    
    @Select("SELECT MAX(dpid)\r\n" + 
    		"FROM dianpu\r\n" + 
    		"")
    String queryDianPuId();
}