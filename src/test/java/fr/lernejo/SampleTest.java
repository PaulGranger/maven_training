package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {

    static Sample sample = new Sample();

    @Test
    public void testOp1() {
        int a = 1 , b = 1;
        int res = sample.op(Sample.Operation.ADD, a, b);
        Assertions.assertThat(res).isEqualTo(2);
    }

    @Test
    public void testOp2() {
        int a = 1 , b = 1;
        int res = sample.op(Sample.Operation.MULT, a, b);
        Assertions.assertThat(res).isEqualTo(1);
    }

    @Test
    public void fact1() {
        int a = 5;
        int res = sample.fact(a);
        Assertions.assertThat(res).isEqualTo(120);
    }

    @Test
    public void factError() {
        int a = -5;
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> sample.fact(a));
    }
}
