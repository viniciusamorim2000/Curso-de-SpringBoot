package com.vinicius.silva.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer status;
    private String msg;
    private Long timemsg;

    public StandardError(Integer status, String msg, Long timemsg) {
        this.status = status;
        this.msg = msg;
        this.timemsg = timemsg;
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

    public Long getTimemsg() {
        return timemsg;
    }

    public void setTimemsg(Long timemsg) {
        this.timemsg = timemsg;
    }
}
