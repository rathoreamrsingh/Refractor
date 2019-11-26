package com.example.Refractor;

import com.example.Refractor.bird.Bird;
import com.example.Refractor.bird.Rooster;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestCaseRoaster {
    private Bird bird = null;
    @BeforeEach
    public void prepare() {
        this.bird = new Rooster();
    }
    @Test
    public void testCokooBird() {
        Assertions.assertEquals("Cock-a-doodle-doo", bird.sing());
    }

    @Test
    public void testFlying() {
        Assertions.assertEquals("I have wings but I cannot Fly", bird.fly());
    }
}
