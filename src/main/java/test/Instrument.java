package test;

public class Instrument {

    void play(Note n) {
        System.out.println("instrument.play" + n);
    }

    String what() {
        return "instrument";
    }

    void adjust() {
        System.out.println("adjusting instrument");
    }



}
