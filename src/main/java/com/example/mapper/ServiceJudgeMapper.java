package com.example.mapper;

import com.example.model.ServiceJudge;
import com.example.model.ServiceJudgeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ServiceJudgeMapper {
    long countByExample(ServiceJudgeExample example);

    int deleteByExample(ServiceJudgeExample example);

    int deleteByPrimaryKey(String id);

    int insert(ServiceJudge record);

    int insertSelective(ServiceJudge record);

    List<ServiceJudge> selectByExample(ServiceJudgeExample example);

    ServiceJudge selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ServiceJudge record, @Param("example") ServiceJudgeExample example);

    int updateByExample(@Param("record") ServiceJudge record, @Param("example") ServiceJudgeExample example);

    int updateByPrimaryKeySelective(ServiceJudge record);

    int updateByPrimaryKey(ServiceJudge record);
}