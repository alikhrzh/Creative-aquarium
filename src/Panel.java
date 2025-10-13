import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;
public class Panel extends JPanel {
    private ArrayList<Item>  items = new ArrayList<>();
    public Panel() {}
    public void paint(Graphics g) {

        // This does the default painting first
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradientPaint = new GradientPaint(
                0, 0 , new Color(21, 96, 189),
                0, getHeight(), new Color(0, 20, 40)
        );
        g2d.setPaint(gradientPaint);
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());

        g2d.setColor(new Color(255, 255, 255, 35));
        for(int i=0;i<getWidth();i+=400) {
            g2d.drawLine(i,0,i-100,getHeight());
        }
        g2d.setColor(new Color(255, 255, 255, 35));
        for(int i=0;i<getWidth();i+=150) {
            g2d.drawLine(i,0,i-100,getHeight());
        }
        int sandHeight = 220;
        GradientPaint sandGradient = new GradientPaint(
                0, getHeight()-sandHeight, new Color(210,220,190),
                0, getHeight(), new Color(235, 240, 220)
        );
        g2d.setPaint(sandGradient);
        g2d.fillOval(-100, getHeight()-sandHeight, getWidth()+200, sandHeight+100);
        for (Item item : this.getItems()) {
            item.draw(g);
        }
    }
    public void moveEverythingOneStep() {
        for (Item item : this.getItems()) {
            item.moveOneStep();
        }
    }
    public void initializeEverything(){
        for (Item item : this.getItems()) {
            item.initialize();
        }
    }
    public ArrayList<Item> getItems() {
        return items;
    }
    public void addItem(Item item) {
        this.getItems().add(item);
    }
}
