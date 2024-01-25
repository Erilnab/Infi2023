package at.era.OOP2;

import at.era.OOP.Katze;

import java.util.ArrayList;
import java.util.Random;

public class Testit2 {

    public static void main(String[] args) {

        Random r=new Random();
        ArrayList<F1Auto> mF1AutoListe = new ArrayList<>();
        ArrayList<Box> mBoxListe = new ArrayList<>();
        F1Auto f1Auto=new F1Auto();
        Box box=new Box();
        //F1Auto F1Auto=new F1Auto();
        String[] motorListe={"V6","V8","V10","V12","W16","Straight6","Straigt5","Straigt4","Straigt3"};
        String[] teamListe={"Rebull","Mercedes","AstonMartin","4aWP","Mclaren","Ferrari","Porsche","Audi"};

            for(int i=1;i<=100;i++) {

                int ml=r.nextInt(motorListe.length-1-0)+0;
                int bl=r.nextInt(1000-1-100)+0;
                int sl=r.nextInt(400-1-50)+0;
                int tl=r.nextInt(teamListe.length-1-0)+0;
                int fl=r.nextInt(200-1-50)+0;
                int gl=r.nextInt(900000000-1-1000000)+0;
                int al= r.nextInt(10-1-1)+0;

                mF1AutoListe.add(new F1Auto(motorListe[ml], bl, sl, teamListe[tl]));
                mBoxListe.add(new Box(fl,gl,al));

            }
            for (F1Auto a): mF1AutoListe{
                box.addF1auto(a);
        }
    }

}

