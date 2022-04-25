package mediaPlayer;

import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.layout.VBox;
import javafx.stage.*;

public class UIApplication extends Application {
	@Override
	public void start(Stage stage) throws Exception{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/mediaPlayer.fxml"));
		VBox root = (VBox) loader.load();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Media Player");
		stage.show();
	}
	
	public static void run(String arg[]) {
		Application.launch(arg);
	}
}
