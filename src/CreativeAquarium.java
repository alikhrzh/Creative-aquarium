import java.awt.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;


public class CreativeAquarium extends JFrame {
    private Panel panel;
    public CreativeAquarium() {
        super("Creative Aquarium by Alikhan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        panel = new Panel();
        panel.setBackground(new Color(21, 96, 189));
        panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        panel.setLayout(new BorderLayout(0, 0));
        setContentPane(panel);
        Animator animator = new Animator(this);
        Timer timer = new Timer(50, animator);
        timer.start();
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CreativeAquarium window = new CreativeAquarium();
                    window.setVisible(true);
                    window.addItems();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public Panel getPanel() {
        return panel;
    }
    public void addItems() {
        Panel dpanel = this.getPanel();
        dpanel.addItem(new Coral(dpanel, "5xK.gif"));
        dpanel.addItem(new SpongeBobHome(dpanel, "SpongeBobHome.png"));
        dpanel.addItem(new SquidwardHouse(dpanel, "SquidwordHouse.png"));
        dpanel.addItem(new PatrickHouse(dpanel, "patrickhouse.png"));
        dpanel.addItem(new Gary(dpanel, "Gary.gif", 3, true));
        dpanel.addItem(new Submarine(dpanel, "Submarine.gif", 10));
        dpanel.addItem(new Patrick(dpanel, "Patrick.gif"));
        dpanel.initializeEverything();

    }
    public void setPanel(Panel panel) {
        this.panel = panel;
    }
    }

