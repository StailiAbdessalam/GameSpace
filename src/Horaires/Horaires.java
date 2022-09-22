package Horaires;

import interfaces.IPosts;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Horaires implements IPosts {
    @Override
    public boolean check(String horaire) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime addhoraire = now.plusHours(2);
        String finalTime = dtf.format(addhoraire);
        String[] infoTime = finalTime.split(" ");
        this.checkDepartTime();

        if(this.checkTime(infoTime[1],horaire)){
            System.out.println("nice");
        }
        return false;
    }

    public boolean checkTime(String time,String horaire){
        String[] DetailsTime = time.split(":");
        Integer.parseInt(horaire);
        int HourDepart =Integer.parseInt(DetailsTime[0]);
        int Hourfinal = HourDepart+Integer.parseInt(horaire);
        if((HourDepart>12 && HourDepart<14) ||  HourDepart<9 || HourDepart>20 ){
            return false;
        }
        return true;
    }


    public boolean checkDepartTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String DeparTime = dtf.format(now);
        System.out.println(DeparTime);
        return false;
    }
    public boolean checkFinalTime( ){
        return false;
    }
}
