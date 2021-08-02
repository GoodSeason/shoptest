package com.example.shoptest.common;

/**
 * 描述：     统一异常处理
 */

public class Result {

    public class ResultException extends RuntimeException {

        private final Integer code;
        private final String message;

        public ResultException(Integer code, String message) {
            this.code = code;
            this.message = message;
        }

        public ResultException(ResultExceptionEnum exceptionEnum) {
            this(exceptionEnum.getCode(), exceptionEnum.getMsg());
        }

        public Integer getCode() {
            return code;
        }

        @Override
        public String getMessage() {
            return message;
        }
    }
}
