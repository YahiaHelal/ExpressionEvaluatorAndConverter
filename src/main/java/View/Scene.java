package View;

import javafx.scene.Node;

public interface Scene {

    void initializeControls();

    void renderScene();

    void applyStyles();

    void addActions();

    javafx.scene.Scene getScene();

    Node getAsElement();

}
