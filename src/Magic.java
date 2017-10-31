public class Magic {
    public static void main(String[] args) {
        /* System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");*/
int x = 0;
       do {
             for(int i=0; i<x; i++) {
                 System.out.print("*");
             }
           System.out.println();
           x++;
       } while (x<=5);
    }
}