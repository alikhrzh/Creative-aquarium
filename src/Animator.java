import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animator implements ActionListener {

    private CreativeAquarium aquarium;

    public Animator(CreativeAquarium aquarium) {
        this.setAquarium(aquarium);
    }

    public void actionPerformed(ActionEvent arg0) {
        CreativeAquarium aquarium = this.getAquarium();
        Panel dPanel = aquarium.getPanel();
        dPanel.moveEverythingOneStep();
        dPanel.repaint();
    }

    public CreativeAquarium getAquarium() {
        return aquarium;
    }

    public void setAquarium(CreativeAquarium aquarium) {
        this.aquarium = aquarium;
    }

}