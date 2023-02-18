package eva1_6_automovil;

public class Datos {

    private String marca;
    private String modelo;
    private String placas;
    private int año;
    private String dueño;

    //Constructor default
    public Datos() {
        marca = "";
        modelo = "";
        placas = "";
        año = 0;
        dueño = "";
    }

    //Constructor con atributos
    public Datos(int inAño) {
        año = inAño;
    }
    //Metodos get y set
    public void setMarca(String inMarca){
        marca = inMarca;
    }
    public void setModelo(String inModelo){
        modelo = inModelo;
    }
    public void setDueño(String inDueño){
        dueño = inDueño;
    }
    public void setPlacas(String inPlacas){
        placas = inPlacas;
    }

    //Calcular adeudo
    public int calcularAdeudo() {
        int adeudo = 0;
        if (año <= 2000) {
            adeudo = 1500;
        } else if (año >= 2001 && año <= 2005) {
            adeudo = 2000;
        } else if (año >= 2006 && año <= 2010) {
            adeudo = 2500;
        } else if (año >= 2011 && año <= 2015) {
            adeudo = 3000;
        } else if (año > 2016){
            adeudo = 4000;
        }
        return adeudo;
    }
    //Imprimir información
    public void imprimirInfo(){
        String text = "El carro con placas "+placas+" a nombre de "+dueño+" del año "
                + año+" marca y modelo "+marca+" "+modelo+" cuenta con un adeudo de "
                +"$" +calcularAdeudo() +" pesos";
        System.out.println(text);
    
    }
}
