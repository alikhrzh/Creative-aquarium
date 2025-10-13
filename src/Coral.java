import java.awt.*;

public class Coral extends DrawImage {
    public void moveOneStep(){

    }
    public Coral(Panel area, String imageFile) {
        super(area, imageFile, 200, 250);
    }
    public void initialize(){
        int h = this.getWindowHeight();
        if(h == 0){
            h = 900;
        }
        this.setX(0);
        this.setY(h-this.getHeight());
    }
}
