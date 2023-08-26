package com.iksadnorth.beanlab;

import org.springframework.stereotype.Component;

@Component
public class Zomboid implements Game {
    @Override
    public void run() {
        System.out.println("Zomboid!");
    }
}
