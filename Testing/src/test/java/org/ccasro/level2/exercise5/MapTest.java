package org.ccasro.level2.exercise5;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class MapTest {

    @Test
    void mapTest(){
        Map<String,Integer> birthDate = new HashMap<>();

        birthDate.put("Cesar",1999);
        birthDate.put("Oliver",2005);

        assertThat(birthDate).containsKey("Cesar");
        assertThat(birthDate).containsValue(1999);
        assertThat(birthDate).containsEntry("Oliver",2005);
        assertThat(birthDate).doesNotContainKey("Test");
    }
}
