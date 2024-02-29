// Main.java
package src.Moduuli6.tehtava3;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import src.Moduuli6.tehtava3.controller.PetController;
import src.Moduuli6.tehtava3.model.Pet;
import src.Moduuli6.tehtava3.view.PetView;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pet pet = new Pet(400, 300); // Initialize the pet at the center of the canvas
        PetController controller = new PetController();
        PetView view = new PetView(pet, controller);

        Group root = new Group();
        root.getChildren().add(view);
        Scene scene = new Scene(root, 800, 600);

        primaryStage.setScene(scene);
        primaryStage.show();

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (view.getMouseX() != -1 && view.getMouseY() != -1) {
                    controller.movePet(pet, view.getMouseX(), view.getMouseY());
                }
                view.drawPet(view.getGraphicsContext2D());
            }
        }.start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}