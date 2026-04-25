package polimorfismo;

public class Estudiante extends Persona {
    private String carnet;
    private String carrera;

    public Estudiante(String carnet, String carrera) {
        this.carnet = carnet;
        this.carrera = carrera;
    }

    @Override
    public void presentarse() {
        System.out.println("Soy estudiante, carnet: " + carnet + " carrera: " + carrera);
    }
}