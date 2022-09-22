import GameCategorie.Game;
import Posts.Posts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    ArrayList<String> allGame = new ArrayList<>();
    public static void main(String[] args)
    {
        ArrayList<Game> allGame = new ArrayList<>();
        allGame.add(new Game(new ArrayList<>(Arrays.asList("PES","FIFA")),"Footbal" ));
        allGame.add(new Game(new ArrayList<>(Arrays.asList("Counter-Strike","Assassin's Creed")),"Guerre"));
        Game games = new Game();
        games.initialDataGame(allGame);

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

        Main global = new Main();
        global.Menu();
    }

    public void Menu(){
        System.out.println("*************** bonjour dans SpaceGame *************/n");
        this.choisiCategorie();
    }

    public void choisiCategorie(){
        while(true){
            System.out.println("choisi categorie de votre Game");
            System.out.println("1:Football\n2:guerre\n");
            Scanner Categorie = new Scanner(System.in);
            int choixCategorie = Categorie.nextInt();
            if(choixCategorie<1 || choixCategorie >3){
                System.out.println("\u001B[31mvotre choix invalid\u001B[0m");
                continue;
            }else {
                Game game = new Game();
                ArrayList<String> GameByCategorie =game.getGames(choixCategorie-1);
                System.out.println(GameByCategorie);
                break;
            }
        }
    }
}
