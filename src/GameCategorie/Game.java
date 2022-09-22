package GameCategorie;
import java.util.ArrayList;

public class Game {
    String categorie;
    ArrayList<String> name = new ArrayList<>();
    public static ArrayList<Game> allGame = new ArrayList<Game>();
    public Game() {}
    public Game(ArrayList<String> name,String categorie) {
        this.name = name;
        this.categorie = categorie;
    }
    //method to initial data de Game
    public void initialDataGame(ArrayList<Game> allame){
        allGame=allame;
    }
    //method getGame to get all game by categorie
    public ArrayList<String> getGames(int categorie){
        return allGame.get(categorie).name;
    }

}
