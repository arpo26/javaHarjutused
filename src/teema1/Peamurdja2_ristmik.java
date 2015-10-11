package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor1 = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor2 = new Foor(Foor.ALUMINE, primaryStage);
        Foor foor3 = new Foor(Foor.PAREM, primaryStage);
        Foor foor4 = new Foor(Foor.VASAK, primaryStage);

        tsykkel(foor1, 0);
        tsykkel(foor2, 0);
        tsykkel(foor3, 1);
        tsykkel(foor4, 1);
    }


    public void tsykkel (Foor foor, int suund) {
        int arv =suund;
        while (arv < 10) {
            if (arv==0) {
                foor.vahetaPunast();
                foor.paus(3 + 11 * 0.3 + 3);
                foor.vahetaKollast();
                foor.paus(3);
                foor.vahetaPunast();
                foor.vahetaKollast();
            }
            foor.vahetaRohelist();
            foor.paus(3);
            for (int i = 0; i < 11; i = i + 1) {
                foor.vahetaRohelist();
                foor.paus(0.3);
            }
            foor.vahetaKollast();
            foor.paus(3);
            foor.vahetaKollast();
            foor.vahetaPunast();
            foor.paus(3 + 11 * 0.3 + 3);
            foor.vahetaKollast();
            foor.paus(3);
            foor.vahetaPunast();
            foor.vahetaKollast();
            arv = arv + 1;
        }



/*
        public void tsykkel (Foor foor, int suund) {
            if (suund == 0) {
                int arv = 0;
                while (arv < 10) {
                    foor.vahetaRohelist();
                    foor.paus(3);
                    for (int i = 0; i < 11; i = i + 1) {
                        foor.vahetaRohelist();
                        foor.paus(0.3);
                    }
                    foor.vahetaKollast();
                    foor.paus(3);
                    foor.vahetaKollast();
                    foor.vahetaPunast();
                    foor.paus(3 + 11 * 0.3 + 3);
                    foor.vahetaKollast();
                    foor.paus(3);
                    foor.vahetaPunast();
                    foor.vahetaKollast();
                    arv = arv + 1;
                }
            }
            else {
                int arv2 = 0;
                while (arv2 < 10) {
                    foor.vahetaPunast();
                    foor.paus(3+11*0.3+3);
                    foor.vahetaKollast();
                    foor.paus(3);
                    foor.vahetaKollast();
                    foor.vahetaPunast();
                    foor.vahetaRohelist();
                    foor.paus(3);
                    for (int i = 0; i < 11; i = i+1) {
                        foor.vahetaRohelist();
                        foor.paus(0.3);

                    };
                    arv2 = arv2 + 1;
                    foor.vahetaKollast();
                    foor.paus(3);
                    foor.vahetaKollast();
            }

        }
        */
/*
        vertikaalne(foor1);
        vertikaalne(foor2);
        horisontaalne(foor3);
        horisontaalne(foor4);

        */
    }

  /*  public void vertikaalne(Foor foor) {
        int arv = 1;
        while (arv < 10) {
            foor.vahetaRohelist();
            foor.paus(3);
            for (int i = 0; i < 11; i = i+1) {
                foor.vahetaRohelist();
                foor.paus(0.3);
            }
            foor.vahetaKollast();
            foor.paus(3);
            foor.vahetaKollast();
            foor.vahetaPunast();
            foor.paus(3+11*0.3+3);
            foor.vahetaKollast();
            foor.paus(3);
            foor.vahetaPunast();
            foor.vahetaKollast();
            arv = arv + 1;
        }
    }

    public void horisontaalne(Foor foor) {

        int arv2 = 1;
        while (arv2 < 10) {
            foor.vahetaPunast();
            foor.paus(3+11*0.3+3);
            foor.vahetaKollast();
            foor.paus(3);
            foor.vahetaKollast();
            foor.vahetaPunast();
            foor.vahetaRohelist();
            foor.paus(3);
            for (int i = 0; i < 11; i = i+1) {
                foor.vahetaRohelist();
                foor.paus(0.3);

            };
            arv2 = arv2 + 1;
            foor.vahetaKollast();
            foor.paus(3);
            foor.vahetaKollast();
        }
    }
    */
}
