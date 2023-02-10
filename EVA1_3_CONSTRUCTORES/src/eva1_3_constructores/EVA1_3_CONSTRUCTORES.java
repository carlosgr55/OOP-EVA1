package eva1_3_constructores;

public class EVA1_3_CONSTRUCTORES {

    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancaria cuenta1 = new CuentaBancaria("Carlos Slim",  40000 , "56123");

        /* Valores Carlos Slim
        cuenta1.setCliente("Carlos Slim");
        cuenta1.setNumeroCuenta("1");
        cuenta1.setSaldo(40000000);
         */
        String nombre = cuenta1.getCliente();
        System.out.println("Datos del cliente :");
        System.out.println(nombre);
        System.out.println(cuenta1.getNumeroCuenta());
        System.out.println(cuenta1.getSaldo());

        //OBJETO 2 -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
        CuentaBancaria cuenta2 = new CuentaBancaria("Carlos Gamboa", 10, "15631");
        String nombre2 = cuenta2.getCliente();
        System.out.println("Datos del cliente :");
        System.out.println(nombre2);
        System.out.println(cuenta2.getNumeroCuenta());
        System.out.println("$"+cuenta2.getSaldo());

    }

}
