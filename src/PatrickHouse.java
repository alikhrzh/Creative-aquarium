public class PatrickHouse extends DrawImage{
    public void moveOneStep(){

    }
    public PatrickHouse(Panel area, String imageFile) {
        super(area, imageFile, 300, 350);
    }
    public void initialize(){
        int h = this.getWindowHeight();
        if(h == 0){
            h = 800;
        }
        this.setX(200);
        this.setY(h-this.getHeight()+30);
    }
}
