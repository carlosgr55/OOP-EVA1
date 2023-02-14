/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_4_tele;

public class Television {

    private int volumen;
    private int canal;
    private boolean estado;

    //Constructores
    public Television() {
        volumen = 2;
        canal = 1;
        estado = false; //T encendido, F apagado    
    }

    //Controles de TV
    //Encender y apagar TV
    public void cambiarEstadoPoder() {
        //Verificar estado TV
        if (estado) {
            estado = false;
            System.out.println("Apagando");
        } else {
            estado = true;
            System.out.println("Encendiendo");
        }
    }

    //Control de volumen
    public void subirVol() {
        //Solo se puede subir el volumen cuando la TV está encendida
        if (estado && volumen < 100) {
            volumen++;
            System.out.println("Volumen " + volumen);

        }
    }

    public void bajarVol() {
        //Solo se puede bajar el volumen cuando la tele está encendida
        if (estado && volumen > 0) {
            volumen--;
            System.out.println("Volumen " + volumen);
        }
    }

    //Control de canal
    public void subirCanal() {
        if (estado && canal < 100) {
            canal++;
            System.out.println("Canal " + canal);

        } else if (estado && canal == 100) {
            canal = 0;
            System.out.println("Canal " + canal);
        }
    }

    public void bajarCanal() {
        if (estado && canal > 0) {

            canal--;
            System.out.println("Canal " + canal);

        } else if (estado && canal == 0) {
            canal = 100;
            System.out.println("Canal " + canal);
        }
    }

    public void irCanal(int inCanal) {
        if (estado) {
            canal = inCanal;
            System.out.println("Canal " + canal);
        }
    }
}
