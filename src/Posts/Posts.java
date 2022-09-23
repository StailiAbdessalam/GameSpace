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
    public boolean ReserverHoures(long minute){
        Horaires check = new Horaires();
        Boolean isValid = check.checkTime(minute);
        //System.out.println(isValid);
        return isValid;
    }




}
