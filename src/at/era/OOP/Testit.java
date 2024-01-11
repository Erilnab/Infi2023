package at.era.OOP;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Random;

public class Testit {
    public static void main(String[] args) {
        Random r=new Random();
        ArrayList<Katze> mKatzenListe = new ArrayList<>();
        Katze katze=new Katze();
        String[] NamenListe={"Nathanel","EliasR","EliasG","Elija","Marvin","Norah","David","Berke","Julia","Marina","Jacob, Herr Schwärzler"};
        String[] FarbeListe={"braun","rot","gruen","gelb","rosa","weiß","schwarz","grau","orange","kariert","blau","violet","racing green"};
        String[] charListe={"bösartig","gutartig","hinterhältig","listig","schmusig","lieblich","schnell","lustig","nerfig"};
        String[] oberflaecheListe={"brotartig","flauschig","bürstig","hart","weich","glatt","metallern","epoxiharz","rutschig","schleimig","carnaubawachs"};

        for (int i=1;i<=100;i++) {
            int nl=r.nextInt(NamenListe.length-1-0)+0;
            int al=r.nextInt(25-1-0)+0;
            int fl=r.nextInt(FarbeListe.length-1-0)+0;
            int cl=r.nextInt(charListe.length-1-0)+0;
            int ol=r.nextInt(oberflaecheListe.length-1-0)+0;

            mKatzenListe.add(new Katze(NamenListe[nl], al, FarbeListe[fl], charListe[cl], oberflaecheListe[ol]));

        }
        //katze.setAlter(2);
        //katze.setCharakter("bösartig");
        //katze.setFarbe("Nathanael");
        //katze.setOberflächenbeschaffenheit("flauschig");
        //katze.setName("Haarthanael");

        //Katze katze2=new Katze("nette", "nackt", 5, "rosa", "Nackthanael");
        //mKatzenListe.add(katze2);
        int nummer=1;

        Haus hasu = new Haus(350, "Höchsterstrasse 73, 6850 Dornbirn", 8);
        for (Katze k :mKatzenListe){
            System.out.println("Katze "+nummer+":");
            System.out.println("Die Katze "+k.getName()+" ist "+k.getAlter()+" Jahre alt!");
            System.out.println("Sie ist "+ k.getCharakter()+" und hat die Farbe "+ k.getFarbe()+".");
            System.out.println("Ihre Oberfläche ist "+ k.getOberflächenbeschaffenheit()+".");
            System.out.println("");
            nummer++;
        }
    }
}
