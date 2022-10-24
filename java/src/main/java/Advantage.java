class Advantage implements ResultProvider {

    private Player player1;
    private Player player2;

    public Advantage(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public TennisResult getResult() {
        return new TennisResult("Advantage " + this.player1, "");
    }

    @Override
    public boolean checkScore() {
        return this.player1.getScore() >= 4 && (this.player1.getScore() - this.player2.getScore()) == 1;
    }
}
