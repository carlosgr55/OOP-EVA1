package eva1_5_circulo;

public class EVA1_5_CIRCULO {

    public static void main(String[] args) {
        // TODO code application logic here
        Datos circulo = new Datos(-7);

        //Calculos cuando radio es menor a 0
        circulo.calArea();
        circulo.calcPerimetro();
        //Se cambia el radio
        circulo.setRadio(3);
        circulo.calArea();
        circulo.calcPerimetro();

        //Se utiliza el constructor con atributos
        System.out.println(" ");
        Datos circulo2 = new Datos(0.5);
        circulo2.calArea();
        circulo2.calcPerimetro();

        //Se utilizan los metodos get y set
        System.out.println(" ");
        Datos circulo3 = new Datos();
        circulo3.setArea(12);
        System.out.println("El area se definió en " + circulo3.getArea());
        circulo.setPerimetrio(7);
        System.out.println("El perimetro se definió " + circulo3.getPerimetro());

        //Constructor default
        System.out.println(" ");
        Datos circulo4 = new Datos();
        System.out.println("El radio es " + circulo4.getRadio());
        System.out.println("El area es " + circulo4.getArea());
        System.out.println("El perimetro es " + circulo4.getPerimetro());
    }

}
