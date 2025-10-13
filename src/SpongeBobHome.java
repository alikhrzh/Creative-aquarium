import java.awt.*;
public class SpongeBobHome extends DrawImage{
    public void moveOneStep(){

    }
    public SpongeBobHome(Panel area, String imageFile) {
        super(area, imageFile, 300, 350);
    }
    public void initialize(){
        int h = this.getWindowHeight();
        if(h == 0){
            h = 800;
        }
        this.setX(1000);
        this.setY(h-this.getHeight()-20);
    }
}
