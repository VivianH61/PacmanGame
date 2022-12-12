package pacman;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

public class Apple extends Dot {
	public Apple(double x, double y) {
    	super(x, y);
    	this.value = 5;
    	this.life_value = 1;
    	Image img = new Image("./img/apple.png");
        ImagePattern pattern = new ImagePattern(img);
        this.setFill(pattern);
    }
}
