package events;

import javax.swing.JFrame;

public class EventsDrie {
    public static void main(String[] args) {

        Events events = new Events();
        events.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        events.setSize(350,100);
        events.setVisible(true);

    }
}
