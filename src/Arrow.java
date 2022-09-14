public class Arrow {

    //properties
    private int score;
    private boolean hit;

    //constructors
    public Arrow () {
        this.score = (int)(Math.random()*11);
        this.hit = this.score > 0;
    }
    //methods

    //setters & getters
    public int getScore() {
        return score;

    }
    public boolean getHit () {
        return hit;
    }
}
