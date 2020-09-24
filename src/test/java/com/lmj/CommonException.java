package com.lmj;

/**
 * 参数异常定义
 */
public class CommonException extends RuntimeException{
    private String message;

    public CommonException(String message) {
        System.out.println("请输入三个正确的路径参数");
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
