package LAB13.Bridge.end;

// Concrete Implementor: MP3Codec
public class MP3Codec implements AudioCodec {
    public void decode(String fileName) {
        System.out.println("Playing " + fileName + " using MP3 codec.");
    }
}
