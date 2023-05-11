package bharath.creational.prototype;

public class Game implements Cloneable {
    private int id;
    private String gameName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    @Override
    public Game clone() {
        try {
            Game clone = (Game) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", gameName='" + gameName + '\'' +
                '}';
    }
}
