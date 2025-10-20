package org.ccasro.level1.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

public class ArrayManagerTest {
    @Test
    public void testGetElementOutOfBounds(){
        ArrayManager manager = new ArrayManager();
        int[] numbers = {1, 2, 3, 4, 5};

        assertThrowsExactly(ArrayIndexOutOfBoundsException.class,() -> manager.getElement(numbers,10));
    }
}
