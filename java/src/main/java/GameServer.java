class GameServer implements ResultProvider {
    private final TennisGame4 game;

    public GameServer(TennisGame4 game) {
        this.game = game;
    }

    @Override
    public TennisResult getResult() {
        return new TennisResult("Win for " + game.server, "");
    }

    @Override
    public boolean checkScore() {
        return this.game.getServer().getScore() >= 4 && (this.game.getServer().getScore() - this.game.getReceiver().getScore()) >= 2;
    }
}
