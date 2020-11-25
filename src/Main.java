public class Main {
    public static void main(String[] args) {

        int clientbalans = 100;
        int refill = 1300;
        int limit = 1000;
        int bonus;


        if (refill > limit) {
            bonus = refill / 100 ;
        } else {
            bonus = 0;
        }

       int totalbalans = clientbalans + refill + bonus;


        System.out.println(bonus);
        System.out.println(totalbalans);
    }
}
