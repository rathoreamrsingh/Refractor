package com.example.Refractor;

import com.example.Refractor.bird.Bird;
import com.example.Refractor.bird.Chicken;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ChickenTestCase {

    Bird bird = null;
    @BeforeEach
    public void prepare() {
        this.bird = new Chicken();
    }
    @Test
    public void testCokooBird() {
        Assertions.assertEquals("Sing Cluck Cluck like Chicken", bird.sing());
    }

    @Test
    public void testFlying() {
        Assertions.assertEquals("I have wings but I cannot Fly", bird.fly());
    }

}