
import java.util.Random;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        int chapulinAmount = 0;
        boolean finished = false;
        boolean Left = false;
        boolean checkIfDone = false;
        int puestosAmount = 0;
        int combinations = 0;
        Random random = new Random();
        String nameChapulin = "";

        Scanner scanner = new Scanner(System.in);

//Asks for the amount of chapulines the user wants to compete
        System.out.println("Por favor digite el numero de chapulines: ");
        chapulinAmount = scanner.nextInt();
        System.out.println("El numero de chapulines es: " + chapulinAmount);
//Creates an array called Chapulines
        String[] Chapulines = new String[chapulinAmount];

//Asks the user for the names of the chapulin
        for (int i = 0; i < chapulinAmount; i++){

            System.out.println("Por favor digite el nombre de este chapulín");
            System.out.println("Ingrese el nombre como una sola palabra o con barra baja");
            System.out.println("AsiPorEjemplo o Asi_Por_Ejemplo");
            Chapulines[i] = scanner.next();
        }

        int randomChapulin = random.nextInt(chapulinAmount);





        //In case you want to print it to check
//        for (int o = 0; o < chapulinAmount; o++) {
//            System.out.print(Chapulines[o]);
//            System.out.print(" "); // Add space for better formatting
//        }





//Asks for the amount of routes or posts the user wants the race to have
        System.out.println("Por favor digite el numero de puestos o rutas: ");
        puestosAmount = scanner.nextInt();
        System.out.println("El numero de puestos es: " + puestosAmount);
        String[] Puestos = new String[puestosAmount];

        for (int i = 0; i < puestosAmount; i++){

            System.out.println("Por favor digite el nombre de este puesto");
            System.out.println("Ingrese el nombre como una sola palabra o con barra baja");
            System.out.println("AsiPorEjemplo o Asi_Por_Ejemplo");
            Puestos[i] = scanner.next();

        }

        int[][] tiempos = new int[chapulinAmount][puestosAmount];
        for (int i = 0; i < puestosAmount-1; i++){

            for (int j = 0; j < chapulinAmount-1; j++) {

                tiempos[i][j] = 0;;

            }
        }




        System.out.println("¡¡¡QUE EMPIECE LA CARRERA!!!");
        finished = false;


        while (finished == false){
            checkIfDone = false;
            if (combinations >= (chapulinAmount*puestosAmount)){finished = true; checkIfDone = true;}

            System.out.println("Check1");





            while (checkIfDone == false) {

                randomChapulin = random.nextInt(chapulinAmount);


                for (int j = 0; j < chapulinAmount && checkIfDone == false; j++) {

                    System.out.println("Check2");
                    if (combinations >= (chapulinAmount*puestosAmount)){finished = false; checkIfDone = true;}

                    if (tiempos[j][randomChapulin] == 0) {

                        var currentChapulin = Chapulines[randomChapulin];
                        var currentPuesto = Puestos[j];
                        System.out.println("Por favor digite el tiempo de "+ currentChapulin);
                        System.out.println(currentChapulin + " está en: " + currentPuesto);
                        tiempos[j][randomChapulin] = scanner.nextInt();
                        checkIfDone = true;
                         combinations ++;

                    }

                }




            }


        }




        System.out.println("Check malvado");


        for (int i = 0; i < chapulinAmount; i++) {
            System.out.print(Chapulines[i] + ":");
            for (int j = 0; j < puestosAmount; j++) {
                System.out.print(tiempos[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }








    }
}