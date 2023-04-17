package mosh.composite;

public class Main {
    public static void main(String[] args) {
        Group group1 = new Group();
        group1.add(new Shape());//square
        group1.add(new Shape());//square

        Group group2 = new Group();
        group2.add(new Shape()); //circle
        group2.add(new Shape());//circle

        Group group3 = new Group();
        group3.add(group1);
        group3.add(group2);
        group3.render();
        group3.move();
    }
}
