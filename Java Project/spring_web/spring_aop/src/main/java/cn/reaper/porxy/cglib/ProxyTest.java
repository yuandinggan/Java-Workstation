package cn.reaper.porxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyTest {
    public static void main(String[] args) {

        //目标对象
        final Target target=new Target();

        //增强对象
        final Advice advice=new Advice();

        //返回值 基于cglib 动态代理对象
        //1.创建增强器
        Enhancer enhancer=new Enhancer();
        //2.设置夫类（目标）
        enhancer.setSuperclass(Target.class);
        //3.设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                //执行前置
                advice.before();
                //执行目标
                Object invoke = method.invoke(target,args);
                //执行后置
                advice.afterRun();
                return invoke;
            }
        });
        //4.创建代理对象
        Target proxy=(Target) enhancer.create();

        proxy.save();
    }
}
