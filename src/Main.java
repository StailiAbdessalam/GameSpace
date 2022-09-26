import Enums.Consoles;
import Enums.Ecrans;
import Enums.Games;
import GameCategorie.Game;
import Horaires.Horaires;
import Player.Player;
import Posts.Posts;
import affichage.Affichage;



public class Main {
    public static void main(String[] args)
    {


        Game game = new Game();
        game.addGame(String.valueOf(Games.AssassinCreed),"Guerre",new int[]{1,3});
        game.addGame(String.valueOf(Games.CounterStrike),"Guerre", new int[]{5,6});
        game.addGame(String.valueOf(Games.PES),"football", new int[]{1, 2, 3,4,7,8,9});
        game.addGame(String.valueOf(Games.FIFA),"football", new int[]{1, 2, 3,4,7,8,9});

        Posts post = new Posts();
        post.addPost(String.valueOf(Ecrans.DELL),String.valueOf(Consoles.XBOX),1);
        post.addPost(String.valueOf(Ecrans.DELL),String.valueOf(Consoles.XBOX),2);
        post.addPost(String.valueOf(Ecrans.DELL),String.valueOf(Consoles.XBOX),3);
        post.addPost(String.valueOf(Ecrans.HP),String.valueOf(Consoles.XBOX),4);
        post.addPost(String.valueOf(Ecrans.ASUS),String.valueOf(Consoles.NintendoSwitch),5);
        post.addPost(String.valueOf(Ecrans.ASUS),String.valueOf(Consoles.NintendoSwitch),6);
        post.addPost(String.valueOf(Ecrans.ASUS),String.valueOf(Consoles.PES5),7);
        post.addPost(String.valueOf(Ecrans.SAMSUNG),String.valueOf(Consoles.PES5),8);
        post.addPost(String.valueOf(Ecrans.SAMSUNG),String.valueOf(Consoles.PES5),9);

        Horaires horaires = new Horaires();
        horaires.addTime("3O min",5,30);
        horaires.addTime("1 heure",10,60);
        horaires.addTime("2 heure",18,120);
        horaires.addTime("5 heure",40,300);
        horaires.addTime("joueur de luxe",65,540);


        Player player= new Player();
        Affichage affichage = new Affichage();
        affichage.Presantation(game,post,player,horaires);

    }





}
