class AdvantageServer implements IResultProvider {
    private final TennisGame game;
    private final IResultProvider nextResult;

    public AdvantageServer(TennisGame game, IResultProvider nextResult) {
        this.game = game;
        this.nextResult = nextResult;
    }

    @Override
    public TennisResult getResult() {
        if (game.serverHasAdvantage())
            return new TennisResult("Advantage " + game.server, "");
        return this.nextResult.getResult();
    }
}
