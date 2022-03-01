package cn.reaper.anno;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component("myTarget")
public class MyTarget implements TargetInterface {

    public void save() {
        System.out.println("save running...");
    }
}
