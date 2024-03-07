public class Driver {
    private String name;
    private int years;

    public Driver(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public boolean isAdult() {
        return years >= 10;
    }

    // !car variable!
    public void startCar(Voiture car) {
        if (isAdult()) {
            System.out.println(name + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void stopCar(Voiture car) {
        System.out.println(name + " arrête la voiture.");
    }

    public void changeSpeed(Voiture car, int newSpeed) {
        System.out.println(name + " change la vitesse de la voiture à " + newSpeed);
        int currentSpeed;
        if (car.getSpeed() >= newSpeed) {
            while (car.getSpeed() > newSpeed) {
                car.slowDown();
            }
        } else  {
            while (car.getSpeed() < newSpeed) {
                car.speedUp();
            }
        }
    }
}
