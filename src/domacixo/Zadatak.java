package domacixo;

import java.util.Scanner;

public class Zadatak {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = 1;
        int o = 2;
        int[][] matrica = new int[3][3];
        boolean pobednik = false;
        boolean kraj = false;

        do {
            //Igrac  X
            //Unos reda i kolone u kojoj zelimo da odigramo potez
            System.out.println("Igrac X");
            System.out.println("Unesite red:");
            int red = sc.nextInt();
            while (red > 2 || red < 0) {
                System.out.println("Uneli ste pogresan red unesite ponovo");
                red = sc.nextInt();
            }
            System.out.println("Unesite kolonu:");
            int kolona = sc.nextInt();   
            while (kolona > 2 || kolona < 0) {
                System.out.println("Uneli ste pogresnu kolonu unesite ponovo");
                kolona = sc.nextInt();
            }
            //Provera da li je polje popunjeno
            while (matrica[red][kolona] != 0) {
                System.out.println("Polje je pounjeno unesite ponovo: ");
                System.out.println("Novi red: ");
                red = sc.nextInt();
                System.out.println("Nova kolona: ");
                kolona = sc.nextInt();
            }
            matrica[red][kolona] = x;

            //Ispis matrice nakon unosa
            for (int i = 0; i < matrica.length; i++) {
                for (int j = 0; j < matrica[i].length; j++) {
                    System.out.print(matrica[i][j] + " ");
                }
                System.out.println("");
            }
            //Provera da li je pobednik X
            if ((matrica[0][0] == 1 && matrica[1][0] == 1 && matrica[2][0] == 1) || (matrica[0][1] == 1 && matrica[1][1] == 1 && matrica[2][1] == 1)
                    || (matrica[0][2] == 1 && matrica[1][2] == 1 && matrica[2][2] == 1) || (matrica[0][0] == 1 && matrica[0][1] == 1 && matrica[0][2] == 1)
                    || (matrica[1][0] == 1 && matrica[1][1] == 1 && matrica[1][2] == 1) || (matrica[2][0] == 1 && matrica[2][1] == 1 && matrica[2][2] == 1) || (matrica[0][0] == 1
                    && matrica[1][1] == 1 && matrica[2][2] == 1) || (matrica[0][2] == 1 && matrica[1][1] == 1 && matrica[2][0] == 1)) {
                System.out.println("Pobednik je igrac X");
                pobednik = true;

                System.out.println("Igra je zavrsena! Da li zelite novu igru? DA-1 | NE-2");
                int opcija = sc.nextInt();
                while (opcija < 1 || opcija > 2) {
                    System.out.println("Uneli ste pogresan broj, unesite ponovo:");
                    opcija = sc.nextInt();
                }
                if (opcija == 1) {
                    System.out.println("Matrica restartovana!");
                    matrica = new int[3][3];
                    continue;
                } else {
                    System.out.println("Igra je zavrsena!");
                    kraj = true;
                    pobednik = true;
                    break;
                }
            }   //Provera da li je matrica popunjena tj da li je nereseno
            if (matrica[0][0] != 0 && matrica[0][1] != 0 && matrica[0][2] != 0 && matrica[1][0] != 0 && matrica[1][1] != 0 && matrica[1][2] != 0 && matrica[2][0] != 0
                    && matrica[2][1] != 0 && matrica[2][2] != 0) {
                System.out.println("Nereseno");
                System.out.println("Igra je zavrsena! Da li zelite novu igru? DA-1 | NE-2");
                int opcija = sc.nextInt();
                while (opcija < 1 || opcija > 2) {
                    System.out.println("Uneli ste pogresan broj, unesite ponovo:");
                    opcija = sc.nextInt();
                }
                if (opcija == 1) {
                    System.out.println("Matrica restartovana!");
                    matrica = new int[3][3];
                    continue;
                } else {
                    System.out.println("Igra je zavrsena!");
                    kraj = true;
                    pobednik = true;
                    break;
                }
            }

            //Igrac  O
            //Unos reda i kolone u kojoj zelimo da odigramo potez
            System.out.println("Igrac O");
            System.out.println("Unesite red:");
            red = sc.nextInt();
            while (red > 2 || red < 0) {
                System.out.println("Uneli ste pogresan red unesite ponovo:");
                red = sc.nextInt();
            }
            System.out.println("Unesite kolonu:");
            kolona = sc.nextInt();
            while (kolona > 2 || kolona < 0) {
                System.out.println("Uneli ste pogresnu kolonu unesite ponovo:");
                kolona = sc.nextInt();
            }
            //Provera da li je polje popunjeno
            while (matrica[red][kolona] != 0) {
                System.out.println("Polje je pounjeno unesite ponovo: ");
                System.out.println("Novi red: ");
                red = sc.nextInt();
                System.out.println("Nova kolona: ");
                kolona = sc.nextInt();
            }
            matrica[red][kolona] = o;
            //Ispis matrice nakon unosa
            for (int i = 0; i < matrica.length; i++) {
                for (int j = 0; j < matrica[i].length; j++) {

                    System.out.print(matrica[i][j] + " ");
                }
                System.out.println("");
            }
            //Provera da li je pobednik O
            if ((matrica[0][0] == 2 && matrica[1][0] == 2 && matrica[2][0] == 2) || (matrica[0][1] == 2 && matrica[1][1] == 2 && matrica[2][1] == 2)
                    || (matrica[0][2] == 2 && matrica[1][2] == 2 && matrica[2][2] == 2) || (matrica[0][0] == 2 && matrica[0][1] == 2 && matrica[0][2] == 2)
                    || (matrica[1][0] == 2 && matrica[1][1] == 2 && matrica[1][2] == 2) || (matrica[2][0] == 2 && matrica[2][1] == 2 && matrica[2][2] == 2) || (matrica[0][0] == 2
                    && matrica[1][1] == 2 && matrica[2][2] == 2) || (matrica[0][2] == 2 && matrica[1][1] == 2 && matrica[2][0] == 2)) {

                System.out.println("Pobednik je igrac O");
                pobednik = true;
                System.out.println("Igra je zavrsena da li zelite novu igru? DA-1 | NE-2");
                int opcija = sc.nextInt();

                while (opcija < 1 && opcija > 2) {
                    System.out.println("Uneli ste pogresan broj, unesite ponovo:");
                    opcija = sc.nextInt();
                }
                if (opcija == 1) {
                    System.out.println("Matrica restartovana!");
                    matrica = new int[3][3];
                    continue;
                } else {
                    System.out.println("Igra je zavrsena!");
                    kraj = true;
                    pobednik = true;
                    break;
                }
            }
            //Provera da li je matrica popunjena tj da li je nereseno
            if (matrica[0][0] != 0 && matrica[0][1] != 0 && matrica[0][2] != 0 && matrica[1][0] != 0 && matrica[1][1] != 0 && matrica[1][2] != 0 && matrica[2][0] != 0
                    && matrica[2][1] != 0 && matrica[2][2] != 0) {
                System.out.println("Nereseno");
                System.out.println("Igra je zavrsena! Da li zelite novu igru? DA-1 | NE-2");
                int opcija = sc.nextInt();
                while (opcija < 1 || opcija > 2) {
                    System.out.println("Uneli ste pogresan broj, unesite ponovo:");
                    opcija = sc.nextInt();
                }
                if (opcija == 1) {
                    System.out.println("Matrica restartovana!");
                    matrica = new int[3][3];
                    continue;
                } else {
                    System.out.println("Igra je zavrsena!");
                    kraj = true;
                    pobednik = true;
                    break;
                }
            }

        } while (pobednik == false || kraj == false);

    }
}
