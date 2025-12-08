package Item_33.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (08.12.2025)
 */
public class FavoritesApp {
    public static void main(String[] args) {
        Favorites f = new Favorites();
        f.putFavorite(String.class, "Java");
        f.putFavorite(Integer.class, 0xcafebabe);
        f.putFavorite(Class.class, Favorites.class);
        String favoritesString = f.getFavorites(String.class);
        Integer favoritesInteger = f.getFavorites(Integer.class);
        Class<?> favoritesClass = f.getFavorites(Class.class);

        System.out.printf("%s %x %s\n", favoritesString, favoritesInteger, favoritesClass);


        // Example 2:
        Favorites config = new Favorites();
        config.putFavorite(String.class, "localhost");
        config.putFavorite(Integer.class, 5432);
        config.putFavorite(Boolean.class, true);

        int port = config.getFavorites(Integer.class);
        String host = config.getFavorites(String.class);
        boolean ssl = config.getFavorites(Boolean.class);

        System.out.printf("Port: %d, Host: %s,  SSl: %b\n", port, host, ssl);
    }
}
