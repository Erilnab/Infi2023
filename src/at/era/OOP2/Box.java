package at.era.OOP2;

import at.era.OOP.Katze;

import java.util.ArrayList;

public class Box {
    private int flaeche;
    private int geld;
    private int maxAutoinBox;
    private String fahrer;
    private ArrayList<F1Auto> f1AutoListe;

    public Box(int flaeche, int geld, int maxAutoinBox, String fahrer) {
        this.flaeche = flaeche;
        this.geld = geld;
        this.maxAutoinBox = maxAutoinBox;
        this.fahrer = fahrer;
        this.f1AutoListe = new ArrayList<>();
    }

    public String getFahrer() {
        return fahrer;
    }

    public void setFahrer(String fahrer) {
        this.fahrer = fahrer;
    }

    public int getFlaeche() {
        return flaeche;
    }

    public void setFlaeche(int flaeche) {
        this.flaeche = flaeche;
    }

    public int getGeld() {
        return geld;
    }

    public void setGeld(int geld) {
        this.geld = geld;
    }

    public int getMaxAutoinBox() {
        return maxAutoinBox;
    }

    public void setMaxAutoinBox(int maxAutoinBox) {
        this.maxAutoinBox = maxAutoinBox;
    }

    public ArrayList<F1Auto> getF1AutoList() {
        return f1AutoListe;
    }

    public void setF1AutoList(ArrayList<F1Auto> f1AutoList) {
        this.f1AutoListe = f1AutoList;
    }

    public void getInfo() {
        System.out.println("Fläche:" + this.flaeche +
                "\nGeld:" + this.geld+ "\n Fahrer:" +this.fahrer);
    }
    public void addF1Auto(F1Auto f1Auto){
        if (f1AutoListe.size()>this.maxAutoinBox){
            System.out.println("Der/Die ChefIn will nicht mehr als "+this.maxAutoinBox+" Autos in der Box!");
        }else {
            f1AutoListe.add(f1Auto);
        }
    }
    public void getF1AutoinBox(){
        for (F1Auto f1Auto:f1AutoListe){
            f1Auto.getInfo();
        }
    }

}
