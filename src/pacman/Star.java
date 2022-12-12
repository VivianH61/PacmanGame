package pacman;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

public class Star extends Dot {
	public Star(double x, double y) {
		super(x, y);
		this.value = 5;
		this.life_value = 0;
		Image img = new Image("./img/star.png");
        ImagePattern pattern = new ImagePattern(img);
        this.setFill(pattern);
	}

}
