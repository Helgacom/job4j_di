package ru.job4j.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Aspect
@Component
public class BeforeAndAfterLoggingAspect {
    private static final Logger LOG = LoggerFactory.getLogger(BeforeAndAfterLoggingAspect.class.getName());

    @Before("execution(* ru.job4j.aop.service.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        Object[] argsObj = joinPoint.getArgs();
        String args = Arrays.toString(argsObj);
        String methodName = signature.toShortString();
        LOG.info("Вызван метод:  {}", methodName);
        LOG.info("аргументы: {}", args);
    }

    @AfterReturning(pointcut = "execution(int ru.job4j.aop.service.*.*(..))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, int result) {
        Signature signature = joinPoint.getSignature();
        String methodName = signature.toShortString();
        LOG.info("Метод завершил работу: {}", methodName);
        LOG.info("с результатом: {}", result);
    }
}
