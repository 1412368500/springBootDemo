package com.lantw.demo.util;

public class ResultUtil {


    public static final String SUCC = "200";
    public static final String FAIL = "500";

    public static <T> Result<T> success(T data){
        Result<T> result = new Result<>();
        result.setCode(SUCC);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> fail(String msg){
        Result<T> result = new Result<>();
        result.setCode(FAIL);
        result.setMsg(msg);
        return result;
    }


    public static <T> Result<T> build(String code,String msg,T data){
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}
