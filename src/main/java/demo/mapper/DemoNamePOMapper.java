package demo.mapper;

import demo.po.DemoNamePO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoNamePOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DemoNamePO record);

    int insertSelective(DemoNamePO record);

    DemoNamePO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DemoNamePO record);

    int updateByPrimaryKey(DemoNamePO record);
}