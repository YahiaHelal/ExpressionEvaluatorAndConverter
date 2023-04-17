package Application;

import View.ConvertersScene;
import View.EvaluatorScene;
import View.LandingScene;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    LandingScene landingScene = new LandingScene();
    ConvertersScene convertersScene = new ConvertersScene();
    EvaluatorScene evaluatorScene = new EvaluatorScene();

    static Stage mainStage;

    @Override
    public void start(Stage stage) throws IOException {

        mainStage = stage;
        stage.setResizable(false);
        Scene scene = landingScene.getScene();
        scene.getStylesheets().add("ApplicationStyles.css");
        stage.setTitle("Expression Evaluator and Converter");
        stage.setScene(scene);
        stage.show();
    }

    public static Stage getStage() {
        return mainStage;
    }

    public static void main(String[] args) {
        launch();
    }
}