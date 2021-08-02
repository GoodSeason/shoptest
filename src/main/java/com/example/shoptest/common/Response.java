package com.example.shoptest.common;

import com.example.shoptest.common.ResultExceptionEnum;


public class Response<T> {
    private Integer status;

    private String msg;

    private T data;

    private static final int OK_CODE = 10000;

    private static final String OK_MSG = "SUCCESS";

    public Response(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public Response(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Response() {
        this(OK_CODE, OK_MSG);
    }

    public static <T> Response<T> success() {
        return new Response<>();
    }

    public static <T> Response<T> success(T result) {
        Response<T> response = new Response<>();
        response.setData(result);
        return response;
    }

    public static <T> Response<T> error(Integer code, String msg) {
        return new Response<>(code, msg);
    }

    public static <T> Response<T> error(ResultExceptionEnum ex) {
        return new Response<>(ex.getCode(), ex.getMsg());
    }

    @Override
    public String toString() {
        return "ApiRestResponse{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static int getOkCode() {
        return OK_CODE;
    }

    public static String getOkMsg() {
        return OK_MSG;
    }
}
