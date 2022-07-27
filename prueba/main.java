package prueba;

public class main {

    public static void main (String[] args){
        Coche miCoche = new Coche();
        miCoche.añadirpuerta();
        System.out.println(miCoche.puertas);


        var resultado = suma(10, 50,85);

        System.out.println(resultado);

    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }

}

class Coche {
    public int puertas = 4;

    public void añadirpuerta() {
        this.puertas++;
    }
}
