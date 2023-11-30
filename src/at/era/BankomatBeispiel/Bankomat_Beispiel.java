package at.era.BankomatBeispiel;

import java.util.Scanner;

public class Bankomat_Beispiel {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double K = 0;
       int eingabe;


        System.out.println("Drücken Sie 1 um Geld einzahlen.");
        System.out.println("Drücken Sie 2 um Geld abheben.");
        System.out.println("Drücken Sie 3 um Ihren Kontostand anzuzeigen.");
        System.out.println("Drücken Sie 4 um den Vorgang zu beenden.");
        do {



        eingabe=scanner.nextInt();

            if (eingabe==1) {
                System.out.println("Um Geld einzuzahlen, Betrag eingeben.");
                double e = scanner.nextDouble();
                if (e < 0) {
                    System.out.println("Bitte einen positiven Betrag eingeben!");
                } else {
                    K = K + e;
                    System.out.println("Kontostand: " + K);
                }
            }
            else if (eingabe == 2) {
                    System.out.println("Um Geld abzuheben, Betrag eingeben.");
                    double a = scanner.nextDouble();
                    if (a>K) {
                        System.out.println("Sie sind nicht berechtigt Ihr Konto zu überziehen!");
                        System.out.println("Kontostand:" +K);
                    } else {
                        K = K - a;
                        System.out.println("Kontostand: " + K);
                    }
                }
            else if (eingabe == 3) {
                    System.out.println("Kontostand:" + K);
                }

            } while (eingabe!= 4);
        System.out.println("Vorgang beendet");

    }
}
