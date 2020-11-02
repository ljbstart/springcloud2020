package com.atguigu.service;

import com.atguigu.common.result.ResultObject;
import org.springframework.stereotype.Service;

/**
 * @program: springcloud2020
 * @description:
 * @author: LJB
 * @creatTime: 2020-11-02 2:19
 */
public interface PayMentService {

    ResultObject getPayment(Long id);

}
