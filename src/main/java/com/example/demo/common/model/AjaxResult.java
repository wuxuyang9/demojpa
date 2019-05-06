package com.example.demo.common.model;

import java.util.HashMap;

/**
 * 用于web返回json格式数据
 */
public class AjaxResult extends HashMap<String, Object> {

    private static final String NAME_OF_DATA = "data";

    private static final int CODE_OK = 200;

    private static final int CODE_ERROR = 500;

    public static final int CODE_OTHER = 1000;

    private static final String NAME_OF_CODE = "code";

    private static final String NAME_OF_MEG = "msg";

    private static final String NAME_OF_ERROR_MSG = "error";

    private static final String NAME_OF_TOTAL = "total";

    public static AjaxResult of() {
        return new AjaxResult();
    }

    public static AjaxResult empty() {
        return new AjaxResult();
    }

    public static AjaxResult ok(int code, String msg) {
        return empty().data(NAME_OF_CODE, code).data(NAME_OF_MEG, msg);

    }

    public static AjaxResult ok(int code) {
        return empty().data(NAME_OF_CODE, code);
    }

    public static AjaxResult ok(String msg) {
        return AjaxResult.ok(CODE_OK, msg);
    }

    public static AjaxResult ok() {
        return ok(CODE_OK);
    }

    /**
     *
     */
    public static AjaxResult error(int code, String errorMsg) {
        return empty().data(NAME_OF_CODE, code).data(NAME_OF_ERROR_MSG, errorMsg);
    }

    public static AjaxResult error(int code) {
        return empty().data(NAME_OF_CODE, code);
    }

    /**
     * @param msg 错误消息,对应字段名{@link #NAME_OF_ERROR_MSG}
     */
    public static AjaxResult error(String msg) {
        return empty().data(NAME_OF_CODE, CODE_ERROR).data(NAME_OF_ERROR_MSG, msg);
    }

    public static AjaxResult error() {
        return error(CODE_ERROR);
    }

    /**
     * 合并消息 若key有重复则会覆盖已有的数据
     */
    public AjaxResult merge(AjaxResult ajaxResult) {
        putAll(ajaxResult);
        return this;
    }

    /**
     * 放入一条数据
     *
     * @param key 若key有重复则会覆盖已有的数据
     */
    public AjaxResult data(String key, Object value) {
        put(key, value);
        return this;
    }

    /**
     * 放入一条数据，使用 {@link #NAME_OF_DATA} 作为key
     */
    public AjaxResult data(Object value) {
        return data(NAME_OF_DATA, value);
    }

    /**
     * 放入一条数据，使用 {@link #NAME_OF_TOTAL} 作为key
     */
    public AjaxResult total(long total) {
        return data(NAME_OF_TOTAL, total);
    }

    /**
     * 放入一条数据，使用 {@link #NAME_OF_MEG} 作为key
     */
    public AjaxResult msg(Object msg) {
        return data(NAME_OF_MEG, msg);
    }

    /**
     * 设置code的值
     */
    public AjaxResult code(int code) {
        return data(NAME_OF_CODE, code);
    }
}