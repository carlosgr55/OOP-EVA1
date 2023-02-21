/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_llamar_funcion;

/**
 *
 * @author gambo
 */
public class EVA1_8_LLAMAR_FUNCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Iniciamos el main");
        A(); //Invocando A
        System.out.println("Acaba main");
    }

    public static void A() {
        System.out.println("Iniciamos A()");
        B(); //Invocando a B
        System.out.println("Termina A()");

    }

    public static void B() {
        System.out.println("Iniciamos B()");
        System.out.println("Termina B()");

    }
}
