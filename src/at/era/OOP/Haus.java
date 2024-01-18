package at.era.OOP;

import java.util.ArrayList;

public class Haus {
    private int flaeche;
    private String adresse;
    private int anzahlZimmer;
    private int maxkatzenimhaus;
    private ArrayList<Katze> katzenListe;

    public Haus(int flaeche, String adresse, int anzahlZimmer, int maxkatzenimhaus) {
        this.flaeche = flaeche;
        this.adresse = adresse;
        this.anzahlZimmer = anzahlZimmer;
        this.katzenListe = new ArrayList<>();
        this.maxkatzenimhaus = maxkatzenimhaus;
    }

    public int getFlaeche() {
        return flaeche;
    }

    public void setFlaeche(int flaeche) {
        this.flaeche = flaeche;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getAnzahlZimmer() {
        return anzahlZimmer;
    }

    public void setAnzahlZimmer(int anzahlZimmer) {
        this.anzahlZimmer = anzahlZimmer;
    }


    public void getInfo() {
        System.out.println("Adresse: " + this.adresse +
            "\nFlaeche: " + this.flaeche + "m³" +
            "\nZimmeranzahl: " + this.anzahlZimmer +
            "\n");
    }

    public void addKatze(Katze katze) {
        if (katzenListe.size()>this.maxkatzenimhaus) {
            System.out.println("Der/Die ChefIn will nicht mehr als "+this.maxkatzenimhaus+" Katzen im Haus!");
        } if (katze.getAlter()>=5){
            System.out.println("Die Katze ist zu alt für dieses Haus!");
        }
        else {
            katzenListe.add(katze);
        }
    }

    public void getKatzenimHaus(){
        for (Katze katze:katzenListe) {
            katze.getInfo();
        }
    }

}
