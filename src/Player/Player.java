package Player;

import java.time.LocalTime;
import java.util.ArrayList;

public  class Player{

    ArrayList<DetailsPlayer> allplayer = new ArrayList<>();

    public void addplayer(String namePlayer, String game, int idpost, String timefinish){
        allplayer.add(new DetailsPlayer(namePlayer,game,timefinish,idpost));
    }

    public ArrayList<DetailsPlayer> getAllplayer() {
            return allplayer;
    }

    public DetailsPlayer getPlayerByid(int idpost){
        for (DetailsPlayer player:allplayer) {
            if(player.getIdPost()==idpost){
                return player;
            }
        }
        return null;
    }

    public LocalTime getLastPlayerinPostByID(int idpost){
        LocalTime timefich = LocalTime.now();
        for (DetailsPlayer player:allplayer) {
            if(player.getIdPost()==idpost){
                System.out.println(timefich.getHour());
                System.out.println(LocalTime.parse(player.timeFinal()).getHour());
               if(timefich.getHour()<LocalTime.parse(player.timeFinal()).getHour()){
                   timefich=LocalTime.parse(player.timeFinal());
               }
            }
        }
        return timefich;
    }

}