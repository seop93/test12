package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;


class MyFirstJUnitJupiterTest {

    private final Calculator calculator= new Calculator();

    @Tag("fast")
    public @interface Fast{}

    @Fast
    @Test
    void MyFastTest(){}


    @Test
    void addition(){
        assertEquals(2,calculator.add(1,1));

    }

    @Test
    public void test(){
    assertTimeout(
            Duration.ofSeconds(2),
            ()->{
                Thread.sleep(1000);
            }
    );
    }
}