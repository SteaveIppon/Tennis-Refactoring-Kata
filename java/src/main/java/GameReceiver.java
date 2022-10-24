class GameReceiver implements ResultProvider {
    private final TennisGame4 game;

    public GameReceiver(TennisGame4 game) {
        this.game = game;
    }

    @Override
    public TennisResult getResult() {
        return new TennisResult("Win for " + game.receiver, "");
    }

    @Override
    public boolean checkScore() {
        return this.game.getReceiver().getScore() >= 4 && (this.game.getReceiver().getScore() - this.game.getServer().getScore()) >= 2;
    }
}
