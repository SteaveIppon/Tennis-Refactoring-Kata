class Deuce implements ResultProvider {
    private final TennisGame4 game;
    private final ResultProvider nextResult;

    public Deuce(TennisGame4 game, ResultProvider nextResult) {
        this.game = game;
        this.nextResult = nextResult;
    }

    @Override
    public TennisResult getResult() {
        if (this.checkScore())
            return new TennisResult("Deuce", "");
        return this.nextResult.getResult();
    }

    @Override
    public boolean checkScore() {
        return this.game.getServer().getScore() >= 3 && this.game.getReceiver().getScore() >= 3 && (this.game.getServer().getScore() == this.game.getReceiver().getScore());
    }
}
