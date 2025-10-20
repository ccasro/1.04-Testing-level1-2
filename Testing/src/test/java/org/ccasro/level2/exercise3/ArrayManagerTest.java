package org.ccasro.level2.exercise3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ArrayManagerTest {

    @Test
    void testIntArray(){
        int[] first = {5,1,7};
        int[] second = {4,8,200,100};
        int[] third = ArrayManager.getArray();

        assertThat(second).isEqualTo(third);

        assertThat(first).isNotEqualTo(third);
    }
}
