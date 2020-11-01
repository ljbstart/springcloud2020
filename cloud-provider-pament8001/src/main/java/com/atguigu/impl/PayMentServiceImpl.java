package com.atguigu.impl;

import com.atguigu.common.result.ResultObject;
import com.atguigu.mysql.entity.PayMentEntity;
import com.atguigu.mysql.mapper.PaMentEntityMapper;
import com.atguigu.service.PayMentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: springcloud2020
 * @description:
 * @author: LJB
 * @creatTime: 2020-11-02 2:20
 */
@Service("PayMentService")
public class PayMentServiceImpl implements PayMentService {
    @Autowired
    private PaMentEntityMapper paMentEntityMapper;

    public ResultObject getPayment(Long id) {
        PayMentEntity payMentEntity = paMentEntityMapper.getPayMentById(id);
        return new ResultObject(200,"success",payMentEntity);
    }
}
