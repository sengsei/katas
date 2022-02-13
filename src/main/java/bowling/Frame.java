package bowling;

public class Frame {
    private int[] pinsRolled;
    private int score;

    public Frame(int num){
        pinsRolled = new int[num];
        score = 0;
    }

    public int[] getPinsRolled() {
        return pinsRolled;
    }

    public void setPinsRolled(int[] pinsRolled) {
        this.pinsRolled = pinsRolled;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addPin(int pin, int rolls){
        pinsRolled[rolls] = pin;
        score += pin;
    }
}
