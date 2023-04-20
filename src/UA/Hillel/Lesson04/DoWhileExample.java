package UA.Hillel.Lesson04;

public class DoWhileExample {
    public static void main(String[] args) {
        boolean cond = true;
        int attempt = 0;

        do {
            if (attempt > 6) {
                cond = false;
            }
            System.out.println("Attempt" + attempt++);
        } while (cond);

    }
}
