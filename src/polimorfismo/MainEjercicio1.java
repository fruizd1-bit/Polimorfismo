package polimorfismo;

public class MainEjercicio1 {
    public static void main(String[] args) {

        Animal animal = new Perro();
        animal.hacerSonido();
    }
}

/*
Usé herencia con extends.
Sobrescribí hacerSonido().
Probé creando un Perro pero guardado como Animal.
*/