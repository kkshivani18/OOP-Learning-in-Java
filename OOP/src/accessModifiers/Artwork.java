package accessModifiers;


import java.util.Objects;

public class Artwork {
    private int id;
    private String title;
    private String artistName;
    private int year;
    private int likes;

    public Artwork(int id, String title, String artistName, int year){
        this.id = id;
        this.title = title;
        this.artistName = artistName;
        this.year = year;
        this.likes = 0;
    }

    public void likeArtwork(){
        this.likes++;
    }

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getArtistName(){
        return artistName;
    }

    public int getYear(){
        return year;
    }

    public int getLikes(){
        return likes;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setArtistName(String artistName){
        this.artistName = artistName;
    }

    public void setYear(int year){
        this.year = year;
    }

    @Override
    public String toString(){
        return title + "by " + artistName + " (" + year + ") " + " - Likes: " + likes;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Artwork)) return false;
        Artwork other = (Artwork) obj;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
