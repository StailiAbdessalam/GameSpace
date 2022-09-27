package listUser;

import Player.DetailsPlayer;

import java.util.ArrayList;

public class ListUser {
    ArrayList<DetailsPlayer> listAllUser = new ArrayList<>();


    public void addinArchive(String namePlayer,String game,String timefinish,int idpost){
        listAllUser.add(new DetailsPlayer(namePlayer,game,timefinish,idpost));

    }

}
