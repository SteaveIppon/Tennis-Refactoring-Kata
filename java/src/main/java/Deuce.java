class Deuce implements IResultProvider {
    private final TennisGame game;
    private final IResultProvider nextResult;

    public Deuce(TennisGame game, IResultProvider nextResult) {
        this.game = game;
        this.nextResult = nextResult;
    }

    @Override
    public TennisResult getResult() {
        if (game.isDeuce())
            return new TennisResult("Deuce", "");
        return this.nextResult.getResult();
    }
}
