// Segunda parte:
//  Crear una clase coche.
//  Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
//  Una función que incremente el número de puertas que tiene el coche.
//  Crear un objeto miCoche en el main y añadirle una puerta.
//  Mostrar el número de puertas que tiene el objeto.

public class FuncionPT2 {
    public static void main(String[] args){
        Coche miCoche = new Coche();
        miCoche.AñadirPuertas();
        if (miCoche.puertas ==1){
            System.out.println("Tienes " + miCoche.puertas + " puerta");
        }else {
            System.out.println("Tienes " + miCoche.puertas + " puertas");
        }

    }

    static class Coche {
        public int puertas = 0;

        public void AñadirPuertas() {
            this.puertas++;
        }
    }
}
