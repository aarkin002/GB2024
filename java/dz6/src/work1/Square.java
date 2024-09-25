package work1;

// Квадрат
public class Square implements Figure {

    int height;
    int width;
    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }
}
