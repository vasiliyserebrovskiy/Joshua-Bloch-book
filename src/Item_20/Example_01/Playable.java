package Item_20.Example_01;

// Interface - contract
public interface Playable {
    void play();
    void pause();
    void stop();

    // Default method — default implementation
    default void info() {
        System.out.println("Generic playable item.");
    }
}
