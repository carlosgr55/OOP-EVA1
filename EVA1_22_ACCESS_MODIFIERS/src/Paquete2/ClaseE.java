/*
 * 
 */
package Paquete2;

import Paquete1.ClaseA;
import Paquete1.ClaseC;

/**
 *
 * @author gambo
 */
public class ClaseE {

    public int publicE;
    int defaultE;
    private int privateE;

    public void prueba() {
        
        //La clase es default y sí es visible dentro del mismo paquete
        ClaseF objF = new ClaseF();
        //objF.defaultF;
        //objF.publicF;
        
        //La clase tiene que ser importada y solo son visibles los
        //Atributos publicos
        ClaseA objA = new ClaseA();
        //objA.publicA;
        
        //La clase es default y está en otro paquete, no es visible
        //ClaseB objB = new ClaseB();
        
        //La clase tiene que ser importada y solo son visibles los
        //Atributos publicos
        ClaseC objC = new ClaseC();
        //objC.publicC;}
        
        //La clase es default y está en otro paquete, no es visible
        //ClaseD objD = new ClaseD();
        
    }
}

class ClaseF {

    public int publicF;
    int defaultF;
    private int privateF;
}
