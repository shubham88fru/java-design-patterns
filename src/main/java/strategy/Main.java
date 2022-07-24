package strategy;


public class Main {
    public static void main(String[] args) {
        ImageStorage imageStorage1 = new ImageStorage();
        imageStorage1.store("file", new JPEGCompressor(), new BWFilter());
        imageStorage1.store("file", new PNGCompressor(), new BWFilter());
    }
}
