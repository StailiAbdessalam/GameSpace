package Ecrans;
import Info.Info;
import interfaces.IPosts;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class Ecran implements IPosts {
    private static ArrayList<Info> allEcran =new ArrayList<>() ;

    public Ecran(String name, int quantite) {
        allEcran.add(new Info(name,quantite));
    }
    public Ecran() {}
    public boolean check(String name) {
        AtomicBoolean check = new AtomicBoolean(false);
        this.allEcran.forEach(consoles ->  {
            if((name == consoles.name) && (consoles.quantity!=0)){
                check.set(true);
            }
        });
        return check.get();
    }
}
