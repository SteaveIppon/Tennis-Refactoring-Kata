class AdvantageReceiver implements IResultProvider {

    private final TennisGame game;
    private final IResultProvider nextResult;

    public AdvantageReceiver(TennisGame game, IResultProvider nextResult) {
        this.game = game;
        this.nextResult = nextResult;
    }

    @Override
    public TennisResult getResult() {
        if (game.receiverHasAdvantage())
            return new TennisResult("Advantage " + game.receiver, "");
        return this.nextResult.getResult();
    }
}
