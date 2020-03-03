package Adapter;

import javax.swing.JFrame;

public class AdapterTwee {
    public static void main(String[] args) {

        Adapter a = new Adapter();
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setSize(300,200);
        a.setVisible(true);
    }
}
