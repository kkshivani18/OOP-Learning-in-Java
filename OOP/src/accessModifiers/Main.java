package accessModifiers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Artist artist1 = new Artist("Vincent Van Gogh");
        Artist artist2 = new Artist("Mina Louisa");

        Artwork art1 = new Artwork(1, "Snowy Village", artist2.getName(), 1985);
        Artwork art2 = new Artwork(2, "The Starry Night", artist1.getName(), 2005);

        artist2.addArtwork(art1);
        artist1.addArtwork(art2);

        User u1 = new User("Laila");
        User u2 = new User("Robert");

        u1.like(art1);
        u1.like(art2);
        u2.like(art2);

        List<Artwork> gallery = new ArrayList<>();
        gallery.add(art1);
        gallery.add(art2);

        Gallery.sortArtworksByLikes(gallery);
        Gallery.printAllArtworks(gallery);
    }
}
