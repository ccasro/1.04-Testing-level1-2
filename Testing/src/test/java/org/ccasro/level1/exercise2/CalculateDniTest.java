package org.ccasro.level1.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateDniTest {

    @ParameterizedTest()
    @CsvSource({"12345678,'Z'",
            "87654321,'X'",
            "11111111,'H'",
            "33333333,'P'",
            "44444444,'A'",
            "55555555,'K'",
            "22222222,'J'",
            "43455555,'E'",
            "76543210,'S'",
            "99999999,'R'"
    })
    void calculateLetterTest(int number, char expectedLetter){
        char result = CalculateDni.calculateLetter(number);
        assertEquals(expectedLetter,result);
    }

}
