package complex;

import java.util.LinkedList;

public class TakeDivNum {
    public String takeDivNum(String z1, String z2) {
        TakeParseNum prsNm = new TakeParseNum();
        StringBuilder sb = new StringBuilder();
        LinkedList<Double> z1prs = prsNm.takeNumParse(z1);
        LinkedList<Double> z2prs = prsNm.takeNumParse(z2);
        sb.append((z1prs.get(0)*z2prs.get(1)+z1prs.get(1)*z2prs.get(1))/(z1prs.get(1)*z1prs.get(1)+z2prs.get(1)*z2prs.get(1)));
        sb.append(" + ");
        sb.append((z1prs.get(1)*z2prs.get(0)-z1prs.get(0)*z2prs.get(1))/(z1prs.get(1)*z1prs.get(1)+z2prs.get(1)*z2prs.get(1)));
        sb.append("i");
        return sb.toString();
    }
}
