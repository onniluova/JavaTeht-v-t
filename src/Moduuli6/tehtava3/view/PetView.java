// PetView.java
package src.Moduuli6.tehtava3.view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import src.Moduuli6.tehtava3.controller.PetController;
import src.Moduuli6.tehtava3.model.Pet;

public class PetView extends Canvas {
    private Pet pet;
    private PetController controller;
    private Image petImage;
    private double mouseX = -1;
    private double mouseY = -1;

    public PetView(Pet pet, PetController controller) {
        this.pet = pet;
        this.controller = controller;
        this.petImage = new Image(getClass().getResource("/src/Moduuli6/images/pet.jpg").toExternalForm());

        // Set the size of the Canvas
        setWidth(800);
        setHeight(600);

        setOnMouseMoved(event -> {
            mouseX = event.getX();
            mouseY = event.getY();
        });

        setOnMouseExited(event -> {
            mouseX = -1;
            mouseY = -1;
        });
    }

    public void drawPet(GraphicsContext gc) {
        gc.clearRect(0, 0, getWidth(), getHeight());
        gc.drawImage(petImage, pet.getX() - 25, pet.getY() - 25, 50, 50);
    }

    public double getMouseX() {
        return mouseX;
    }

    public double getMouseY() {
        return mouseY;
    }
}