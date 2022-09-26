package Player;

import java.util.ArrayList;
import java.util.HashMap;

public  class Player{

    ArrayList<DetailsPlayer> allplayer = new ArrayList<>();
    HashMap<Integer,DetailsPlayer> AllplayerinHashMap = new HashMap<>();

    public void addplayer(String namePlayer, String game, int idpost, String timefinish){
        allplayer.add(new DetailsPlayer(namePlayer,game,timefinish,idpost));
        AllplayerinHashMap.put(idpost,new DetailsPlayer(namePlayer,game,timefinish,idpost));
    }

    public ArrayList<DetailsPlayer> getAllplayer() {
            return allplayer;
    }
    public HashMap<Integer,DetailsPlayer> getPlayerByHashMap(int idpost){
     return AllplayerinHashMap;
    }
}