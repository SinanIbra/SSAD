package LAB13.Bridge.end;

// Refined Abstraction: RockMusicPlayer
public class RockMusicPlayer extends MusicPlayer {
    public RockMusicPlayer(AudioCodec audioCodec) {
        super(audioCodec);
    }

    public void play(String fileName) {
        System.out.println("Playing Rock music...");
        audioCodec.decode(fileName);
    }
}
