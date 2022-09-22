package Posts;
import Consoles.Consoles;
import Ecrans.Ecran;
import GameCategorie.Game;
public class Posts {
    String Ecran;
    String Game;
    int horaire;
    String Console;
    public Posts(String ecran, String game, String console,int horaire) {
        this.Console = console;
        this.Ecran = ecran;
        this.Game = game;
        this.horaire= horaire;

        ReserverEcran(Ecran);
        ReserverConsole(Console);
        ReserverGame(Game);
    }

    public void ReserverEcran(String nameEcran){
        Ecran ReserverEcran = new Ecran();
        System.out.println(ReserverEcran.check(nameEcran));
    }

    public void ReserverConsole(String NameConsole){
        Consoles ReserverConsole = new Consoles();
        System.out.println(ReserverConsole.check(NameConsole));
    }

    public void ReserverGame(String CategorieName){
        Game GameName = new Game(CategorieName);

    }
}
