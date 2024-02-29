package src.Moduuli6.tehtava3.controller;

import src.Moduuli6.tehtava3.model.Pet;

public class PetController {
    public void movePet(Pet pet, double targetX, double targetY) {
        double dx = targetX - pet.getX();
        double dy = targetY - pet.getY();
        double distance = Math.sqrt(dx * dx + dy * dy);

        if (distance > 1) {
            pet.setX(pet.getX() + dx / distance);
            pet.setY(pet.getY() + dy / distance);
        }
    }
}