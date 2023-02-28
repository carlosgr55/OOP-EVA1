/*
 * 
 */
package Paquete1;

import Paquete2.ClaseE;

/**
 *
 * @author gambo
 */
public class ClaseC {

    public int publicC;
    int defaultC;
    private int privateC;

    public void prueba() {
        ClaseA objA = new ClaseA();
        //objA.defaultA;
        //objA.publicA;
        ClaseB objB = new ClaseB();
        //objB.defaultB;
        //objB.publicB;

        ClaseD objD = new ClaseD();
        //objD.defaultD;
        //objD.publicD;

        ClaseE objE = new ClaseE();
        //objE.publicE;
        //ClaseF objF = new ClaseF();
        //La clase F no es visible

    }
}

class ClaseD {

    public int publicD;
    int defaultD;
    private int privateD;
}
