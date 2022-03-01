package cn.reaper.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//切面
@Component("myAspect")
@Aspect
public class MyAspect {
    //前置增强
    @Before("execution(* cn.reaper.anno.*.*(..))")
    public void before(){
        System.out.println("前置增强！");
    }

    //afterRun后置增强
    public void afterRun(ProceedingJoinPoint pjp){
        System.out.println("afterRun后置增强");
    }


    //around环绕前增强
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around环绕前增强！");
        //切点方法
        Object proceed = proceedingJoinPoint.proceed();

        System.out.println("around环绕后增强！");
    }


    //异常抛出增强
    public void afterThrowing(){
        System.out.println("异常抛出增强！");
    }

    //最终执行
    public void after(){
        System.out.println("最终执行");
    }
}
