package eva1_18_sobrecarga_rfc;

public class EVA1_18_SOBRECARGA_RFC {

    public static void main(String[] args) {
        // TODO code application logic here
        String RFC = generarRFC("CARLOS", "GAMBOA", "ROSALES", 2003, 05, 05);
        System.out.println(RFC);
    }
    //Datos completos
    public static String generarRFC(String nombre, String aPat, String aMat, int año, int mes, int dia) {
        String ap1 = aPat.charAt(0) + "";
        String ap2 = aPat.charAt(1) + "";
        String am = aMat.charAt(0) + "";
        String nom = nombre.charAt(0) + "";
        String RFC = ap1 + ap2 + am + nom + año + mes + dia;
        return RFC;
    }
    //Falta apellido paterno
    public static String generarRFC(String nombre, String aPat, int año, int mes, int dia) {
        String ap1 = aPat.charAt(0)+"";
        String am = "X";
        String nom = nombre.charAt(0) + "";
        String RFC = ap1 + am + nom + año + mes + dia;
        return RFC;
    }
    //Sobrecarga sin ambos apellidos
    public static String generarRFC(String nombre, int año, int mes, int dia) {
        String ap1 = "X";
        String am = "X";
        String nom = nombre.charAt(0) + "";
        String RFC = ap1 + am + nom + año + mes + dia;
        return RFC;
    }

}
