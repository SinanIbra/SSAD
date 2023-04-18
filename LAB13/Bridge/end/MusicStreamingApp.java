package LAB13.Bridge.end;

// Client
public class MusicStreamingApp {
    public static void main(String[] args) {
        AudioCodec mp3Codec = new MP3Codec();
        AudioCodec flacCodec = new FLACCodec();
        AudioCodec wavCodec = new WAVCodec();

        MusicPlayer popMusicPlayer = new PopMusicPlayer(mp3Codec);
        MusicPlayer jazzMusicPlayer = new JazzMusicPlayer(flacCodec);
        MusicPlayer rockMusicPlayer = new RockMusicPlayer(wavCodec);

        popMusicPlayer.play("pop_song.mp3");
        jazzMusicPlayer.play("jazz_song.flac");
        rockMusicPlayer.play("rock_song.wav");
    }
}