public class Car {
    private String model;
    private String color;
    private int speed;
    private static final int MAX_SPEED = 120;
    private static final int MIN_SPEED = 0;
    private static final int INITIAL_SPEED = 0;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = INITIAL_SPEED;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void speedUp() {
        if (speed + 10 <= MAX_SPEED) {
            speed += 10;
            // afficher détails
            System.out.println("Modele : " + model);
            System.out.println("Couleur : " + color);
            System.out.println("Vitesse actuelle : " + speed);
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void slowDown() {
        if (speed - 10 >= MIN_SPEED) {
            speed -= 10;
            // afficher détails
            System.out.println("Modèle : " + model);
            System.out.println("Couleur : " + color);
            System.out.println("Vitesse actuelle : " + speed);
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}

