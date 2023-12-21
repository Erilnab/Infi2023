package at.era.OOP;

public class Katze {
    private String charakter;
    private String oberflächenbeschaffenheit;
    private int alter;
    private String farbe;
    private String name;

    public Katze() {
    }

    public Katze(String name, int alter, String farbe, String charakter, String oberflächenbeschaffenheit) {
        this.name = name;
        this.alter = alter;
        this.farbe = farbe;
        this.charakter = charakter;
        this.oberflächenbeschaffenheit = oberflächenbeschaffenheit;
    }

    public String getCharakter() {
        return charakter;
    }

    public void setCharakter(String charakter) {
        this.charakter = charakter;
    }

    public String getOberflächenbeschaffenheit() {
        return oberflächenbeschaffenheit;
    }

    public void setOberflächenbeschaffenheit(String oberflächenbeschaffenheit) {
        this.oberflächenbeschaffenheit = oberflächenbeschaffenheit;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
