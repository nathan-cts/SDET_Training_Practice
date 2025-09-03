package org.example;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{

    public void compile(){
        System.out.println("Compiled code in object of Desktop");
    }
}
