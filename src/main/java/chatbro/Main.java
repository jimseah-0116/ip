package chatbro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private ChatBro chatBro;
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
            AnchorPane ap = fxmlLoader.load();
            Scene scene = new Scene(ap);
            stage.setScene(scene);
            stage.setTitle("ChatBro");
            chatBro = new ChatBro();
            fxmlLoader.<MainWindow>getController().setChatBro(chatBro);
            stage.show();
        } catch (WrongFileFormatException wffe) {
            showAlert(wffe.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Shows an alert with window name "Information" with the given message.
     *
     * @param message The message to be shown in the alert.
     */
    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);

        alert.showAndWait();
    }
}
