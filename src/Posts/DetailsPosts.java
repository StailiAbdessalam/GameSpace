package Posts;

public class DetailsPosts {
    private int Id ;
    private String Ecran;
    private String Console;

    public DetailsPosts(int id, String ecran, String console) {
        Id = id;
        Ecran = ecran;
        Console = console;
    }

    public int getId() {
        return Id;
    }

    public String getEcran() {
        return Ecran;
    }

    public String getConsole() {
        return Console;
    }

    @Override
    public String toString() {
        return "id="+this.Id+",Ecran="+this.Ecran+",Console="+this.Console;
    }
}
