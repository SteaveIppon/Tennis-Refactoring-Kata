public class Player {

    private int score;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public static Player of(String name) {
        return new Player(name);
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void won() {
        this.score++;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
