package eva1_17_circulo_2;

public class EVA1_17_SOBRECARGA_AREAS {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Circulo " + area(10));
        System.out.println("Triangulo " + area(5, 8));
        System.out.println("Trapecio " + area(7, 8, 10));
    }

    //Area de circulo
    public static double area(double x) {
        return Math.PI * x * x;
    }

    //Area de triangulo
    public static double area(double x, double y) {
        return (x * y) / 2;
    }

    //Area de trapecio
    public static double area(double x, double y, double z) {
        return ((x + y) * z) / 2;
    }

}
