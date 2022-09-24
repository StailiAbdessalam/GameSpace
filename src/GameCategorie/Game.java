package GameCategorie;

import java.util.Arrays;
import java.util.HashMap;

public  class Game {
    //private String name;
    //private String Categorie;
    private HashMap<String,HashMap> allGame = new HashMap();

    public void addGame (String name, String Categorie, int[] IdPost){
        HashMap<String,String> DetailsGame = new HashMap<>();
        DetailsGame.put("name",name);
        DetailsGame.put("Categorie",Categorie);
        DetailsGame.put("idPost", Arrays.toString(IdPost));
        allGame.put(name,DetailsGame);
    }
    public HashMap<String,HashMap> getAllGame(){
        return  this.allGame;
    }
    public HashMap getGameByName(String name){
        return this.allGame.get(name);

    }


}