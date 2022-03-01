package cn.reaper.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void before(){
        System.out.println("前置增强！");
    }

    public void afterRun(ProceedingJoinPoint pjp){
        System.out.println("afterRun后置增强");
    }

    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around环绕前增强！");
        //切点方法
        Object proceed = proceedingJoinPoint.proceed();

        System.out.println("around环绕后增强！");
    }

    public void afterThrowing(){
        System.out.println("异常抛出增强！");
    }

    public void after(){
        System.out.println("最终执行");
    }
}
