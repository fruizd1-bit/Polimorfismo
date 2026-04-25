package polimorfismo;

public class Main10 {
  
	public static void main(String[] args) {
        Trabajador t = new TrabajadorPorHora(8, 50);
        System.out.println("Pago: Q" + t.calcularPago());
    }
}

/*
Usé herencia.
Override en calcularPago().
Probé con trabajador por hora.
*/