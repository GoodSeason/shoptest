package com.example.shoptest.common;

/**
 * 描述：     异常枚举
 */

public class ResultExceptionEnum {
    WRONG_PASSWORD(10006, "密码错误"),
    NEED_LOGIN(10007, "用户未登录"),
    CART_EMPTY(10018, "购物车已勾选的商品为空"),
    NO_ORDER(10020, "订单不存在"),
    WRONG_ORDER_STATUS(10022, "订单状态不符"),
    SYSTEM_ERROR(20000, "系统异常，请从控制台或日志中查看具体错误信息");
    /**
     * 异常码
     */
    Integer code;
    /**
     * 异常信息
     */
    String msg;

    ResultExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

