package at.era.uebungswitch;

public class Switch_Aufgabe_2 {
    public static void main(String[] args) {
        int summe=0;
        for (int i = 2; i < 1000; i=i+2) {
            summe=summe+i;
        }
        System.out.println(summe);
    }
}
