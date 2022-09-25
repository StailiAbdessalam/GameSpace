package Posts;
import java.util.HashMap;

public class Posts {
    private HashMap<Integer, DetailsPosts> allPost = new HashMap();
    public void addPost(String Ecran , String Console,int Id){
        DetailsPosts postDetails = new DetailsPosts(Id,Ecran,Console);
        allPost.put(Id,postDetails);
    }
    public HashMap getAllPost(){
       return this.allPost;
    }
    public DetailsPosts getPostById(int id){
        return allPost.get(id);
    }

}