import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;

    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    public int[] getInput() {
        int row = scanner.nextInt() - 1;
        int col = scanner.nextInt() - 1;
        return new int[]{row, col};
    }

    public void closeScanner() {
        scanner.close();
    }
}
