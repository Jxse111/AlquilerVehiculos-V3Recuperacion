package vista.utilidades;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage escenarioPrincipal) {
		try {
			Parent raiz = FXMLLoader.load(getClass().getResource("panelPrincipal.fxml"));
			
			Scene escena = new Scene(raiz);
			escenarioPrincipal.setTitle("Hola mundo desde JavaFX");
			escenarioPrincipal.setScene(escena);
			escenarioPrincipal.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}