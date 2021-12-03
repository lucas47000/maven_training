package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void op1() {
        assertEquals(new Sample().op(Sample.Operation.ADD, 48,52),100);
    }

    @Test
    void op2() {
        assertEquals(new Sample().op(Sample.Operation.MULT, 8,8),64);
    }

    @Test
    void fact() {
        assertEquals(new Sample().fact(3), 6);
    }

    @Test
    void test_to_match_full_coverage() {
        Exception exception = assertThrows(
            IllegalArgumentException.class, () -> {
                new Sample().fact(-1);
            });
             String goodResponse = "N should be positive";
             String response = exception.getMessage();

             assertTrue(response.contains(goodResponse));
    }
}
