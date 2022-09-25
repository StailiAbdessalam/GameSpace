package GameCategorie;
import Posts.DetailsPosts;

import java.util.HashMap;

public  class Game {

    private HashMap<String,GameDetails> allGame = new HashMap();
    public void addGame (String name, String Categorie,int[] IdPost){
        GameDetails gameDetails = new GameDetails(name, Categorie, IdPost);
        allGame.put(name,gameDetails);
    }
    public HashMap<String,GameDetails> getAllGame(){
        return  this.allGame;
    }
    public GameDetails getGameByName(String name){
        return this.allGame.get(name);
    }


}