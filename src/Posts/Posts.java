package Posts;
import Horaires.Horaires;
import Info.Info;
import java.util.ArrayList;

public class Posts  {
    public static ArrayList<Info>  allPost = new ArrayList<>();
    public Posts(String ecran, String console) {
        allPost.add(new Info(ecran,console));
    }
    public Posts(){}

    public void ReserverHourire(int horaire){
        Horaires ReserverHoraire=new Horaires();
        ReserverHoraire.check(String.valueOf(horaire));
    }






}
