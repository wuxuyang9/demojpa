package com.example.demo.common.handle;


import com.example.demo.common.exception.RException;
import com.example.demo.common.model.CodeEnum;
import com.example.demo.common.model.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
//import org.springframework.data.mapping.PropertyReferenceException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常统一处理处理器
 * Created by Fire945 on 2019/01/17.
 */
@RestControllerAdvice(value = {"com.gaia"})
public class RExceptionHandler {

    // TODO 日志。
    private Logger logger = LoggerFactory.getLogger(getClass());


    /**
     * 拦截其他所有未定义的异常
     */
    @ExceptionHandler(Exception.class)
    public Object handleException(Exception e) {
        e.printStackTrace();
        logger.error(e.getMessage());
        return JsonResult.error(CodeEnum.EXCEPTION.getCodeInfo(), CodeEnum.EXCEPTION.getCode());
    }

    /**
     * 自定义异常
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Object handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        logger.error(e.getMessage());
        StringBuilder sb = new StringBuilder("字段校验错误:");
        if (e.getBindingResult().getFieldError() != null)
            sb.append("[").append(e.getBindingResult().getFieldError().getField())
                    .append(":").append(e.getBindingResult().getFieldError().getDefaultMessage())
                    .append("]");
        return JsonResult.error(sb.toString(), CodeEnum.PARAMS_INVALID.getCode());
    }

    /**
     * 自定义异常
     */
    @ExceptionHandler(RException.class)
    public Object handleRRException(RException e) {
        logger.error(e.getMessage());
        return JsonResult.error(e.getMsg(), e.getCode());
    }


    /**
     * 数据库中已存在该记录
     */
    @ExceptionHandler(DuplicateKeyException.class)
    public Object handleDuplicateKeyException(DuplicateKeyException e) {
        logger.error(e.getMessage());
        return JsonResult.error("数据库中已存在该记录", CodeEnum.DATA_EXITS.getCode());
    }


    /**
     * Pageable 的 sort 排序的字段名为实体类的字段名。（不是数据库字段名）
     * 字段名不匹配，或者排序规则不为（'asc''desc'），则会抛出此异常。
     */
//    @ExceptionHandler(PropertyReferenceException.class)
//    public Object handleDuplicateKeyException(PropertyReferenceException e) {
//        logger.error(e.getMessage());
//        return JsonResult.error("排序参数非法。", CodeEnum.DATA_EXITS.getCode());
//    }


    /**
     * 加了@RequestParam 注释但没有参数会抛出此异常: MissingServletRequestParameterException
     */
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public Object handleMissingServletRequestParameterException(MissingServletRequestParameterException e) {
        logger.error(e.getMessage());
        return JsonResult.error(CodeEnum.PARAMS_INVALID.getCodeInfo(), CodeEnum.PARAMS_INVALID.getCode());
    }
}
