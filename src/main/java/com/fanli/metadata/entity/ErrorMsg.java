package com.fanli.metadata.entity;

/**
 * Created by wei.shen on 2015/12/18.
 */
public class ErrorMsg {
    private int code;
    private String msg;

    public ErrorMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
