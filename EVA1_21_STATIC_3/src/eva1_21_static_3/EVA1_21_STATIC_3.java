package eva1_21_static_3;

public class EVA1_21_STATIC_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Prueba.valor);
        Prueba.valor++;
        System.out.println(Prueba.valor);//Variable modificada
        
        System.out.println("OBJETOS");
        PruebaObjetos objeto = new PruebaObjetos();
        System.out.println(objeto.valor);
        objeto.valor++;
        System.out.println(objeto.valor);
        
        PruebaObjetos objeto2 = new PruebaObjetos();
        System.out.println(objeto2.valor);
        
        
    }
    
}
class Prueba{
    public static int valor = 10;
}
class PruebaObjetos{
    public int valor = 15;
}