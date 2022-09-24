package Posts;

import java.util.ArrayList;
import java.util.HashMap;

public class Posts {
    private int Id ;
    private String Ecran;
    private String Console;

    private ArrayList<HashMap> posts = new ArrayList<>();

    public void addPost(String Ecran , String Console,int Id){
        HashMap<String,String> Detailsposts = new HashMap();
        Detailsposts.put("ID",String.valueOf(Id));
        Detailsposts.put("Ecran",Ecran);
        Detailsposts.put("Console",Console);
        posts.add(Detailsposts);
    }
    public ArrayList<HashMap> getAllPost(){
       return this.posts;
    }
}