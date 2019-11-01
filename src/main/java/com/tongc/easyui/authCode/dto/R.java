package com.tongc.easyui.authCode.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @description: 返回结果
 * @author: WangSai
 * @create: 2019-07-09 12:03
 */
@Getter
@Setter
@ApiModel(value = "返回结果")
public class R<T> {
    public static final String EXCEPTION_ERROR_MESSAGE_PARAMETER_ERR = "参数错误";
    /** 参数错误 */
    public static final int RESPONSE_CODE_PARAMETER_ERR = -9999;
    public static final String RESULT_STATUS_CODE = "code";
    public static final String RESULT_STATUS_MESSAGE = "message";
    public static final String RESULT_OK = "操作成功";
    public static final String RESULT_ERROR = "操作失败";
    /** 内部错误 */
    public static final int INNER_EXCEPTION_CODE = -1000;
    /** 无操作权限 */
    public static final int NO_PERMISSIONS = -2;
    public static final int NOT_LOGIN = -999;
    /** 无效的 REFRESH_TOKEN */
    public static final Integer NOT_REFRESH = -99;
    public static final int NUMBER_ZERO = 0;
    /** 成功 */
    public static final Integer RESPONSE_CODE_OK = 200;
    /** 失败 */
    public static final Integer RESPONSE_CODE_ERROR = -1;

    @ApiModelProperty(value = "响应状态 200成功 -1失败 -2 无操作权限 -99无效的refresh_token -999未登录 -1000内部错误 -9999参数错误")
    private Integer code;
    @ApiModelProperty(value = "错误信息")
    private String message;
    @ApiModelProperty(value = "返回内容")
    private T content;

    /**
     * 操作成功
     * @return
     */
    public static R ok() {
        return new R();
    }
    /**
     * 操作成功
     * @return
     */
    public static R ok(Object t) {
        return new R(t);
    }

    /**
     * 操作失败
     * @return
     */
    public static R error() {
        return new R().err();
    }
    public static R error(Integer code, String message) {
        return new R().err(code, message);
    }
    public static R error(String message) {
        return new R().err(message);
    }


    private R() {
        this.code = RESPONSE_CODE_OK;
        this.message = RESULT_OK;
    }
    private R(T t) {
        this.code = RESPONSE_CODE_OK;
        this.message = RESULT_OK;
        this.content = t;
    }
    private R err() {
        this.code = RESPONSE_CODE_ERROR;
        this.message = RESULT_ERROR;
        this.content = null;
        return this;
    }
    private R err(Integer code, String message) {
        this.code = code;
        this.message = message;
        this.content = null;
        return this;
    }

    private R err(String message) {
        this.code = RESPONSE_CODE_ERROR;
        this.message = message;
        this.content = null;
        return this;
    }




}
