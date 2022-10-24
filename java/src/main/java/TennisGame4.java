import java.util.ArrayList;
import java.util.List;

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
        List<ResultProvider> results = new ArrayList<>();
        results.add(new Deuce(this));
        results.add(new Win(getServer(), getReceiver()));
        results.add(new Win(getReceiver(), getServer()));
        results.add(new Advantage(getServer(), getReceiver()));
        results.add(new Advantage(getReceiver(), getServer()));

        for(ResultProvider result : results)
            if(result.checkScore())
                return result.getResult().format();

        return new DefaultResult(this).getResult().format();
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

