package aula7a;

public class App {
    public static void main(String[] args) throws Exception {

        Lutador l0 = new Lutador(
                "Pretty Boy",
                "França",
                39,
                1.75,
                68.9,
                11,
                2,
                1

        );
        Lutador l1 = new Lutador(
                "Putscript",
                "Brasil",
                29,
                1.68,
                57.8,
                14,
                2,
                3

        );
        Lutador l2 = new Lutador(
                "Dead Code",
                "Australia",
                28,
                1.93,
                81.6,
                13,
                0,
                2

        );
        Lutador l3 = new Lutador(
                "Ufocobol",
                "Brasil",
                37,
                1.70,
                119.3,
                5,
                4,
                3

        );
        Lutador l4 = new Lutador(
                "Nerdard",
                "Estados Unidos",
                30,
                1.81,
                105.7,
                12,
                2,
                4
        );

    l0.apresentar();
    l1.apresentar();
    l2.apresentar();
    l3.apresentar();

    l4.ganharLuta();
    l4.ganharLuta();
    l4.ganharLuta();
    
    l4.apresentar();



    }
}
