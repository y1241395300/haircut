package cn.haircut.mapper;

import cn.haircut.entity.HairUser;
import cn.haircut.entity.HairUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HairUserMapper {
    int countByExample(HairUserExample example);

    int deleteByExample(HairUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HairUser record);

    int insertSelective(HairUser record);

    List<HairUser> selectByExample(HairUserExample example);

    HairUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HairUser record, @Param("example") HairUserExample example);

    int updateByExample(@Param("record") HairUser record, @Param("example") HairUserExample example);

    int updateByPrimaryKeySelective(HairUser record);

    int updateByPrimaryKey(HairUser record);
}