package eva1_4_tele;

public class EVA1_4_TELE {

    public static void main(String[] args) {
        // TODO code application logic here
        Television TV = new Television();
        TV.cambiarEstadoPoder();
        TV.bajarVol();
        TV.bajarVol();
        TV.bajarVol();

        TV.bajarCanal();
        TV.bajarCanal();
        TV.bajarCanal();
        TV.cambiarEstadoPoder();
        TV.cambiarEstadoPoder();
        TV.subirVol();
    }

}
