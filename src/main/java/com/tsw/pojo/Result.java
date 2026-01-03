package com.tsw.pojo;

import lombok.Data;

@Data
public class Result {
    private Integer code;
    private String message;
    private Object data;

    public static Result success() {
        Result result = new Result();
        result.code = 200;
        result.message = "success";
        return result;
    }
    public static Result success(Object data) {
        Result result = new Result();
        result.code = 200;
        result.message = "success";
        result.data = data;
        return result;
    }
    public static Result error(String message) {
        Result result = new Result();
        result.code = 0;
        result.message = message;
        return result;
    }
}
