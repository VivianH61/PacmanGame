package pacman;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Door extends Rectangle {

    public static double THICKNESS = 25;
    /**
     *
     * @param x
     * @param y
     * @param orientation - horizontal or vertical
     * @param length - the length of the bar (1 == 100px)
     */
    public Door(double x, double y, String orientation, double length) {
        this.setX(x);
        this.setY(y);
        if (orientation.equals("horizontal")) {
            this.setHeight(Door.THICKNESS);
            this.setWidth(length * Door.THICKNESS);
        } else {
            this.setHeight(length * Door.THICKNESS);
            this.setWidth(BarObstacle.THICKNESS);
        }
        this.setFill(Color.YELLOW);
        this.setStrokeWidth(3);
    }
}