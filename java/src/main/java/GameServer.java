class GameServer implements IResultProvider {
    private final TennisGame game;
    private final IResultProvider nextResult;

    public GameServer(TennisGame game, IResultProvider nextResult) {
        this.game = game;
        this.nextResult = nextResult;
    }

    @Override
    public TennisResult getResult() {
        if (game.serverHasWon())
            return new TennisResult("Win for " + game.server, "");
        return this.nextResult.getResult();
    }
}
