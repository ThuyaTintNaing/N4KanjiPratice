package javafx_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class loader extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage st) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("kanji_project.fxml"));
		Scene sc = new Scene(root);
		st.setScene(sc);
		st.setTitle("N4 Kanji Practise");
		st.centerOnScreen();
		st.setResizable(false);
		st.getIcons().add(new Image("/javafx_project/images/logo.png"));
		st.show();
	}
	
}
