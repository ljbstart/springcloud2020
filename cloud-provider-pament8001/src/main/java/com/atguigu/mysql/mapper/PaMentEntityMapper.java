package com.atguigu.mysql.mapper;

import com.atguigu.mysql.entity.PayMentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @program: springcloud2020
 * @description:
 * @author: LJB
 * @creatTime: 2020-11-02 2:01
 */
@Mapper
public interface PaMentEntityMapper {

    int creat(PayMentEntity payMentEntity);


    PayMentEntity getPayMentById(@Param("id") Long id);
}
