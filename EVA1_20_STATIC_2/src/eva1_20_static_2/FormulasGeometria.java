package eva1_20_static_2;

public class FormulasGeometria {
    
    //Constante
    public static final double PI = 3.14159;
    //Final solo se puede asignar una vez un valor a la variable (en variables)
    //Significado para clase (aun no vemos)
    
    //Areas
    //Calcular area de un triangulo
    public static double areaTriangulo(double base, double altura){
        return (1.0/2.0)*base*altura;
    }
    //Area de un circulo
    public static double areaCirculo(double radio){
        return PI*radio*radio;
    
    }    
        
    //Perimetros
    //Perimetro de un circulo
    public static double perimetroCirculo(double radio){
        return 2.0*radio*PI;  
    }
    //Volumen
    public static double volumenEsfera(double radio){
        return (4.0/3.0)*PI*radio*radio*radio;
    
    }
    

}
