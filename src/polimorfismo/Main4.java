package polimorfismo;

public class Main4 {
    public static void main(String[] args) {

        Cuenta cuenta = new CuentaAhorro(1000);
        cuenta.depositar(100);
        System.out.println("Saldo: " + cuenta.saldo);
    }
}