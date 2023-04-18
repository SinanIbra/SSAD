package LAB13.Bridge.end;

// Concrete Implementor: WAVCodec
public class WAVCodec implements AudioCodec {
    public void decode(String fileName) {
        System.out.println("Playing " + fileName + " using WAV codec.");
    }
}
