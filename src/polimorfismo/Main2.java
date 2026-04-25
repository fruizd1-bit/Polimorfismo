package polimorfismo;

public class Main2 {
    public static void main(String[] args) {

        Figura figura = new Rectangulo(5, 4);
        System.out.println("Area: " + figura.area());
    }
}

/*
Usé herencia.
Sobrescribí area().
Probé con un Rectangulo usando referencia Figura.
*/
