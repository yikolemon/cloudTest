package com.yikolemon.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * 统一响应
 */
public class CommonResponse<T> implements Serializable {

    private Integer code;

    private String message;

    private T data;

    public CommonResponse(Integer code,String message){
        this.code=code;
        this.message=message;
    }

}
