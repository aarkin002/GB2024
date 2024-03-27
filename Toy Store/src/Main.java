import model.Type;
import device.TheDevice;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        TheDevice device = new TheDevice(new ArrayList<>());

        device.add("Taddy One", 100, Type.BEAR);
        device.add("Taddy Two", 110, Type.BEAR);
        device.add("Taddy Three", 120, Type.BEAR);
        device.add("Garfiled One", 130, Type.CAT);
        device.add("Garfiled Two", 140, Type.CAT);
        device.add("Garfiled Three", 150, Type.CAT);

        System.out.println(device.getToyByWeight(130));


    }
}