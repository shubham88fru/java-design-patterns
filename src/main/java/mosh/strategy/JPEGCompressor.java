package mosh.strategy;

public class JPEGCompressor implements ICompressor {
    @Override
    public void compress(String fileName) {
        System.out.println("jpeg compression");
    }
}
