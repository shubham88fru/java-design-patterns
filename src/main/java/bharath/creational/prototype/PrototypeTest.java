package bharath.creational.prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        Game game1 = new Game();
        game1.setId(1);
        game1.setGameName("Game one");

        Game game2 = game1.clone();
        System.out.println(game1);
        System.out.println(game2);
    }
}
