package ClassReverences;

// собрать программу, чтобы получилось
// Острова = Фиджи
// Острова = Косумель
// Острова = Бермуды
// Острова = Азовские острова

public class TestArrays {
    public static void main(String[] args) {

        int y = 0;

        String[] islands = new String[4];
        islands[0] = "Бермуды";
        islands[1] = "Фиджи";
        islands[2] = "Азовские острова";
        islands[3] = "Косумель";

        int ref;

        while(y<4) {
            int[] index = new int[4];
            index[0] = 1;
            index[1] = 3;
            index[2] = 0;
            index[3] = 2;

            ref = index[y];
            System.out.print("Острова = ");
            System.out.println(islands[ref]);
            y = y + 1;
        }
    }
}
