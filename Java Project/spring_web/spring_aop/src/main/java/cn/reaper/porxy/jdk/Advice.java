package cn.reaper.porxy.jdk;

public class Advice {
    public void before(){
        System.out.println("前置增强");
    }
    public void afterRun(){
        System.out.println("后置增强");
    }
}
