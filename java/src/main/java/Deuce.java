class Deuce implements ResultProvider {
    private final TennisGame4 game;

    public Deuce(TennisGame4 game) {
        this.game = game;
    }

    @Override
    public TennisResult getResult() {
        return new TennisResult("Deuce", "");
    }

    @Override
    public boolean checkScore() {
        return this.game.getServer().getScore() >= 3 && this.game.getReceiver().getScore() >= 3 && (this.game.getServer().getScore() == this.game.getReceiver().getScore());
    }
}
