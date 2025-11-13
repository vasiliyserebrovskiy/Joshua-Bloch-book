package Item_20;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (13.11.2025)
 */
// A specific class is a complete implementation

public class MusicPlayer extends AbstractMediaPlayer {

    public MusicPlayer(String title) {
        super(title);
    }

    @Override
    public void play() {
        System.out.println("Playing music: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Music paused: " + title);
    }
}

