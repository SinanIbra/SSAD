package LAB13.Bridge.end;

// Refined Abstraction: PopMusicPlayer
public class PopMusicPlayer extends MusicPlayer {
    public PopMusicPlayer(AudioCodec audioCodec) {
        super(audioCodec);
    }

    public void play(String fileName) {
        System.out.println("Playing Pop music...");
        audioCodec.decode(fileName);
    }
}
