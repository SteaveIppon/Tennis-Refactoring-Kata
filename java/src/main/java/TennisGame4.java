public class TennisGame4 implements TennisGame {

    Player server;
    Player receiver;

    public TennisGame4(String player1, String player2) {
        this.server = Player.of(player1);
        this.receiver = Player.of(player2);
    }

    @Override
    public void wonPoint(String playerName) {
        if (server.getName().equals(playerName))
            this.server.won();
        else
            this.receiver.won();
    }

    @Override
    public String getScore() {
        TennisResult result = new Deuce(
                this, new GameServer(
                        this, new GameReceiver(
                                this, new AdvantageServer(
                                        this, new AdvantageReceiver(
                                                this, new DefaultResult(this)))))).getResult();
        return result.format();
    }

    @Override
    public Player getServer() {
        return this.server;
    }

    @Override
    public Player getReceiver() {
        return this.receiver;
    }
}

