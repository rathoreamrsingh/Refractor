package com.example.Refractor;

import com.example.Refractor.bird.Bird;
import com.example.Refractor.bird.CokooBird;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CokooBirdTesting {

    @Test
    public void testCokooBird() {
        Bird bird = new CokooBird();
        Assertions.assertEquals("Singing like Cokoo Bird", bird.sing());
    }
}
