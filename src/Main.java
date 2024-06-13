
//DISCLAIMER: ! ! ! ! ! !
//The code works, but just with the same amount of chapulines and puestos
//I dont know why it breaks, it just does
//If i knew i would break i wouldve drastically change the code to a much simpler one, but it cant be helped
//I cant even begin to describe the headache this test gave me
//But ill do better next time, and thats a promise.



/*=================================================================================
Study Center....: Universidad Tecnica Nacional
Campus..........: Pacifico (JRMP)
College career..: Ingenieria en Tecnologias de Información
Period..........: 2C-2024
Course..........: ITI-221 - Programación I
Document........: Examen 1
Goals...........: Declare and use of arrays, matrix and cube
Professor.......: Jorge Ruiz (york)
Student.........: Brandon Conejo Quirós
=================================================================================*/
/*=================================================================================*/

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
        int sumaTiempo = 0;
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

        //Creates and fills the tiempos matrix

        int[][] tiempos = new int[chapulinAmount][puestosAmount];
        for (int i = 0; i < puestosAmount-1; i++){

            for (int j = 0; j < chapulinAmount-1; j++) {

                tiempos[i][j] = 0;;

            }
        }




        System.out.println("¡¡¡QUE EMPIECE LA CARRERA!!!");
        finished = false;


        //To summarize this mess: It checks if combinations is greater than the x and y of the matrix multiplied together



        while (finished == false){
            checkIfDone = false;
            if (combinations >= (chapulinAmount*puestosAmount)){finished = true; checkIfDone = true;}




            while (checkIfDone == false) {

                //Creates randomness
                randomChapulin = random.nextInt(chapulinAmount);


                for (int j = 0; j < chapulinAmount && checkIfDone == false; j++) {


                    if (combinations >= (chapulinAmount*puestosAmount)){finished = false; checkIfDone = true;}

                    //This looks for any space in the matrix that doesnt have a 0 as its value, and lets the user fill it
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





        //Prints everything

        for (int i = 0; i < puestosAmount; i++) {
            System.out.print(Puestos[i] + " : ");
            for (int j = 0; j < chapulinAmount; j++) {

                System.out.print(Chapulines[j] + ":");
                System.out.print(tiempos[i][j]);
                System.out.print(" ");

            }

            System.out.println();
        }






    }
}