package com.yikolemon.advice;

import com.yikolemon.exception.AdException;
import com.yikolemon.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> hanlderAdException(HttpServletRequest req,
                                                     AdException ex){
        CommonResponse<String> response=new CommonResponse<>(-1,"business error");
        response.setData(ex.getMessage());
        return response;
    }

}
