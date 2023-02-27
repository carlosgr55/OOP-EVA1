package eva1_20_static_2;

public class EVA1_20_STATIC_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        /*final int x;
        x = 50;
        x = 5393; Solo se puede asignar una ve<
        */
        FormulasGeometria calculos = new FormulasGeometria();
        //calculos. no existe nada para los objetos todo es static
        System.out.println("pi "+FormulasGeometria.PI);
        double triangulo = FormulasGeometria.areaTriangulo(5.0,9.0);
        System.out.println("Area triangulo "+triangulo);
        System.out.println("Volumen esfera "+FormulasGeometria.volumenEsfera(10));
    }

}
