public class Round {

    //properties
        private int totalScore = 0;
        private int totalHits = 0;

    // constructors

    //methods
        public int generateRound (int count) {
            for (int i=1;  i<=3; i++) {
                Arrow arrow = new Arrow();
                totalScore += arrow.getScore();

                if (arrow.getHit()) {
                    totalHits++;
                }
            }
                System.out.println("The score for round " + count + " was: " + totalScore + " points.");
                return totalScore;

        }
    //setters & getters

    public int getTotalHits() {
        return totalHits;
    }
}
