package com.fanli.metadata.entity;

import java.util.List;
import java.util.Map;

/**
 * Created by wei.shen on 2015/10/2.
 */
public class Result<T> {
    private Boolean isSuccess;
    private T result;
    private List<T> results;
    private String msg;
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Result{" +
                "isSuccess=" + isSuccess +
                ", result=" + result +
                ", results=" + results +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                '}';
    }
}
