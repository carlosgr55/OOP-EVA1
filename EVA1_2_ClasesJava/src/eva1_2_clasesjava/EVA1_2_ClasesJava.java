/*
    Carlos Rubén Gamboa Rosales 
    22550334
    OOP 9-10
 */
package eva1_2_clasesjava;

public class EVA1_2_ClasesJava {

    public static void main(String[] args) {
        // Clase de la receta
        // Objeto platillo
        //Instanciación
        /*
            1) Declarar identificador para el objeto
            2) Asignar memoria con new
            3) Invocar su constructor
         */
        //Persona() es un constructor, un constructor es un método
        Persona persona1 = new Persona();

        //Atributos iniciados con default
        /*
        persona1.nombre = "Carlos";
        persona1.apellido = "Gamboa";
        persona1.edad = 19;
        persona1.estadoCivil = false; //T casado, F soltero
        System.out.println(persona1.nombre + " " + persona1.apellido);
        System.out.println(persona1.edad);
         */
        persona1.setNombre("Carlos");
        System.out.println(persona1.getNombre());
    }

}
