package com.example.demo.common.model;

import java.util.HashMap;
import java.util.Map;
/**
 * @Description:
 * 1.封装json对象，所有返回结果都使用它
 * 2.code是返回码，请求成功返回0，请求失败返回错误码
 * 3.错误码参考ErrorEnum
 * @Author: luolang
 * @Date: 2019/2/23
 */
public class JsonResult {

    /**
     * 单条数据封装
     */
    public static Object success(Object data, int code) {
        Map<String, Object> result = new HashMap<>();
        result.put("data", data);
        result.put("code", code);
        return result;
    }

    /**
     * delete类型回参
     */
    public static Object success(int code) {
        Map<String, Object> result = new HashMap<>();
        result.put("code", code);
        return result;
    }
    /**
     * 默认内容的成功消息
     * */
    public static Object success(CodeEnum codeEnum) {
        Map<String, Object> result = new HashMap<>();
        result.put("code", codeEnum.getCode());
        result.put("msg", codeEnum.getCodeInfo());
        return result;
    }
    /**
    * 无参默认成功消息
    * */
    public static Object success() {
        Map<String, Object> result = new HashMap<>();
        result.put("code", CodeEnum.SUCCESS.getCode());
        result.put("msg", CodeEnum.SUCCESS.getCodeInfo());
        return result;
    }

    /**
     * 带数据的默认成功消息
     * */
    public static Object success(Object data) {
        Map<String, Object> result = new HashMap<>();
        result.put("data", data);
        result.put("code", CodeEnum.SUCCESS.getCode());
        return result;
    }

    /**
     * 自定义内容的错误消息
     * */
    public static Object error(String msg, int code) {
        Map<String, Object> result = new HashMap<>();
        result.put("msg", msg);
        result.put("code", code);
        return result;
    }

    /**
    * 默认内容的错误消息
    * */
    public static Object error(CodeEnum codeEnum) {
        return error(codeEnum.getCodeInfo(), codeEnum.getCode());
    }


}
