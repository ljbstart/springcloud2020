package com.atguigu.controller;

import com.atguigu.common.result.ResultObject;
import com.atguigu.service.PayMentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud2020
 * @description:
 * @author: LJB
 * @creatTime: 2020-11-02 2:27
 */
@RestController
@RequestMapping("/testPayMent")
public class PayMentController {
    @Autowired
    private PayMentService payMentService;

    @PostMapping("/getPayMent")
    public ResultObject getPayMent(@RequestParam("payMentId") String payMentId){
        Long id = Long.valueOf(payMentId);
        return payMentService.getPayment(id);
    }

}
