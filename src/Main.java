public class Main {
    public static void main(String[] args) {

            for (int count=1;  count<=5; count++) {
                Session session = new Session();
                session.generateSession();
            }
    }
}