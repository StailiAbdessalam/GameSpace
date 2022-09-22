package GameCategorie;
import java.util.ArrayList;

public class Game {
    String name;
    String categorie;

    private  static ArrayList <Game> allGame = new ArrayList<>();
    public Game() {}
    public Game(String name, String categorie) {
        this.name = name;
        this.categorie = categorie;
    }
    public Game(String name){
        this.name=name;
    }
}
