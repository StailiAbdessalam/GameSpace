import Enums.Consoles;
import Enums.Ecrans;
import Enums.Games;
import Posts.Posts;
import affichage.Affichage;

public class Main {
    public static void main(String[] args)
    {
        Affichage affichage = new Affichage();
        affichage.Presantation();
        Posts post = new Posts();
        post.addPost(String.valueOf(Ecrans.DELL),String.valueOf(Consoles.XBOX),1);
        post.addPost(String.valueOf(Ecrans.DELL),String.valueOf(Consoles.XBOX),2);
        post.addPost(String.valueOf(Ecrans.DELL),String.valueOf(Consoles.XBOX),3);
        post.addPost(String.valueOf(Ecrans.HP),String.valueOf(Consoles.XBOX),4);
        post.addPost(String.valueOf(Ecrans.ASUS),String.valueOf(Consoles.NintendoSwitch),5);
        post.addPost(String.valueOf(Ecrans.ASUS),String.valueOf(Consoles.NintendoSwitch),6);
        post.addPost(String.valueOf(Ecrans.ASUS),String.valueOf(Consoles.PES5),7);
        post.addPost(String.valueOf(Ecrans.SAMSUNG),String.valueOf(Consoles.PES5),8);
        post.addPost(String.valueOf(Ecrans.SAMSUNG),String.valueOf(Consoles.PES5),9);
        post.getAllPost();
    }





}
