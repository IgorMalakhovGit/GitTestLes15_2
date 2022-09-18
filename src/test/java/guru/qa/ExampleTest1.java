package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ExampleTest1 {

    @Test
    void ExampleTest1(){
        Assertions.assertTrue(new Random().nextInt() >1);

    }

    @Test
    void ExampleTest2(){
        Assertions.assertTrue(new Random().nextInt()>41);

    }
}
