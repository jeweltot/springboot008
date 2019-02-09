package me.jeweltot.springboot008.aopBase;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect
{
    //@Around("execution(* me.jeweltot..*.EventService.*(..))") // pointcut
    @Around("@annotation(PerfLogging)")
    public Object logPerf(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        long begin = System.currentTimeMillis();
        Object retVal = proceedingJoinPoint.proceed();
        System.out.println(System.currentTimeMillis() - begin);
        return retVal;
    }

    @Before("bean(simpleEventService)")
    public void hello() {
        System.out.println("hello");
    }
}
