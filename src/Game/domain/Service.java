package Game.domain;

public class Service {

    public void whoWin(Option player, Option computer) {
        if (player == computer) {
            System.out.println("EMPATE");
        }
    }
}