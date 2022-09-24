package Posts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Posts {
    private int Id ;
    private String Ecran;
    private String Console;
    private HashMap<String,String> Detailsposts = new HashMap();
    private ArrayList<HashMap> posts = new ArrayList<>();

    public void addPost(String Ecran , String Console,int Id){
        Detailsposts.put("ID",String.valueOf(Id));
        Detailsposts.put("Ecran",Ecran);
        Detailsposts.put("Console",Console);
        posts.add(Detailsposts);
    }
    public void getAllPost(){
        System.out.println(this.posts);
    }
}