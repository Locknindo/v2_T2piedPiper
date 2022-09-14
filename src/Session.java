public class Session {

    //properties
    private int totalScore = 0;
    private int totalHits = 0;


    //constructors


    //methods
        public void generateSession (){
            for (int count=1;  count<=5; count++) {
                Round round = new Round();
                totalScore +=  round.generateRound(count);
                totalHits += round.getTotalHits();
    }
            System.out.println("The score for the entire session was: " + totalScore);
            System.out.println("The amount of hits were: " + totalHits);
}

    //setters & getters
}
