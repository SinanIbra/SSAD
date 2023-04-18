package LAB13.Bridge.end;

// Concrete Implementor: FLACCodec
public class FLACCodec implements AudioCodec {
    public void decode(String fileName) {
        System.out.println("Playing " + fileName + " using FLAC codec.");
    }
}
