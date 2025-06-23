package accessModifiers;

import java.util.*;

public class Artist {

    private String name;
    private List<Artwork> artworks;

    public Artist(String name){
        this.name = name;
        this.artworks = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addArtwork(Artwork art){
        artworks.add(art);
    }

    public List<Artwork> getArtworks(){
        return artworks;
    }

    public int getTotalArtwork(){
        return artworks.size();
    }

    @Override
    public String toString(){
        return "Artist: " + name + " | Total Artworks: " + artworks.size();
    }
}
