package com.iksadnorth.beanlab;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;
import java.util.Set;

@SpringBootTest
public class BeanTest {
    @Autowired List<Game> gameList;
    @Autowired Set<Game> gameSet;
    @Autowired Map<String, Game> gameMap;
//    @Autowired Stack<Game> gameStack; // 실패함
//    @Autowired Queue<Game> gameQueue; // 실패함

    @Test @DisplayName("List Bean 실험")
    void test1() {
        gameList.forEach(Game::run);
    }
    @Test @DisplayName("Set Bean 실험")
    void test2() {
        gameSet.forEach(Game::run);
    }
    @Test @DisplayName("Map Bean 실험")
    void test3() {
        gameMap.forEach((s, game) -> {
            System.out.println(s);
            game.run();
            System.out.println();
        });
    }
}
