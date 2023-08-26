package com.iksadnorth.beanlab;

import org.springframework.stereotype.Component;

@Component
public class HeroesOfTheStorm implements Game {
    @Override
    public void run() {
        System.out.println("히오스!");
    }
}
