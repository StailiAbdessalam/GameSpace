package Queue;

import Player.DetailsPlayer;

import java.time.LocalTime;
import java.util.ArrayList;

public class Queues {
    ArrayList<DetailsPlayer> Listqueue = new ArrayList<>();
    public void addInQueue(String namePlayer,String game,String timefinish,int idpost){
        Listqueue.add(new DetailsPlayer(namePlayer,game,timefinish,idpost));
    }
    public ArrayList<DetailsPlayer> getallQueueInList() {
        return Listqueue;
    }
    public DetailsPlayer getQueueByid(int idpost){
        for (DetailsPlayer queue:Listqueue) {
            if(queue.getIdPost()==idpost){
                return queue;
            }
        }
        return null;
    }
    public LocalTime getLastQueueInPostByID(int idpost){
        LocalTime timefich = LocalTime.now();
        for (DetailsPlayer queue:Listqueue) {
            if(queue.getIdPost()==idpost){
                if(timefich.getHour()<LocalTime.parse(queue.timeFinal()).getHour()){
                    timefich=LocalTime.parse(queue.timeFinal());
                }
            }
        }
        return timefich;
    }

}
