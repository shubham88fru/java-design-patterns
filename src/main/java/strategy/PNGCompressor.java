package strategy;

public class PNGCompressor implements ICompressor {
    @Override
    public void compress(String fileName) {
        System.out.println("png compression");
    }
}
