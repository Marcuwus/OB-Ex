public class Control {
    public static void main(String[] args) {
        int numerolf = 8;
        int numeroWhile = 0;
        String estacion = "otoño";

        if (numerolf > 0){
            System.out.println("Es mayor a 0");
        } else if (numerolf < 0) {
            System.out.println("Es menor a 0");
        } else {
            System.out.println("Es 0.");
        }

        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

/*
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);
 */

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        System.out.println(switch (estacion) {
            case "primavera" -> "Es primavera! :)";
            case "verano" -> "Es verano! :)";
            case "otoño" -> "Es otoño! :)";
            case "invierno" -> "Es invierno! :)";
            default -> "Estación no válida.";
        });
    }
}
