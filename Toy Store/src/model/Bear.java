package model;

public class Bear extends Toy{
    private int bearId;

    public Bear(String toyName, int toyWeight, int bearId) {
        super(toyName, toyWeight);
        this.bearId = bearId;
    }

    public int getBearId() {
        return bearId;
    }

    public void setBearId(int bearId) {
        this.bearId = bearId;
    }

    @Override
    public String toString() {
        return "Bear {" +
                "bearId=" + bearId + " " + "Bear Name: " + getToyName() +
                '}';
    }
}
