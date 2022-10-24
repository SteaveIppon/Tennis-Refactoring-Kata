class GameReceiver implements ResultProvider {
    private final TennisGame4 game;
    private final ResultProvider nextResult;

    public GameReceiver(TennisGame4 game, ResultProvider nextResult) {
        this.game = game;
        this.nextResult = nextResult;
    }

    @Override
    public TennisResult getResult() {
        if (this.checkScore())
            return new TennisResult("Win for " + game.receiver, "");
        return this.nextResult.getResult();
    }

    @Override
    public boolean checkScore() {
        return this.game.getReceiver().getScore() >= 4 && (this.game.getReceiver().getScore() - this.game.getServer().getScore()) >= 2;
    }
}
