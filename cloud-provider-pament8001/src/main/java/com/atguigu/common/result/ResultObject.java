package com.atguigu.common.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultObject<T> {
    private Integer code;
    private String msg;
    private T data;

}
