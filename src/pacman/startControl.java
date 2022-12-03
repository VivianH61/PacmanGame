package pacman;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class startControl {
	@FXML private ImageView startImage;
	@FXML
	private void initialize() {
//		Image image=new Image("startpage.png");
//		startImage.setImage(image);
	}
	
	public void changeWindow() throws Exception {
		SetUpScreen ss = new SetUpScreen();
		ss.showWindow();
		
		
	}


}
