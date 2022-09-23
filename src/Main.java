import GameCategorie.Game;
import Horaires.Horaires;
import Posts.Posts;
import affichage.Affichage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args)
    {
        // stock the data of Game available
        ArrayList<Game> allGame = new ArrayList<>();
        allGame.add(new Game(new ArrayList<>(Arrays.asList("PES","FIFA")),"Footbal" ));
        allGame.add(new Game(new ArrayList<>(Arrays.asList("Counter-Strike","Assassin's Creed")),"Guerre"));
        Game games = new Game();
        games.initialDataGame(allGame);
        // stock the post composent a Ecran and Console
        ArrayList<Posts> allpost = new ArrayList<>();
        allpost.add(new Posts("Dell","Xbox"));
        allpost.add(new Posts("Dell","Xbox"));
        allpost.add(new Posts("Dell","Xbox"));
        allpost.add(new Posts("HP","Xbox"));
        allpost.add(new Posts("Samsung","PlayStation5"));
        allpost.add(new Posts("Samsung","PlayStation5"));
        allpost.add(new Posts("Asus","PlayStation5"));
        allpost.add(new Posts("Asus","Nintendo switch"));
        allpost.add(new Posts("Asus","Nintendo switch"));
        // stock the creneau available in a arraylist
        ArrayList<Integer> allCreneau = new ArrayList<>();
        allCreneau.add(30);
        allCreneau.add(60);
        allCreneau.add(120);
        allCreneau.add(300);
        allCreneau.add(540);
        // send a arraylist a another array in Class Horaires to use
        Horaires initialdata = new Horaires(allCreneau);

        // lance programme
        Affichage Presantation = new Affichage();
        Presantation.Menu(allCreneau);
    }

    public void test(){

    }



}
