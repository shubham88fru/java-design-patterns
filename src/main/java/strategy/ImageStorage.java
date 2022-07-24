package strategy;

public class ImageStorage {
    public void store(String fileName, ICompressor compressor, IFilter filter) {
        compressor.compress(fileName);
        filter.filter(fileName);
    }

}
