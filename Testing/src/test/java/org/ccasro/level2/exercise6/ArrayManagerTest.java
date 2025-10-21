package org.ccasro.level2.exercise6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ArrayManagerTest {

    @Test
    void testArrayIndexOutOfBounds(){
        ArrayManager manager = new ArrayManager();

        assertThatThrownBy(()->manager.getElementAtIndex(6)).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }
}
