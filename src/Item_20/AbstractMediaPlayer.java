package Item_20;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (13.11.2025)
 */
// An abstract class is a partial implementation of an interface
public abstract class AbstractMediaPlayer implements Playable {
    protected String title;

    public AbstractMediaPlayer(String title) {
        this.title = title;
    }

    @Override
    public void stop() {
        System.out.println(title + " stopped.");
    }

    @Override
    public void info() {
        System.out.println("Media: " + title);
    }
}
