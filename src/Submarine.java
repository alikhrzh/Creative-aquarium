import java.awt.*;

public class Submarine extends DrawImage{

    private int speed;
    private int flow = 0;
    private boolean up = true;
    public Submarine(Panel drawArea, String imageFile, int speed) {


        super(drawArea, imageFile, 200, 150);


        this.setSpeed(speed);

        // Does the initial graphic show the fish facing right? If so, let the fish start
        // out moving in that direction

    }

    public void initialize() {

        int h = getWindowHeight();
        if (h==0){
            h = 800;
        }
        setX(this.getWindowWidth());
        setY(this.getWindowHeight()+50);
    }

    public void moveOneStep() {
        int newxpos = this.getX()-this.speed;
        if(newxpos+this.getWidth()<=0){
            newxpos=this.getWindowWidth();
        }
        this.setX(newxpos);
        if(up){
            flow++;
            if(flow>=5){
                up = false;
            }
        }
        else{
            flow--;
            if(flow<=-5){
                up = true;
            }
        }
        setY(this.getY()+flow);
    }



    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}
