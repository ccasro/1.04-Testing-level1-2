package org.ccasro.level2.exercise2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyObjectTest {

    @Test
    void testReference(){
        MyObject first = new MyObject("1");
        MyObject second = first;
        MyObject third = new MyObject("1");

        assertThat(first).isSameAs(second);

        assertThat(first).isNotSameAs(third);

    }
}
