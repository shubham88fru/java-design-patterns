package strategy;

public class BWFilter implements IFilter{
    @Override
    public void filter(String fileName) {
        System.out.println("Apply bw filter");
    }
}
