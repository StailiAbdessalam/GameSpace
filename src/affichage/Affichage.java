package affichage;
import Enums.Games;
import GameCategorie.Game;
import GameCategorie.GameDetails;
import Posts.DetailsPosts;
import Posts.Posts;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Affichage {
    public void Presantation(Game game, Posts post){
        System.out.println("************************  HI in GameSpace  ************************");
        while(true){
            boolean isWork = this.TimeWork();
            if (!isWork){
                System.out.println("we are not available in this time see you to our time");
                System.exit(0);
            }
            System.out.println("choose your option :\n1: create a Player \n2: statistical \n3: exit");
            Scanner choix = new Scanner(System.in);
            int choixAdmin = choix.nextInt();
            switch (choixAdmin){
                case 1:
                    int choixGame = this.chooseGame();
                    if(choixGame==0){
                        continue;
                    }
                    String Game = String.valueOf(Games.values()[choixGame-1]);
                    ArrayList<DetailsPosts> postDisponible = choosePost(game.getGameByName(Game),post);
                    this.choosePost(postDisponible);
                    this.InfoPlayer();


                    return;
                case 2:
                    System.out.println("attender version");
                       continue;
                case 3:
                    System.out.println("bye See you at our time");
                    System.exit(0);
                    return;
                default:
                    System.out.println("your choice invalid:");
                    continue;
            }
        }
    }

    public int chooseGame(){
        while (true){
            System.out.println("first choose your Game");
            int i=1;
            for (Games Game : Games.values()) {
                System.out.println(i +": "+ Game);
                i++;
            }
            System.out.println(i+": back to menu");
            Scanner choix = new Scanner(System.in);
            int choixGame = choix.nextInt();
            if(choixGame>i || choixGame<1){
                System.out.println("your choice invalid:");
                continue;
            }else if (choixGame==5){
                return 0;
            }else {
                return choixGame;
            }
        }
    }

    public ArrayList<DetailsPosts> choosePost(GameDetails game , Posts posts){
        ArrayList<DetailsPosts> postdisponible = new ArrayList<>();
        int[] ipPost = game.getIdPost();
        for (int ele:ipPost){
            postdisponible.add(posts.getPostById(ele));
        }
        return postdisponible;

    }

    public int choosePost(ArrayList<DetailsPosts> postDisponible){
        System.out.println("this is Post disponible in your Game :\nchoose your post :");

        for(DetailsPosts i:postDisponible){
            System.out.println("Post"+i.getId()+": "+"Ecran=>"+i.getEcran()+" and Console=>"+i.getConsole());
        }
        Scanner choix = new Scanner(System.in);
        int choixPost = choix.nextInt();
        int IdPost = choixPost-1;
        return IdPost;
    }
    public void InfoPlayer(){
        System.out.println("enter your name :");
        Scanner input = new Scanner(System.in);
        String playerName = input.nextLine();
        System.out.println(playerName);
    }

    public boolean TimeWork(){
        DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime timeNow = LocalDateTime.now();
        String timeformate = timeNow.format(forma);
        String[] DetailsTime = timeformate.split(" ");
        String[]  justTime = DetailsTime[1].split(":");
        int Hour = Integer.parseInt(justTime[0]);
        System.out.println(Hour);
        if(Hour<9 ||Hour >=20 || Hour>=12 && Hour<14 ){
            return false;
        }
        return true;
    }
}