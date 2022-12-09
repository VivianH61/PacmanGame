package pacman;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public abstract class Dot extends Circle {
	public int value;
	public int life_value;
	public Dot(double x, double y) {
        //this.value = 5;
        this.setCenterX(x);
        this.setCenterY(y);
        this.setRadius(14.5);
        this.setFill(Color.SADDLEBROWN);
    }
	
	public int getValue() {
        return value;
    }
	
	public int getLifeValue() {
		return this.life_value;
	}

    public void hide() {
        this.setVisible(false);
    }

    public void show() {
        this.setVisible(true);
    }
}
