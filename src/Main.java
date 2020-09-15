import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/welcome.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Welcome | HTMLStudio");
        stage.setResizable(false);
        stage.show();
    }
}
