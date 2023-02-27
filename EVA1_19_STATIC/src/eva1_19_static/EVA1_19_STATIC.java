package eva1_19_static;

public class EVA1_19_STATIC {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Pi "+ Math.PI);
        System.out.println("Numero aleatorio "+ Math.random());
        Utilerias utilerias = new Utilerias();
        utilerias.Saludo();
        Utilerias.SaludoStatic();
        //Saludo2() solo existe cuando un objeto de la clase ha sido creado
        //Ya no que no es un metodo estatico
        EVA1_19_STATIC objeto = new EVA1_19_STATIC();
        objeto.Saludo2();
    }
    public void Saludo2(){
        System.out.println("Hola ");
    
    }

}

class Utilerias{
    //Este metodo solo existe hasta que se crea el objeto de la clase
    //Solo es posible usarlo a través de un objeto
    public void Saludo(){
        System.out.println("Holi !!!");
        
    }
    //Este método existe en cuanto el programa inicia
    //No es necesario crear un objeto para utilizarlo.
    //Se usa por medio de la clase y no por objetos
    public static void SaludoStatic(){
        System.out.println("Saludo estatico");
    }
}
class OtraClase{

}
