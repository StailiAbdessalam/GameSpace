package Consoles;

import Info.Info;
import interfaces.IPosts;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class Consoles implements IPosts  {

    private static ArrayList<Info> allConsoles = new ArrayList<>();
    public Consoles() {}
    public Consoles(String name, int quantite) {
        allConsoles.add(new Info(name,quantite));
    }
    public boolean check(String name) {
        AtomicBoolean check = new AtomicBoolean(false);
        this.allConsoles.forEach(consoles ->  {
            if((name == consoles.name) && (consoles.quantity!=0)){
               check.set(true);
            }
        });
        return check.get();
    }


}
