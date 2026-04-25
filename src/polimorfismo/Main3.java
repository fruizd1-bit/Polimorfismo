package polimorfismo;

public class Main3 {
    public static void main(String[] args) {

        Empleado emp = new Vendedor("Carlos", 500);
        emp.resumen();
    }
}

/*
Herencia aplicada.
Override en resumen().
Se probó con objeto Vendedor como Empleado.
*/