package test;

public class Parcel1 {

    class Contents {
        private int i = 11;
        public int value() { return i;}
    }

    class Destinantion{
        private String label;
        Destinantion(String whereTo) {
            label = whereTo;
        }

        String readLabel() { return label; }
    }

    public void ship(String dest) {
        Contents c = new Contents();
        Destinantion d = new Destinantion(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String... args) {
        Parcel1 p = new Parcel1();
        p.ship("sdfsd");
    }
}
