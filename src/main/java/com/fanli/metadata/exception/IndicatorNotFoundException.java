package com.fanli.metadata.exception;

/**
 * Created by wei.shen on 2015/12/18.
 */
public class IndicatorNotFoundException extends RuntimeException {
    private  Long id = 0L;

    public IndicatorNotFoundException(Long indicatorId) {
        this.id = indicatorId;
    }

    public Long getId() {
        return this.id;
    }

}
