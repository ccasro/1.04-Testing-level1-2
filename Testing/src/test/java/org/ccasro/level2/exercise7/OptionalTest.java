package org.ccasro.level2.exercise7;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class OptionalTest {

    @Test
    void testOptionalIsEmpty(){
        Optional<String> empty = Optional.empty();
        Optional<String> notEmpty = Optional.of("test");

        assertThat(empty).isEmpty();
        assertThat(notEmpty).isPresent().contains("test").containsInstanceOf(String.class);
    }
}
