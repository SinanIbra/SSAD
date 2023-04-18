package LAB13.Bridge.end;

// Abstraction: MusicPlayer
public abstract class MusicPlayer {
    protected AudioCodec audioCodec;

    public MusicPlayer(AudioCodec audioCodec) {
        this.audioCodec = audioCodec;
    }

    public abstract void play(String fileName);
}
