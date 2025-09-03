package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

//    FIELD INJECTION
    @Autowired
    @Qualifier("laptop")
    private Computer computer;

//    SETTER INJECTION
//    private Computer computer;
//    @Autowired
//    @Qualifier("laptop")
//    public void setComputer(Computer computer){
//        this.computer = computer;
//    }

//    CONSTRUCTOR INJECTION
//    private Computer computer;
//    public Dev(Computer computer){
//        this.computer = computer;
//    }


    public void build() {
        computer.compile();
        System.out.println("reached dev object");
    }
}
