package Player;
public class DetailsPlayer {
    private String namePlayer;
    private String game;

    private String timeFinal;
    private  int IdPost;




    public DetailsPlayer(String namePlayer, String game, String timeFinal, int idPost) {
        this.namePlayer = namePlayer;
        this.game = game;
        this.timeFinal = timeFinal;
        IdPost = idPost;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public String getGame() {
        return game;
    }

    public String timeFinal() {
        return timeFinal;
    }

    public int getIdPost() {
        return IdPost;
    }

    @Override
    public String toString() {
        return "namePlayer="+this.namePlayer+",game="+this.game+",Timefinish="+this.timeFinal+",idPos="+this.IdPost;
    }
}
