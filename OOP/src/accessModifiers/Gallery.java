package accessModifiers;

import java.util.*;

public class Gallery {

    public static void sortArtworksByLikes(List<Artwork> artworks){
        Collections.sort(artworks, new Comparator<Artwork>() {
            @Override
            public int compare(Artwork art1, Artwork art2) {
                return Integer.compare(art1.getLikes(), art2.getLikes());
            }
        });
    }

    public static void printAllArtworks(List<Artwork> artworks) {
        for (Artwork art : artworks) {
            System.out.println(art);
        }
    }
}
