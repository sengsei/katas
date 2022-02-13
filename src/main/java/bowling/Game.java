package bowling;

public class Game {

    private int currentFrame = 0;
    private int rolls;

    public Frame[] frames = new Frame[10];
    public void addRoll(int pins){
        if(!isOver()){

            //checks
            if (frames[currentFrame] == null){
                frames[currentFrame] = new Frame(2);
                rolls = 0;
            }

            //spare?

            //strike?

            //normal
            if (pins < 10){
                frames[currentFrame].addPin(pins, rolls);
                rolls++;
            }

        } else {
            System.out.println("Exception...");
        }
    }

    public int totalScore(){
        int total = 0;
        for (Frame frame : frames){
            if (frame != null) {
                total += frame.getScore();
            }
        }
        return total;
    }

    public boolean isOver(){
        return false;
    }
}
