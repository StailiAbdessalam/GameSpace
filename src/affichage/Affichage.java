package affichage;
import Enums.Games;
import GameCategorie.Game;
import GameCategorie.GameDetails;
import Horaires.Horaires;
import Player.Player;
import Posts.DetailsPosts;
import Posts.Posts;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import Player.DetailsPlayer;
import Horaires.DetailsHoraires;
import java.lang.Thread;

public class Affichage {
    public void Presantation(Game game, Posts post,Player player,Horaires Time){
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
                    // choix 1 of Player
                    String Game = String.valueOf(Games.values()[choixGame-1]);
                    ArrayList<DetailsPosts> postDisponible = this.choosePostDispoible(game.getGameByName(Game),post);
                    // choix 2 of Player
                    int IdPostChoix = this.choosePost(postDisponible,player);
                    // choix 3 of Player
                    int choixCreneau = this.chooseCreneau(Time,IdPostChoix,player);
                    if(choixCreneau==0){
                        continue;
                    }
                    long timePlayParMinute =Time.getTimeWithid(choixCreneau-1);
                    // choix 4 of Horaire
                    String NamePlayer = this.InfoPlayer();
                    String Timefinish = Time.Timefinish(timePlayParMinute);
                    player.addplayer(NamePlayer,Game,IdPostChoix,Timefinish);

                    continue;
                    //return;
                case 2:
                    //System.out.println("attender version");
                    if(player.getAllplayer().size()==0){
                        System.out.println("------------------Vide list---------------");
                    }else {
                        System.out.println("-------------Player list -------------");
                        ArrayList<DetailsPlayer> listPlayer = player.getAllplayer();
                        listPlayer.forEach((DetailsPlayer Oneplayer)->{
                            System.out.println("Name Player: " +Oneplayer.getNamePlayer()+" || Game: "+Oneplayer.getGame()+ " || Time Finished: "+Oneplayer.timeFinal()+" || in : Post: "+String.valueOf(Oneplayer.getIdPost()+1));
                        });
                    }
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

    public ArrayList<DetailsPosts> choosePostDispoible(GameDetails game , Posts posts){
        ArrayList<DetailsPosts> postdisponible = new ArrayList<>();
        int[] idPost = game.getIdPost();
        for (int ele:idPost){
            postdisponible.add(posts.getPostById(ele));
        }
        return postdisponible;
    }

    public int choosePost(ArrayList<DetailsPosts> postDisponible,Player player){
        System.out.println("this is Post disponible in your Game :\nchoose your post :");

        ArrayList<DetailsPlayer> allplayer = player.getAllplayer();
        for(DetailsPosts post:postDisponible){
            if(allplayer.size()!=0){
                String posteDetail = "Post"+post.getId()+": "+"Ecran=>"+post.getEcran()+" and Console=>"+post.getConsole();
                for(DetailsPlayer players:allplayer){
                    if(post.getId()-1==players.getIdPost()){
                        String timefinal = player.getAllplayer().get(players.getIdPost()).timeFinal();
                        posteDetail+= "\033[0;33m ------playing-----\033[0m"+"end in: \033[0;32m"+timefinal+"\033[0m";
                        break;
                    }
                }
                System.out.println(posteDetail+"\033[0;32m------disponibe-----\033[0m");
            } else {
                System.out.println("Post"+post.getId()+": "+"Ecran=>"+post.getEcran()+" and Console=>"+post.getConsole()+"\033[0;32m------disponibe-----\033[0m");
            }
        }

        Scanner choix = new Scanner(System.in);
        int choixPost = choix.nextInt();
        int IdPost = choixPost-1;
        return IdPost;
    }
    public String InfoPlayer(){
        System.out.println("enter your name :");
        Scanner input = new Scanner(System.in);
        String playerName = input.nextLine();
        return playerName;
    }

    public boolean TimeWork(){
        DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        int timeNow = LocalDateTime.now().getHour();
        int Hour =timeNow;
        if(Hour<9 ||Hour >=20 || Hour>=12 && Hour<14 ){
            return true;
        }
        return true;
    }

    public int chooseCreneau(Horaires time,int idpost,Player playerClass){

        while (true) {
            System.out.println("choisi votre heure :");
            ArrayList<DetailsHoraires> allcreneau = time.getallTime();
            int i = 1;
            ArrayList<Integer> idcreneauvalid = new ArrayList<>();
            ArrayList<DetailsPlayer> allplayer = playerClass.getAllplayer();
            for (DetailsHoraires creneau : allcreneau) {

                //


                //nextttttty





                //if(allplayer.size()!=0){
                  //  System.out.println(playerClass.getPlayerByHashMap(idpost).get(idpost).timeFinal());
                //}




                int nowTime = LocalDateTime.now().plusMinutes(creneau.getTimeParminute()).getHour();
                if (nowTime > 23 || nowTime < 14 && nowTime >= 12 || nowTime < 9) {
                    System.out.println(i + ": " + creneau.name + "\u001B[31m  ------invaliable-----\033[0m");
                } else {
                    System.out.println(i + ": " + creneau.name+"\033[0;32m------disponibe-----\033[0m");
                    idcreneauvalid.add(i);

                }
                i++;
            }

            String message = "\u001B[31m---your choix invalid---\033[0m";
            if(idcreneauvalid.size()==0){
                try {
                    System.out.println("see you tomorrow inchaelah");
                    Thread.sleep(2000);
                    return 0;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else {
                boolean isdisponible = false;
                Scanner choix = new Scanner(System.in);
                int choixCreneau = choix.nextInt();
                for (int id:idcreneauvalid) {
                    if (choixCreneau == id) {
                        isdisponible=true;
                       break;
                    } else {
                        continue;
                    }
                }
                if(isdisponible){
                     return  choixCreneau;
                }else {
                    System.out.println(message);
                }
            }


        }

    }

}