package work1;

// Прямоугольник
public class Rectangle implements Figure{

    int height;
    int width;
    @Override
    public void setHeight(int height) {

        this.height = height;
    }
    @Override
    public void setWidth(int width) {

        this.width = width;
    }
}
