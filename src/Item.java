import java.awt.*;

public abstract class Item {
    private int x;
    private int y;
    private Panel area;
    public abstract void moveOneStep();
    public Item(Panel drawArea) {
        setDrawArea(drawArea);
    }

    public abstract void initialize();

    public abstract void draw(Graphics g);

    public int getWindowWidth() {
        return this.getDrawArea().getWidth();
    }

    public int getWindowHeight() {
        return this.getDrawArea().getHeight();
    }

    private Panel getDrawArea() {
        return area;
    }

    private void setDrawArea(Panel drawArea) {
        this.area = drawArea;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}