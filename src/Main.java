public class Main {
    public static int suma (int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public static void main(String[] args) {
        System.out.println(suma(4,5,6));
        Coche miCoche = new Coche();
        miCoche.puertas = 2;
        miCoche.agregarPuerta(1);
        if (miCoche.puertas == 1){
            System.out.println("Mi coche tiene " + miCoche.puertas + " puerta");
        } else {
            System.out.println("Mi coche tiene " + miCoche.puertas + " puertas");
        }
    }
}
