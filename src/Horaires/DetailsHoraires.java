package Horaires;

public class DetailsHoraires {
    public String name ;
    public int prix;
    private long TimeParminute;

    public DetailsHoraires(String name, int prix, long timeParminute) {
        this.name = name;
        this.prix = prix;
        TimeParminute = timeParminute;
    }

    public String getName() {
        return name;
    }

    public int getPrix() {
        return prix;
    }

    public long getTimeParminute() {
        return TimeParminute;
    }

    @Override
    public String toString() {
        return "[id="+this.name+",prix="+this.prix+",timeParminute="+this.TimeParminute+"]";
    }
}
