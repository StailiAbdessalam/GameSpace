import Consoles.Consoles;
import Ecrans.Ecran;
import GameCategorie.Game;
import Posts.Posts;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Ecran> allEcran = new ArrayList<>();
        allEcran.add(new Ecran("Dell",3));
        allEcran.add(new Ecran("Hp",1));
        allEcran.add(new Ecran("Asus",3));
        allEcran.add(new Ecran("Asus",2));

        ArrayList<Consoles> allConsoles = new ArrayList<>();
        allConsoles.add(new Consoles("Xbox",4));
        allConsoles.add(new Consoles("PlayStation5",2));
        allConsoles.add(new Consoles("Nintendo switch",2));

        ArrayList<Game> allGame = new ArrayList<>();
        allGame.add(new Game("FIFA","football"));
        allGame.add(new Game("PES","football"));
        allGame.add(new Game("Counter-Strike","Guerre"));
        allGame.add(new Game("Assassin's Creed","Guerre"));

        System.out.println(allGame.get(0).name);
    }



}
