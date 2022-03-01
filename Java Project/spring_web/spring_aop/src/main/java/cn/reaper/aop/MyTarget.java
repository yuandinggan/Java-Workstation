package cn.reaper.aop;



public class MyTarget implements TargetInterface {

    public void save() {

        System.out.println("save running...");
        int i=1/0;
    }
}
