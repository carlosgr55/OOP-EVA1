package eva1_5_circulo;

public class Datos {

    private double area;
    private double perimetro;
    private double radio;
    private double pi = 3.14159;

    //Constructor default
    public Datos() {
        radio = 1;
        area = pi * radio * radio;
        perimetro = pi * 2 * radio;
    }

    //Constructor para solicitar radio
    public Datos(double inRadio) {
        radio = inRadio;
    }

    //Metodo para calcular area
    public void calArea() {
        //Solo puede calcularse cuando el radio sea mayor que 0
        if (radio > 0) {
            area = pi * Math.pow(radio, 2);
            System.out.println("El area del circulo es " + area);
        } else {
            System.out.println("No es posible hacer los calculos porque radio < 0");
        }
    }

    //Metodo para calcular el perimetro
    public void calcPerimetro() {
        //Solo puede calcularse cuando el radio sea mayor que 0

        if (radio > 0) {
            perimetro = 2 * radio * pi;
            System.out.println("El perimetro del circulo es " + perimetro);
        } else {
            System.out.println("No es posible hacer los calculos porque radio < 0");

        }
    }

    //Get perimetro
    public double getPerimetro() {
        return perimetro;
    }

    //Set perimetro
    public void setPerimetrio(double inPerimetro) {
        perimetro = inPerimetro;

    }

    //Get area
    public double getArea() {
        return area;
    }

    //Set area
    public void setArea(double inArea) {
        area = inArea;

    }

    //Get radio
    public double getRadio() {
        return radio;
    }

    //Set radio
    public void setRadio(double inRadio) {
        radio = inRadio;

    }

}
