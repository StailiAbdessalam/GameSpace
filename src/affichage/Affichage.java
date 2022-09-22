package affichage;

import GameCategorie.Game;
import Horaires.Horaires;
import Posts.Posts;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Scanner;


public class Affichage {
    ArrayList<String> allGame = new ArrayList<>();

    public void Menu(){
        System.out.println("*************** bonjour dans SpaceGame *************/n");
        if(!this.TimeWork()){
            System.out.println("tu ne peu pas joues d'abord voila hour to work  ");
        }else {
            this.choisiCategorie();
            this.choisiGame();
            this.choisiCreneau();
        }


    }
    public void choisiCategorie(){
        while(true){
            System.out.println("choisi categorie de votre Game");
            System.out.println("1:Football\n2:guerre\n");
            Scanner Categorie = new Scanner(System.in);
            int choixCategorie = Categorie.nextInt();
            if(choixCategorie<1 || choixCategorie >3){
                System.out.println("\u001B[31mvotre choix invalid\u001B[0m");
                continue;
            }else {
                Game game = new Game();
                ArrayList<String> GameByCategorie =game.getGames(choixCategorie-1);
                allGame = GameByCategorie;
                //System.out.println(GameByCategorie);
                break;
            }
        }
    }
    public void choisiGame(){
        final int[] i = {1};
        while (true) {
            System.out.println("choisi votre Game");
            allGame.forEach(ele -> {
                System.out.println( i[0]+": " + ele);
                i[0]++;

            });
            Scanner choix = new Scanner(System.in);
            int choixGame = choix.nextInt();
            if (choixGame < 0 || choixGame > allGame.size()) {
                System.out.println("\u001B[31mvotre choix invalid\u001B[0m");
                i[0]=1;
                continue;

            }else {
                System.out.println(allGame.get(choixGame-1));
                break;
            }
        }
    }
    public void choisiCreneau(){
        System.out.println("combien the hours tu veux jouer");
        System.out.println("1: 30min\n2: 1h\n3: 2h\n4: 5h\n5:  joueur de luxe");
        Scanner choix = new Scanner(System.in);
        int choixCreneau = choix.nextInt();
        Posts Reserver = new Posts();
        Reserver.ReserverHoures(120);
    }


    public boolean TimeWork(){
        DateTimeFormatter formaTime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime nowTime = LocalDateTime.now();
        String TimeNow = formaTime.format(nowTime);
        String[] Time = TimeNow.split(" ");
        String[] DetailsTime = Time[1].split(":");
        int Hour = Integer.parseInt(DetailsTime[0]);
        if(Hour<9 || Hour >20 || Hour>12 && Hour<14 ){
            // dont forget to change the return a false return
            return false;
        }
        return true;
    }



}
