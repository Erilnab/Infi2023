package at.era.whileloop;

import java.util.Random;

public class While_Loop_Aufgabe_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomsolution=0;
        int runs=0;
        int randomValue = 0;

        do {
            randomValue=random.nextInt(10,30);
            randomsolution=randomsolution+randomValue;
            runs=runs+1;
        } while ((randomValue!=15)&&(randomValue!=25));

        System.out.println("Runs "+runs);
        System.out.println(randomsolution);
    }
}
