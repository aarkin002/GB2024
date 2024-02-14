public class HotDrink extends Product{
    private int temperature;
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {

        this.volume = volume;
    }

    public HotDrink(String name, int volume, int price, int temperature) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink {" + "name = " + getName() +
                ", volume = " + getVolume() + ", temperature = " + getTemperature() + '}';
    }


}
