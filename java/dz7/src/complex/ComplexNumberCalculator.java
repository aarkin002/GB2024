package complex;
import model.Calculator;

import java.util.LinkedList;

public class ComplexNumberCalculator extends Calculator {



    @Override
    public String takeDivision(String z1, String z2) {
        TakeDivNum takeDiv = new TakeDivNum();
        String str = takeDiv.takeDivNum(z1, z2);
        logg("Частное чисел " + z1 + " и " + z2 + " равно: " + str);
        return str;
    }

    @Override
    public String takeMultiplication(String z1, String z2) {
        TakeMultComplexNum takeMult = new TakeMultComplexNum();
        String str = takeMult.takeMultComplexNum(z1, z2);
        logg("Произведение чисел " + z1 + " и " + z2 + " равно: " + str);
        return str;
    }

    @Override
    public String takeSum(String z1, String z2) {
        TakeSumComplexNum takeSm = new TakeSumComplexNum();
        String str = takeSm.takeSumComplNum(z1, z2);
        logg("Сумма чисел " + z1 + " и " + z2 + " равна: " + str);
        return str;
    }

    @Override
    public void logg(String str) {
        ComplxNumLogger cnl = new ComplxNumLogger();
        cnl.logg(str);
    }
}
