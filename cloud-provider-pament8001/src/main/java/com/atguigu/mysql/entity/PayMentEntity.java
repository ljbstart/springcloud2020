package com.atguigu.mysql.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: springcloud2020
 * @description:
 * @author: LJB
 * @creatTime: 2020-11-02 1:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayMentEntity implements Serializable {

    private Long id;

    private String serial;

}
