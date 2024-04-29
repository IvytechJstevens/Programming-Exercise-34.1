import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StaffManagement extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
        Parent root =
                FXMLLoader.load(getClass().getResource("StaffManagementUI.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("StaffManagement");
        stage.show();
    }
}