import java.awt.*;

public class Patrick extends DrawImage {
    public void moveOneStep(){

    }
    public Patrick(Panel area, String imageFile) {
        super(area, imageFile, 200, 150);
    }
    public void initialize(){
        int h = this.getWindowHeight();
        if(h == 0){
            h = 900;
        }
        this.setX(400);
        this.setY(h-this.getHeight());
    }
}
