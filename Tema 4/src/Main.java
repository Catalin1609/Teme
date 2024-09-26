import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         /*
         * 1) Sa se citeasca de la tastatura si apoi sa se afiseze cate o variabila care sa cuprinda fiecare tip de
              data primitiva. Pentru citirea de la tastatura folositi Scanner
         * */

/*        // Citire și afișare pentru tipul int
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un int " );
        int intValoare = scanner.nextInt();
        System.out.println("Int introdus: " + intValoare);

        // Citire și afișare pentru tipul short
        System.out.println("Introduceti un short: ");
        short shortValoare = scanner.nextShort();
        System.out.println("Short introdus: " + shortValoare);

        // Citire si afisare pentru tipul byte
        System.out.println("Introduceti un byte: ");
        byte byteValoare = scanner.nextByte();
        System.out.println("Byte introdus: " + byteValoare);

        // Citire și afișare pentru tipul long
        System.out.println("Introduceti un long: ");
        long longValoare = scanner.nextLong();
        System.out.println("Long introdus este: " + longValoare);

        // Citire si afisare pentru tipul float
        System.out.println("Introdu un float: ");
        float floatValoare = scanner.nextFloat();
        System.out.println("Float introdus este: " + floatValoare);

        // Citire si afisare pentru tipul double
        System.out.println("Introduceti un double: ");
        double doubleValoare = scanner.nextDouble();
        System.out.println("Double introdus este: " + doubleValoare);

        // Citeste si afiseaza pentru tipul Char
        System.out.println("Introduceti un char: ");
        char charVariable = scanner.next().charAt(0);
        System.out.println("Char introdus este: " + charVariable);

        // Citeste si afiseaza pentru tipul Boolean
        System.out.println("Introduceti un boolean (true/false): ");
        boolean booleanVariable = scanner.nextBoolean();
        System.out.println("Boolean introdus este: " + booleanVariable);*/

//--------------------------------------------------------------------------------------------------------------------------------------------------------

         /* 2) Se dau doua numere a = 5 si b = 7 citite de la tastatura. Afisati: suma, diferenta, rezultatul inmultirii
              si al impartirii intregi dintre cele doua numere.*/

        /*System.out.println("Introduceti o valoare pentru a: ");
        Scanner scannerA = new Scanner(System.in);
        int a = scannerA.nextInt();
        System.out.println("Introduceti o valoare pentru b: ");
        Scanner scannerB = new Scanner(System.in);
        int b = scannerB.nextInt();
        System.out.println("Suma celor doua numere este: " + (a + b));
        System.out.println("Diferenta celor doua numere este: " + (a - b));
        System.out.println("Rezultatul inmultirii este: " + (a * b));
        System.out.println("Rezultatul impartirii este: " + (a / b));*/

//------------------------------------------------------------------------------------------------------------------------------------------------------

        /*
         * 3) Cititi un numarul natural n de la tastatura.
              a. Printati primele n numere naturale.
              b. Printati primele numere pare mai mici decat n.
              c. Printati suma numerelor pana la n
         * */
        // a. Printati primele n numere naturale.
     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar natural: ");
        int n = scanner.nextInt();
        System.out.println("Ati introdus numarul " + n);
        for (int i = 0; i <= n-1; i++) {
            System.out.println("i = " + i);
        }*/

        // b. Printati primele numere pare mai mici decat n.
     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar natural: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }*/

        // c. Printati suma numerelor pana la n
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar natural: ");
        int n = scanner.nextInt();
        int suma = 0;
        for (int i = 0; i <= n-1; i++) {
            suma += i;
        }
        System.out.println("Suma este: " + suma);*/

//------------------------------------------------------------------------------------------------------------------------------------------------------
        /*
        * 4)  Printati numerele de la -10 la -1
        * */

        /*for (int i = -10; i <= -1; i++) {
        //   System.out.println("i = " + i);
        }*/

        /*
//------------------------------------------------------------------------------------------------------------------------------------------------------

        * 6) Cititi un numar natural n de la tastatura. Printati la ecran daca numarul este prim (numarul este
             divizibil doar cu 1 si cu el insusi) sau nu:
        * */
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " numarul este prim");
        } else {
            System.out.println(n + " numarul nu est eprim");
        }*/

        /*

//------------------------------------------------------------------------------------------------------------------------------------------------------
         * 7) Cititi 2 numere naturale n si m de la tastatura. Printati la ecran suma numerelor cuprinse intre
              acestea, excluzandu-le pe ele.
         **/
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu primmul numar N: ");
        int n = scanner.nextInt();
        System.out.println("Introdu al doilea numar M: ");
        int m = scanner.nextInt();
        System.out.println("Ati introdus numerele :" + n + " si " + m);
        if (n > m) {}
            else {
                int suma = 0;
                for (int i = n + 1; i < m; i++) {
                    suma += i;
                }
                System.out.println("Suma numerelor este: " + suma);
        }*/
//------------------------------------------------------------------------------------------------------------------------------------------------------
        /*
         * 8) Cititi un numar natural, pozitiv de la tastatura. Printati tabla inmultiri pentru acel numar.
         * */
    /*    Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar natural pozitiv: ");
        int numar = scanner.nextInt();
        if (numar <= 0) {
        } else {
            for (int i = 1; i<= 10; i++) {
                System.out.println(numar + " x " + i + " = " + (numar * i));
            }
        }*/
//------------------------------------------------------------------------------------------------------------------------------------------------------

        /*
         * 9) Cititi un numar natural n de la tastatura. Printati primii n termeni ai sirului lui Fibonacci la ecran.
              Sirul lui Fibonacci este o serie de numere unde urmatorul numar este gasit prin adunarea
              precendentelor doua numere. Primii termeni vor fi 0 si 1.
         * */
     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar natural pozitiv: ");
        int n = scanner.nextInt();
        if (n <= 0) {
        } else {
            int termen1 = 0, termen2 = 1;
            System.out.println(termen1 + " " + termen2 + " ");
            for (int i = 3; i <= n; i++) {
                int termenUrmator = termen1 + termen2;
                System.out.println(termenUrmator + " ");
                termen1 = termen2;
                termen2 = termenUrmator;
            }
        }*/
//------------------------------------------------------------------------------------------------------------------------------------------------------
        /*
        * 10) Cititi un numar natural n mai mare de 100, de la tastatura. Printati inversul numarului.
        */
     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar natural mai mare de 100: ");
        String numar = scanner.nextLine();
        if (numar.length() <= 2 || Integer.parseInt(numar) <= 100) {
        } else {
            System.out.print("Numarul invers este: ");
            for (int i = numar.length() -1; i>= 0; i--) {
                System.out.print(numar.charAt(i));
            }
        }*/
//------------------------------------------------------------------------------------------------------------------------------------------------------
        /*
        * 11) Cititi un numar natural n de la tastatura care sa fie mai mare sau egal cu 3. Printati o matrice n x
              n, dupa cum urmeaza.
        */
   /*     Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 3) {
        } else {
            System.out.println("Matricea " + n + " x " + n + " este:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }*/
//------------------------------------------------------------------------------------------------------------------------------------------------------
        /*
         * 12) Cititi un numar natural n de la tastatura care sa fie mai mare sau egal cu 3. Printati o matrice n x
               n, cu coordatele fiecarei celule, dupa cum urmeaza:
         */
        // a) Matricea completa
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar natural mai mare sau egal cu 3: ");
        int n = scanner.nextInt();
        if (n < 3) {
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("(" + i + "," + j + ")");
                }
                System.out.println();
            }
        }*/


        // b) Doar diagonala principala
   /*     Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar natural mai mare sau egal cu 3: ");
        int n = scanner.nextInt();
        if (n < 3) {
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println("(" + i + "," + i + ")");
            }
        }*/
        // c) Doar celulele de deasupra diagonalei principale
   /*     Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar naturam mai mare sau egal cu 3: ");
        int n = scanner.nextInt();
        if (n < 3) {
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }*/

        // d) Doar celulele de sub diagonala principala
    /*    Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar naturam mai mare sau egal cu 3: ");
        int n = scanner.nextInt();
        if (n < 3) {
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j > i) {
                        System.out.println("(" + i + "," + j + ")");
                    }
                }
            }
        }*/

        // e) Doar perimetrul
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar natural mai mare sau egal cu 3: ");
        int n = scanner.nextInt();
        if (n < 3) {
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || i == n - 1 || j == 0 || j == n - 2) {
                        System.out.print("(" + i + "," + j + ")");
                    } else {
                        System.out.print("          ");
                    }
                }
                System.out.println();
            }
        }*/

        // f) Doar diagonala secundara
 /*       Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar natural mai mare sau egal cu 3: ");
        int n = scanner.nextInt();
        if (n < 3) {
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i + j == n - 1) {
                        System.out.print("(" + i + "," + j + ")");
                    } else {
                        System.out.print("       ");
                    }
                }
                System.out.println();
            }
        }*/


//------------------------------------------------------------------------------------------------------------------------------------------------------
        /*
         * 13) Cititi un numar natural n de la tastatura. Printati urmatorul model pana la numarul introdus
         */
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar natural: ");
        int n = scanner.nextInt();
        if (n<1) {
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }*/
//------------------------------------------------------------------------------------------------------------------------------------------------------
        /*
         * 14) Cititi 2 numere naturale n si m de la tastatura. Printati toate numerele prime cuprinse intre
               acestea
         */

//------------------------------------------------------------------------------------------------------------------------------------------------------
        /*
         * 15) Cititi un numar natural n de la tastatura.
         * a. Verificati daca numarul este egal cu inversul lui (daca este palindrom).
          

         * b. Printati prima si ultima cifra a numarului.
         * c. Verificati de cate ori apare fiecare cifra in numar:
         */

  /*      int n = 5;
        int[] numbers = NEW INT[n];

        for (int i = 0; i<N; i++) {
            numbers[i] = 5;

        for (int value : mySecondArray);*/

       /* int[][] matrix = new int[2][2];
        // 0 0
        // 0 0
        System.out.println((matrix[1][1]));

        int[][] mySecondaryMatrix = {{1, 2}, {3, 4}};
        // 1 2
        // 3 4
        System.out.println(mySecondaryMatrix[1][0]);*/
    }
}
