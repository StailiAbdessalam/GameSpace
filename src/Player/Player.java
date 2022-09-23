package Player;

import GameCategorie.Game;

import java.util.ArrayList;
import java.util.Arrays;

public class Player {

    ArrayList<Object> player = new ArrayList();
    public Player(String fullname,long HDebut,String Game){
        player.add(Arrays.asList(fullname,HDebut,Game));
    }
    public void lire(){
        System.out.println(player);
    }



}
