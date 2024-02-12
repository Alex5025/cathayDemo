//package com.example.demo2.aop;
//
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//import java.util.stream.IntStream;
//
//@Slf4j
//@Aspect
//@Component
//public class com.example.demo2.servicecom.example.demo2.serviceinterfaceAop {
//    @Around("execution(public * com.example.demo2.service..*(..))")
//    public void writeLog(ProceedingJoinPoint pjp) {
//        Object result = null;
//        Object[] param = pjp.getArgs();
//
//        try {
//            result = pjp.proceed(param);
//        } catch (Throwable e) {
//            throw new RuntimeException(e);
//        }
//
//        StringBuilder sb = new StringBuilder();
//        String methodName = pjp.getSignature().toShortString();
//        log.info(methodName);
//        IntStream.range(0, param.length).forEach(index -> sb.append(String.format("\nparam %d:%s \n", index, param[index].toString())));
//        log.info(sb.toString());
//    }
//}
