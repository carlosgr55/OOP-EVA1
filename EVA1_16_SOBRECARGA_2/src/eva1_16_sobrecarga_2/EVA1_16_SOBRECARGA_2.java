/*
 * 
 */
package eva1_16_sobrecarga_2;

public class EVA1_16_SOBRECARGA_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(suma(5, 4));

        System.out.println(suma(5.13, 4.89));
        System.out.println(suma("Moto", "Mami"));
        System.out.println(suma("La ", "Rosalía"));
        suma();

    }
    //suma(int int)

    public static int suma(int x, int y) {
        return x + y;
    }
    //suma(double double)

    public static double suma(double x, double y) {
        return x + y;
    }
    //suma(String String)

    public static String suma(String x, String y) {
        return x + y;
    }
    //suma()

    public static void suma() {
        System.out.println("Metodo sin parametro");
    }

}
