package org.ccasro.level1.exercise2;

public class CalculateDni {

    private static final char[] LETTERS_DNI = {'T','R','W','A','G','M','Y','F','P','D','X',
            'B','N','J','Z','S','Q','V','H','L','C','K','E'};

    public static char calculateLetter(int dniNumber){
        if(dniNumber<0 || dniNumber > 99999999){
            throw new IllegalArgumentException("Dni Number out of range");
        }
        int remainder = dniNumber % 23;

        return LETTERS_DNI[remainder];
    }
}
