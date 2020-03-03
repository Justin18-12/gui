package JFrame;

import javax.swing.JFrame;

public class Knop {
    public static void main(String[] args) {

        KnopTwee kt = new KnopTwee();
        kt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        kt.setSize(300,200);
        kt.setVisible(true);
    }
}
