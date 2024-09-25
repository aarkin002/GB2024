package complex;
import model.ParseNumber;

import java.util.Arrays;
import java.util.LinkedList;

public class TakeParseNum implements ParseNumber {
    @Override
    public LinkedList<Double> takeNumParse(String num){
        String[] parts = num.split("\\+");
        LinkedList<Double> arr = new LinkedList<>();
        try {
            arr.add(Double.parseDouble(parts[0]));
            String[] partOne = parts[1].split("i");
            arr.add(Double.parseDouble(partOne[0]));
            }catch (Exception e){
                System.out.println(e.getMessage());
        }return arr;
    }
}

