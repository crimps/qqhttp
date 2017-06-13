package com.crimps.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by crimps on 2017/6/12.
 */
@Order(1) //指定aop切面运行的优先级。
@Aspect
@Component
public class QQChatSaveHandle {
    @Before("execution(public * com.crimps.controller.ChatController.chat())")
    public void doBefore() {
        System.out.println("YYYYYYYYYYYYYYYYYYY");
    }
}
