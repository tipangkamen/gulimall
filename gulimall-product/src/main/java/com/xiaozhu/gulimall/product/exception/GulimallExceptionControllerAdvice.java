package com.xiaozhu.gulimall.product.exception;

import com.xiaozhu.common.Enum.BizCodeEnum;
import com.xiaozhu.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

@Slf4j
@RestControllerAdvice(basePackages = "com.xiaozhu.gulimall.product.controller")
public class GulimallExceptionControllerAdvice {

    /*
    * 参数非法异常   MethodArgumentNotValidException
    *
    * */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public R handlerValidException(MethodArgumentNotValidException e){
        log.error("数据校验出现错误{},异常类型{}",e.getMessage(),e.getClass());
        BindingResult bindingResult = e.getBindingResult();
        HashMap<String, String> errormap = new HashMap<>();
        bindingResult.getFieldErrors().forEach((fieldError)->{
            errormap.put(fieldError.getField(),fieldError.getDefaultMessage());
        });
        return R.error(BizCodeEnum.VAILD_EXCEPTION.getCode(),BizCodeEnum.VAILD_EXCEPTION.getMessage()).put("data",errormap);
    }

    @ExceptionHandler(value = Throwable.class)
    public R handlerException(Throwable throwable){
        log.error("未知异常",throwable);
        return R.error(BizCodeEnum.UNKNOW_EXCEPTION.getCode(), BizCodeEnum.UNKNOW_EXCEPTION.getMessage());
    }
}
