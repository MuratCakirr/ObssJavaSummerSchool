public class Main {

    public static void main(String[] args) {
        String[][] cities = new String[3][3];

        cities[0][0] = "istanbul";
        cities[0][1] = "kadikoy";
        cities[0][2] = "besiktas";
        cities[1][0] = "ankara";
        cities[1][1] = "etimesgut";
        cities[1][2] = "sincan";
        cities[2][0] = "izmir";
        cities[2][1] = "buca";
        cities[2][2] = "cesme";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(cities[i][j]);
            }
            System.out.println();
        }
    }
}
