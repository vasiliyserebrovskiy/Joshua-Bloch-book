package Item_20;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (13.11.2025)
 */
// The class implements the interface directly, without an abstract base class.
public class StreamingPlayer implements Playable {
    private String streamUrl;
    private boolean isPlaying;

    public StreamingPlayer(String streamUrl) {
        this.streamUrl = streamUrl;
    }

    @Override
    public void play() {
        System.out.println("Streaming from: " + streamUrl);
        isPlaying = true;
    }

    @Override
    public void pause() {
        if (isPlaying) {
            System.out.println("Stream paused.");
            isPlaying = false;
        } else {
            System.out.println("Stream is not playing.");
        }
    }

    @Override
    public void stop() {
        if (isPlaying) {
            System.out.println("Streaming stopped.");
            isPlaying = false;
        } else {
            System.out.println("Nothing to stop.");
        }
    }

    // You can use the default method of the interface without redefiningit
    // But if you want, we can refine it.:
    @Override
    public void info() {
        System.out.println("Streaming player connected to: " + streamUrl);
    }
}
