
public interface TennisGame {
    void wonPoint(String playerName);
    String getScore();
    Player getServer();
    Player getReceiver();
}