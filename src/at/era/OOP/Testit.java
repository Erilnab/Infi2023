package at.era.OOP;

public class Testit {
    public static void main(String[] args) {
        Katze katze=new Katze();
        katze.setAlter(2);
        katze.setCharakter("bösartig");
        katze.setFarbe("Nathanael");
        katze.setOberflächenbeschaffenheit("flauschig");
        katze.setName("Peter");

        System.out.println("Meine Katze "+katze.getName()+" ist "+katze.getAlter()+" Jahre alt!");
    }
}
