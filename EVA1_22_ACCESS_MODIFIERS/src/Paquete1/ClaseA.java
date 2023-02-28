/*
 * 
 */
package Paquete1;

import Paquete2.ClaseE;

/**
 *
 * @author gambo
 */
public class ClaseA {
    public int publicA;
    int defaultA;
    private int privateA;

    public void prueba() {
        ClaseB objB = new ClaseB();

        /*Estos dos atributos son visibles
        objB.defaultB;
        objB.publicB;
         */
        ClaseC objC = new ClaseC();
        /*Atributos visibles de la clase C
        objC.defaultC;
        objC.publicC;
         */
        ClaseD objD = new ClaseD();

        /*Atributos visibles
        Es default en otro archivo pero en otro paquete
        objD.defaultD;
        objD.publicD;
         */
        //La clase en otro paquete solo puede ser visible cuando 
        //El paquete es importado a la clase con el import
        ClaseE objE = new ClaseE();
        //Solo es visible los atributos públicos
        //objE.publicE;
        //La clase F es default en el paquete 2 por lo que no es visible desde
        //El paquete 1
        //ClaseF objF = new ClaseF();

    }
}

class ClaseB {

    public int publicB;
    int defaultB;
    private int privateB;

}
