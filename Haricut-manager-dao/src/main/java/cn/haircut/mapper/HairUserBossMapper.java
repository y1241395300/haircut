package cn.haircut.mapper;

import cn.haircut.entity.HairUserBoss;
import cn.haircut.entity.HairUserBossExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HairUserBossMapper {
    int countByExample(HairUserBossExample example);

    int deleteByExample(HairUserBossExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(HairUserBoss record);

    int insertSelective(HairUserBoss record);

    List<HairUserBoss> selectByExample(HairUserBossExample example);

    HairUserBoss selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") HairUserBoss record, @Param("example") HairUserBossExample example);

    int updateByExample(@Param("record") HairUserBoss record, @Param("example") HairUserBossExample example);

    int updateByPrimaryKeySelective(HairUserBoss record);

    int updateByPrimaryKey(HairUserBoss record);
}