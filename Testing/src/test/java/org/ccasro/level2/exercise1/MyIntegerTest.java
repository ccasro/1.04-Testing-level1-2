package org.ccasro.level2.exercise1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class MyIntegerTest {
    @Test
    void testValue(){
        MyInteger first = new MyInteger(30);
        MyInteger second = new MyInteger(30);
        MyInteger third = new MyInteger(10);

        assertThat(first.getValue()).isEqualTo(second.getValue());

        assertThat(first.getValue()).isNotEqualTo(third.getValue());
    }
}
