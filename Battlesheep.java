import java.util.Scanner;

public class BattleSheep {

    public static void main(String[] args) {
        char[] sheeps = ">>> <<<".toCharArray();

        while (true) {
            displaySheeps(sheeps);
            int index = readIndex();

            int endIndex = -1;

            char mouton = sheeps[index];
            if (mouton == '>') {
                if (index + 1 < sheeps.length && sheeps[index + 1] == ' ') {
                    endIndex = index + 1;
                }
                else if (index + 2 < sheeps.length && sheeps[index + 2] == ' ') {
                    endIndex = index + 2;
                }
            }
            else if (mouton == '<') {
                if (index - 1 >= 0 && sheeps[index - 1] == ' ') {
                    endIndex = index - 1;
                }
                else if (index - 2 >= 0 && sheeps[index - 2] == ' ') {
                    endIndex = index - 2;
                }
            }

            if (endIndex != -1) {
                sheeps[endIndex] = sheeps[index];
                sheeps[index] = ' ';
            }
        }
    }

    public static void displaySheeps(char[] sheeps) {
        for (int i = 0; i < sheeps.length; i++) {
            System.out.print(" " + i);
        }

        System.out.println();

        for (char sheep : sheeps) {
            System.out.print("|" + sheep);
        }

        System.out.println("|");
    }

    public static int readIndex() {
        System.out.println("Quel pion voulez-vous déplacer ?");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}