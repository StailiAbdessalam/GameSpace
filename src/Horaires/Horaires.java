package Horaires;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public class Horaires {
    ArrayList<DetailsHoraires> allTime = new ArrayList<>();
    public void addTime(String name,int prix,long timePlay){
      allTime.add(new DetailsHoraires(name,prix,timePlay));
    }
    public ArrayList<DetailsHoraires> getallTime(){
        return allTime;
    }

    public String Timefinish(long creneau){
        DateTimeFormatter forma = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime timeNow = LocalTime.now().plusMinutes(creneau);
        String timefiniched = timeNow.format(forma);
       return timefiniched;
    }

    public long returnDefferteTime(LocalTime timefiniched){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        long deferrance = java.time.Duration.between(LocalTime.now(),timefiniched).toMinutes();
        return deferrance;
    }

    public long getTimeWithid(int id){
       return this.allTime.get(id).getTimeParminute();
    }

}