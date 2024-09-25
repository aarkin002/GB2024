package model;

public class Cat extends Toy{
    private int catId;

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public Cat(String toyName, int toyWeight, int catId) {
        super(toyName, toyWeight);
        this.catId = catId;
    }

    @Override
    public String toString() {
        return "Cat {" +
                "catId=" + catId + " " + "Cat Name: " + getToyName() +
                '}';
    }
}
