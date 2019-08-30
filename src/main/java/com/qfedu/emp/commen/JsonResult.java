package com.qfedu.emp.commen;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class JsonResult {

    @ApiModelProperty(value = "返回数据状态",notes = "1 成功 0 失败")
    private int code;
    @ApiModelProperty(value = "返回数据",notes = "关于类型")
    private Object info;

    public JsonResult() {
    }

    public JsonResult(int code, Object info) {
        this.code = code;
        this.info = info;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }
}
