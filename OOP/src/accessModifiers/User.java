package accessModifiers;

import java.util.ArrayList;
import java.util.List;

public class User {

    public String username;
    private List<Artwork> likedArtworks;

    public User(String username){
        this.username = username;
        this.likedArtworks = new ArrayList<>();
    }

    public void like(Artwork art){
        if(!likedArtworks.contains(art)){
            art.likeArtwork();
            likedArtworks.add(art);
            System.out.println(username + " liked " + art.getTitle());
        }
        else {
            System.out.println(username + " already liked this artwork");
        }
    }

    public List<Artwork> getLikedArtworks(){
        return likedArtworks;
    }

    @Override
    public String toString(){
        return "User: " + username + " | Liked artworks: " + likedArtworks.size();
    }
}
