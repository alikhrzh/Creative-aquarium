import java.awt.*;
public class SquidwardHouse extends DrawImage{
    public void moveOneStep(){

    }
    public SquidwardHouse(Panel area, String imageFile) {
        super(area, imageFile, 300, 350);
    }
    public void initialize(){
        int h = this.getWindowHeight();
        if(h == 0){
            h = 800;
        }
        this.setX(600);
        this.setY(h-this.getHeight()-60);
    }
}
