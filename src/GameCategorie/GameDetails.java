package GameCategorie;
import java.util.Arrays;

public class GameDetails {
    private String name;
    private String Categorie;
    private int[] IdPost;

    public GameDetails(String name, String categorie, int[] idPost) {
        this.name = name;
        Categorie = categorie;
        IdPost = idPost;
    }

    public String getName() {
        return name;
    }

    public String getCategorie() {
        return Categorie;
    }

    public int[] getIdPost() {
        return IdPost;
    }

    @Override
    public String toString() {
        return "name="+this.name+",categorie="+this.Categorie+",Id="+ Arrays.toString(this.IdPost);
    }
}
