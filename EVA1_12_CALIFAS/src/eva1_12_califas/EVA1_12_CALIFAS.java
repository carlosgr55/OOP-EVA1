package eva1_12_califas;

public class EVA1_12_CALIFAS {

    public static void main(String[] args) {
        // TODO code application logic here
        String calificacion = calCalif(78); //Se invoca y guarda en variable
        System.out.println("Calif para 78 "+calificacion);
        System.out.println("Calif para 90 "+calCalif(90)); //Se invoca en otra función
        calCalif(100); //El resultado se ignora
    }

    public static String calCalif(int calif) {
        String letra = "";
        if ((calif >= 91) && (calif <= 100)) {
            letra = "A";
        } else if ((calif >= 81) && (calif <= 90)) {
            letra = "B";
        } else if ((calif >= 71) && (calif <= 80)) {
            letra = "C";
        } else if (calif <= 70) {
            letra = "D";
        }
        return letra;
    }
}
