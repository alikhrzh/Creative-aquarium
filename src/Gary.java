import java.awt.*;

public class Gary extends DrawImage{

    private int speed;
    private boolean movingRight;

    public Gary(Panel drawArea, String imageFile, int speed, boolean facingRight) {

        // Uses the constructor to DrawableImage to set the area, image, and image dimensions
        // to use while drawing
        super(drawArea, imageFile, 150, 100);

        // Set the fish speed
        this.setSpeed(speed);

        // Does the initial graphic show the fish facing right? If so, let the fish start
        // out moving in that direction
        this.setMovingRight(facingRight);
    }

    public void initialize() {

        int xPos, yPos;

        // This finds a random y coordinate to place the fish so that it is
        // not too hi
        // If the fish starts moving right, start the fish at the left edge

        xPos = 600+this.getWidth();
        int h = this.getWindowHeight();
        if(h == 0){
            h = 800;
        }
        this.setX(xPos);
        this.setY(h-this.getHeight()+100);
    }

    public void moveOneStep() {

        int nextX = 600;

        // TODO: Move the fish forward this.getSpeed() pixels in the right or left
        // direction, but if it gets to the edge, reverse the direction of the fish
        if(movingRight) {
            nextX = this.getX() + this.getSpeed();
            if(nextX+this.getWidth() >= this.getWindowWidth()) {
                reverseDirection();
                nextX = this.getWindowWidth() - this.getWidth();
            }
        }
        else{
            nextX = this.getX() - this.getSpeed();
            if(nextX-this.getWidth() <= 600) {
                reverseDirection();
                nextX = 600+this.getWidth();
            }
        }
        this.setX(nextX);
    }

    protected void reverseDirection() {

        // Flips the image to be rendered
        this.horizontalFlip();

        // Now change the direction of movement
        boolean movingRight = this.isMovingRight();
        this.setMovingRight(!movingRight);
    }



    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isMovingRight() {
        return movingRight;
    }

    public void setMovingRight(boolean movingRight) {
        this.movingRight = movingRight;
    }

}
