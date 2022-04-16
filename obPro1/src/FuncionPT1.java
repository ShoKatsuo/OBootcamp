
//Primera parte:
//  Crear una función con tres parámetros que sean números que se suman entre sí.
//  Llamar a la función en el main y darle valores

public class FuncionPT1 {
    public static void main(String[] args) {
        int resultado=0;
        resultado = suma(1,2,3);

        System.out.println(resultado);
    }


    public static int suma (int a, int b, int c){
        return a+b+c;
    }
}

