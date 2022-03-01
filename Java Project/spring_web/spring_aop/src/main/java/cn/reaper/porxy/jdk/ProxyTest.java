package cn.reaper.porxy.jdk;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {
      final Target target=new Target();

      //增强对象
        Advice advice=new Advice();

        //返回值 就是动态代理生成的代理对象
        TargetInterface proxy = (TargetInterface) Proxy.newProxyInstance(
                target.getClass().getClassLoader(), //目标对象类加载器
                target.getClass().getInterfaces(), //目标对象相同的接口字节码对象数据
                new InvocationHandler() {
                    @Override
                    //调用代理对象的任何方法 实质执行的都是这个方法
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //前置增强
                        advice.before();
                        Object invoke = method.invoke(target,args);
                        //后置增强
                        advice.afterRun();
                        return invoke;
                    }
                }
        );

        //调用代理对象的方法
        proxy.save();

    }
}
