package com.example.Refractor;

import com.example.Refractor.bird.Bird;
import com.example.Refractor.bird.CokooBird;
import com.example.Refractor.bird.Duck;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestDuck {

    Bird bird = null;
    @BeforeEach
    public void prepare() {
        this.bird = new Duck();
    }
    @Test
    public void testCokooBird() {
        Assertions.assertEquals("I can say like Quack Quack", bird.sing());
    }

    @Test
    public void testSwiming() {
        Assertions.assertEquals("I Can swim like duck", bird.swim());
    }

}
