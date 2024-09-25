import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        HotDrink hotDrinkOne = new HotDrink("Горячий напиток 1", 10, 100, 1000);
        HotDrink hotDrinkTwo = new HotDrink("Горячий напиток 2", 20, 200, 2000);
        HotDrink hotDrinkThree = new HotDrink("Горячий напиток 3", 30, 300, 3000);
        List<Product> hotDrinksList = new ArrayList<>();
        hotDrinksList.add(hotDrinkOne);
        hotDrinksList.add(hotDrinkTwo);
        hotDrinksList.add(hotDrinkThree);
        HotDrinkVendingMachine hotDrinkMashineOne = new HotDrinkVendingMachine(hotDrinksList, 10000);

        System.out.println(hotDrinkMashineOne.getProduct("Горячий напиток 1", 10, 1000));

    }

}