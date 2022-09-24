package affichage;

import Enums.Games;

import java.util.Scanner;

public class Affichage {
    public void Presantation(){
        System.out.println("************************  HI in GameSpace  ************************");
        while(true){
            System.out.println("choose your option :\n1: create a Player \n2: statistical \n3: exit");
            Scanner choix = new Scanner(System.in);
            int choixAdmin = choix.nextInt();
            switch (choixAdmin){
                case 1:
                    this.chooseGame();
                    return;
                case 2:
                       return;
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
                String Game = String.valueOf(Games.values()[choixGame-1]);





                break;
            }
        }
        return 1;
    }
}