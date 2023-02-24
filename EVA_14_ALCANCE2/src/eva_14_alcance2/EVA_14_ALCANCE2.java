package eva_14_alcance2;

public class EVA_14_ALCANCE2 {

    public static void main(String[] args) {
        int x = 100; //Visible en el bloque main
        for (int i = 0; i < 10; i++) {
            //int x = 100; //Declararada en main(), es visible dentro el for
            int y = 100;
            if(i == 5){
                
            }
        }
        int y = 100;//Fuera del for, se puede declarar otra vez
    }

}
