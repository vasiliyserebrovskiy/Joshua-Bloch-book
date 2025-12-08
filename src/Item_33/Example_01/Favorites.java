package Item_33.Example_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (08.12.2025)
 */
// Typesafe heterogeneous container pattern - API
public class Favorites {
    private Map<Class<?>, Object> favorites = new HashMap<>();

    public <T> void putFavorite(Class<T> type, T instance) {
        favorites.put(Objects.requireNonNull(type), instance);
    }

    public <T> T getFavorites(Class<T> type) {
        return type.cast(favorites.get(type));
    }

}
