package Item_20.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (13.11.2025)
 */
public class ExampleApp {
    public static void main(String[] args) {
        Playable song = new MusicPlayer("Jean-Michel Jarre – Oxygène");
        song.info();
        song.play();
        song.pause();
        song.stop();

        System.out.println("\n--- Now using streaming player ---\n");

        Playable stream = new StreamingPlayer("https://radio.example.com/live");
        stream.info();
        stream.play();
        stream.pause();
        stream.play();
        stream.stop();
    }
}
