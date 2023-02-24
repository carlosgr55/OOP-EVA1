package eva1_13_alcance;

public class EVA1_13_ALCANCE {
    public static void main(String[] args) {
        // TODO code application logic here
        int x=100; //Visible para todo lo que está en el main
        for (int i = 0; i < 10; i++) { //Incia el ciclo for
            System.out.println("i = "+ i);
            int j = 100; //Es visible desde aquí
            System.out.println("j = "+j);
            System.out.println("x = "+x);
            {
                int z=1000;
                System.out.println("z = "+z);
            }
           
        }//Termina bloque for
    }
    
    public static void algo(){
    
        System.out.println("x = ");
        
    }
       
}
