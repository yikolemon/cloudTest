package com.yikolemon.constant;

import lombok.Getter;

@Getter
public enum CommonStatus {

    VALID(1,"有效状态"),
    INCALID(0,"无效状态");

    private Integer status;
    private String desc;

    CommonStatus(Integer status,String desc){
        this.status=status;
        this.desc=desc;
    }

}
