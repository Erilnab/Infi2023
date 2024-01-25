package at.era.OOP2;

import java.util.ArrayList;

public class Box {
    private int flaeche;
    private int geld;
    private int maxAutoinBox;
    private ArrayList<F1Auto> f1AutoList;

    public Box(int flaeche, int geld, int maxAutoinBox) {
        this.flaeche = flaeche;
        this.geld = geld;
        this.maxAutoinBox = maxAutoinBox;
        this.f1AutoList = new ArrayList<>();
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
        return f1AutoList;
    }

    public void setF1AutoList(ArrayList<F1Auto> f1AutoList) {
        this.f1AutoList = f1AutoList;
    }

    public void getInfo() {
        System.out.println("Fläche:" + this.flaeche +
                "\nGeld:" + this.geld);
    }
    public void add F1Auto(F1Auto f1Auto){

    }
}
