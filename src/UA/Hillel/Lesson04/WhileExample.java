package UA.Hillel.Lesson04;

public class WhileExample {
    public static void main(String[] args) {
        int attepmt = 0 ;
        boolean cont = true;

        while (cont){
            System.out.println("Attempt " + attepmt++);
            if (attepmt > 6 ){
                cont = false;
            }
        }
        System.out.println("after While-loop");
    }
}
