package cn.haircut.mapper;

import cn.haircut.entity.HairUserDesigner;
import cn.haircut.entity.HairUserDesignerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HairUserDesignerMapper {
    int countByExample(HairUserDesignerExample example);

    int deleteByExample(HairUserDesignerExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(HairUserDesigner record);

    int insertSelective(HairUserDesigner record);

    List<HairUserDesigner> selectByExample(HairUserDesignerExample example);

    HairUserDesigner selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") HairUserDesigner record, @Param("example") HairUserDesignerExample example);

    int updateByExample(@Param("record") HairUserDesigner record, @Param("example") HairUserDesignerExample example);

    int updateByPrimaryKeySelective(HairUserDesigner record);

    int updateByPrimaryKey(HairUserDesigner record);
}