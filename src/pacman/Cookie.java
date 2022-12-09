package pacman;



import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;


public class Cookie extends Dot {
    public Cookie(double x, double y) {
    	super(x, y);
    	this.value = 1;
    	this.change_life = 0;
    	Image img = new Image("./img/cookie.png");
        ImagePattern pattern = new ImagePattern(img);
        this.setFill(pattern);
    }

}