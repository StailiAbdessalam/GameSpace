package Horaires;
import interfaces.IPosts;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Horaires implements IPosts {
    public static ArrayList<Integer>  allTime = new ArrayList<>();
    public Horaires(ArrayList<Integer> Time) {
        allTime=Time;
    }
    public Horaires(){}
    //method to check time of depart and finaltime the player
    public boolean checktimeOfPlay(long horaire) {
        System.out.println(this.checkDepartTime());
        System.out.println(this.checkFinalTime(horaire));
        return false;
    }
    // metod return true or false si palyer is availble to play in this time
    public boolean checkTime(long Time){
       String TimeFinal = this.checkFinalTime(Time);
       String[] DetailsDate = TimeFinal.split(" ");
       String[] DetailsHour = DetailsDate[1].split(":");
       int Hour = Integer.parseInt(DetailsHour[0]);
       if(Hour<9 || Hour>20 || Hour>12 && Hour<14){
           return false;
       }
       return true;
    }
    public String checkDepartTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String DeparTime = dtf.format(now);
        return DeparTime;
    }
    public String checkFinalTime(long horaire){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String finalTile = dtf.format(now.plusMinutes(horaire));
        return finalTile;
    }
}
