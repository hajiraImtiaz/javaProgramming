package day21;

import java.util.Arrays;

public class mergeTwoArrays<g1> {
    public static void main(String[] args) {


        String[] g1 = {"ali", "ahmed", "ahsan"};
        String[] G2 = {"gul", "noor", "aqsa"};

        String[] STUDENTS = new String[g1.length + G2.length];

        int i = 0;
        for (String each : g1) {
            STUDENTS[i++] = each;
        }

        for (String each : G2) {
            STUDENTS[i++] = each;

            System.out.println(Arrays.toString(STUDENTS));
        }

    }
}
