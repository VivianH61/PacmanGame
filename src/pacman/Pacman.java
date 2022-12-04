package pacman;



import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.io.*;

public class Pacman extends Circle {

    public Pacman(double x, double y) {
        this.setCenterX(x);
        this.setCenterY(y);
        this.setRadius(25);
        Image img = new Image("./img/pacman.png");
        ImagePattern pattern = new ImagePattern(img);
        this.setFill(pattern);
    }
    /*
    public void setDirection(String dir) {
    	switch (dir) {
    		case "left":
    			Image img = new Image("./img/pacman_left.png");
    	        ImagePattern pattern = new ImagePattern(img);
    	        this.setFill(pattern);
    			break;
    		case "right":
    			Image img_right = new Image("./img/pacman_right.png");
    	        ImagePattern pattern_right = new ImagePattern(img_right);
    	        this.setFill(pattern_right);
    			break;
    		case "up":
    			Image img_up = new Image("./img/pacman_up.png");
    	        ImagePattern pattern_up = new ImagePattern(img_up);
    	        this.setFill(pattern_up);
    			break;
    		case "down":
    			Image img_down = new Image("./img/pacman_down.png");
    	        ImagePattern pattern_down = new ImagePattern(img_down);
    	        this.setFill(pattern_down);
    			break;
    	}
    }
    */
}
