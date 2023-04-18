package LAB13.Bridge.end;

// Refined Abstraction: JazzMusicPlayer
public class JazzMusicPlayer extends MusicPlayer {
    public JazzMusicPlayer(AudioCodec audioCodec) {
        super(audioCodec);
    }

    public void play(String fileName) {
        System.out.println("Playing Jazz music...");
        audioCodec.decode(fileName);
    }
}
