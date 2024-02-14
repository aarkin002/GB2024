import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Market market = new Market(new ArrayList<>());

        Human humanOne = new Human("Alex");
        Human humanTwo = new Human("Nik");
        Human humanThree = new Human("Gabe");
        Human humanFour = new Human("Fil");

        market.acceptToMarket(humanOne);
        market.acceptToMarket(humanTwo);
        market.acceptToMarket(humanThree);
        market.acceptToMarket(humanFour);

        market.update();
    }
}