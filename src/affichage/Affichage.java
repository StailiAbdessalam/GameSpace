package affichage;
import GameCategorie.Game;
import Player.Player;
import Posts.Posts;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Affichage {
    // cerenau in the Game
    public long HDebut;
    // Game of player
    public String Game;
    ArrayList<String> allGame = new ArrayList<>();
    public void Menu(ArrayList<Integer> allCreneau){
        while (true) {
            System.out.println("*************** bonjour dans SpaceGame *************/n");
            if (!this.TimeWork()) {
                System.out.println("tu ne peu pas joues d'abord voila hour to work  ");
            } else {
                int chixGlobal = this.MenuAdmin();
                if (chixGlobal == 1) {
                    this.choisiCategorie();
                    this.choisiGame();
                    Boolean isValid = this.choisiCreneau(allCreneau);
                    if (isValid) {
                        this.addPlayer();
                    } else {
                        System.out.println("desole this time n'est pas desponible");
                    }
                } else if (chixGlobal == 2) {
                    System.out.println("attender un peu hh");
                }
            }
        }
    }
    public int MenuAdmin(){

      do{
            System.out.println("choisi votre option :");
            System.out.println("1: play in SpaceGame\n2: Statistique\n");
            Scanner choix = new Scanner(System.in);
            int choixglobal = choix.nextInt();
            if(choixglobal<=0 || choixglobal>2){
                System.out.println("\u001B[31mvotre choix invalid\u001B[0m");
            }else if(choixglobal == 1) {
              return 1;
            }else if (choixglobal==2) {
                return 2;
            }
        }  while (true);

    }
    public void choisiCategorie(){
        while(true){
            System.out.println("choisi categorie de votre Game");
            System.out.println("1:Football\n2:guerre\n3:Menu Principale");
            Scanner Categorie = new Scanner(System.in);
            int choixCategorie = Categorie.nextInt();

            if(choixCategorie<1 || choixCategorie >3){
                System.out.println("\u001B[31mvotre choix invalid\u001B[0m");
                continue;
            } else if (choixCategorie==3) {
                this.MenuAdmin();
                break;
            } else {
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
            if (choixGame <= 0 || choixGame > allGame.size()) {
                System.out.println("\u001B[31mvotre choix invalid\u001B[0m");
                i[0]=1;
                continue;

            }else {
                this.Game=allGame.get(choixGame-1);
                break;
            }
        }
    }
    public Boolean choisiCreneau(ArrayList<Integer> allCreneau){
        while (true) {
            System.out.println("combien the hours tu veux jouer");
            System.out.println("1: 30min\n2: 1h\n3: 2h\n4: 5h\n5:  joueur de luxe");
            Scanner choix = new Scanner(System.in);
            int choixCreneau = choix.nextInt();
            if(choixCreneau>5 || choixCreneau<1){
                System.out.println("\u001B[31mvotre choix invalid\u001B[0m");
            }else {
                Posts Reserver = new Posts();
                boolean hourvalid = Reserver.ReserverHoures(allCreneau.get(choixCreneau - 1));
                this.HDebut=allCreneau.get(choixCreneau - 1);
                return hourvalid;
            }
        }
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
    public void addPlayer(){
        System.out.println("entrer le nom complite de player");
        Scanner nom = new Scanner(System.in);
        String nowPlayer = nom.nextLine();
        Player player = new Player(nowPlayer,this.HDebut,this.Game);
        player.lire();
    }


}
