class GameReceiver implements IResultProvider {
    private final TennisGame game;
    private final IResultProvider nextResult;

    public GameReceiver(TennisGame game, IResultProvider nextResult) {
        this.game = game;
        this.nextResult = nextResult;
    }

    @Override
    public TennisResult getResult() {
        if (game.receiverHasWon())
            return new TennisResult("Win for " + game.receiver, "");
        return this.nextResult.getResult();
    }
}
