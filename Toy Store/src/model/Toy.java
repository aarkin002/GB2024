package model;

public abstract class Toy {
    private String toyName;
    private int toyWeight;

    public Toy(String toyName, int toyWeight) {
        this.toyName = toyName;
        this.toyWeight = toyWeight;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public int getToyWeight() {
        return toyWeight;
    }

    public void setToyWeight(int toyWeight) {
        this.toyWeight = toyWeight;
    }
}
