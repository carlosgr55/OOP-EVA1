package eva1_3_constructores;

public class CuentaBancaria {

    //Declaración de atributos
    private String numeroCuenta;
    private double saldo;
    private String cliente;

    //Constructores
    //Constructor default y con atributos
    public CuentaBancaria() { //Constructor default
        numeroCuenta = "0";
        saldo = 0;
        cliente = "";

    }
    //Constructor con atributos
    public CuentaBancaria(String nomCuenta, double nSaldo, String nCliente ){
        numeroCuenta = nomCuenta;
        saldo = nSaldo;
        cliente = nCliente;
    }

    //Métodos get y set
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String inNumeroCuenta) {
        numeroCuenta = inNumeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double inSaldo) {
        saldo = inSaldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String inCliente) {
        cliente = inCliente;
    }
}
