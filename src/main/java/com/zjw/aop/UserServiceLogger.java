package com.zjw.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

/**
 * 增强处理类
 */
public class UserServiceLogger {
    private static final Logger log = Logger.getLogger(UserServiceLogger.class);
    //代表前置增强的方法
    public void qianzhi(JoinPoint jp){
        log.debug("调用"+ jp.getTarget()+" 的 " +jp.getSignature().getName()
        +"方法。方法入参：" + Arrays.toString(jp.getArgs()));
    }
    //代表后置增强的方法
    public void houzhi(JoinPoint jp,Object result){
        log.debug("调用" +jp.getTarget()+" 的 "+jp.getSignature().getName()
        +"方法。方法返回值："+ result);
    }
}
