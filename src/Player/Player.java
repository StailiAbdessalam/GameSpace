package Player;

import java.util.ArrayList;

public  class Player{

    ArrayList<DetailsPlayer> allplayer = new ArrayList<>();

    public void addplayer(String namePlayer, String game, int idpost, String timefinish){
        allplayer.add(new DetailsPlayer(namePlayer,game,timefinish,idpost));
    }

    public ArrayList<DetailsPlayer> getAllplayer() {
            return allplayer;
    }
}