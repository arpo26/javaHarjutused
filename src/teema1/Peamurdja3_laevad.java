package teema1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */
public class Peamurdja3_laevad {
    public static void main(String[] args) {
        int [][] laud = new int [9][9];

        for (int i = 0; i<9, i++) {
            for (int j = 0, j<9, j++){
                laud[i][j]=r();
            }
        }



        int[][] laud = {{randLaev(), randLaev(), randLaev(), randLaev(), randLaev(), randLaev(), randLaev(), randLaev(), randLaev(), randLaev()},
                {
                        0, 1, 1, 0, 0, 1, 0, 0, 1, 0},
                {
                        0, 1, 1, 0, 0, 1, 0, 0, 1, 0
                },
                {
                        0, 1, 1, 0, 0, 1, 0, 0, 1, 0
                },
                {
                        0, 1, 1, 0, 0, 1, 0, 0, 1, 0
                },
                {
                        0, 1, 1, 0, 0, 1, 0, 0, 1, 0
                },
                {
                        0, 1, 1, 0, 0, 1, 0, 0, 1, 0
                },
                {
                        0, 1, 1, 0, 0, 1, 0, 0, 1, 0
                },
                {
                        0, 1, 1, 0, 0, 1, 0, 0, 1, 0
                },
                {
                        0, 1, 1, 0, 0, 1, 0, 0, 1, 0
                },
        };
        Scanner kasutaja = new Scanner(System.in);


        while (gameover(laud) == true) {
            System.out.println(Arrays.toString(laud));

            System.out.println("Sisesta üks number, ühest kümneni");
            int sisestus1 = kasutaja.nextInt();
            System.out.println("Sisesta veel üks number, ühest kümneni");
            int sisestus2 = kasutaja.nextInt();

            if ((laud[sisestus1 - 1][sisestus2 - 1]) == 1) {
                laud[sisestus1 - 1][sisestus2 - 1] = 2;
                System.out.println("Said laevale pihta!");
            } else if ((laud[sisestus1 - 1][sisestus2 - 1]) == 0) {
                laud[sisestus1 - 1][sisestus2 - 1] = 3;
                System.out.println("Ei saanud laevale pihta!");
            } else if ((laud[sisestus1 - 1][sisestus2 - 1]) == 2 || (laud[sisestus1 - 1][sisestus2 - 1]) == 3) {
                System.out.println("Oled juba proovinud");
            }
        }
    }


    public static boolean gameover(int[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            for (int j = 0; j < laud.length, j++) {
                if (laud[i][j] == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    public static int randLaev() {
        return(int) (Math.random()*2);
    }
}
