package Muis;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Muis extends JFrame {

    private JPanel mousePanel;
    private JLabel statusBar;

    public Muis(){
        super("Mouse Panel"); // de titel

        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE); // kleur achtergrond
        add(mousePanel, BorderLayout.CENTER); // dit zorgt dat het veld in t midden komt

        statusBar = new JLabel("default"); // de tekst default komt bij default
        add(statusBar, BorderLayout.SOUTH); //onderkant van scherm north east etc kan ook

        HandlerClass handler = new HandlerClass();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);

    }

    private class HandlerClass implements MouseListener, MouseMotionListener{
        public void mouseClicked(MouseEvent event){
            statusBar.setText(String.format("Clicked at %d,%d", event.getX(), event.getY())); // nu worden coordinaten weergegeven
        }
        public void mousePressed(MouseEvent event) {
            statusBar.setText("you pressed down the mouse");
        }
        public void mouseReleased(MouseEvent event) {
            statusBar.setText("you released the button");
        }
        public void mouseEntered (MouseEvent event) {
            statusBar.setText("You entered the area");
            mousePanel.setBackground(Color.GREEN);
        }
        public void mouseExited (MouseEvent event) {
            statusBar.setText("you have left the area with the mouse");
            mousePanel.setBackground(Color.RED);
        }
        // these are mouse motion events
        public void mouseDragged (MouseEvent event) {
            statusBar.setText("You are dragging the mouse");
        }
        public void mouseMoved (MouseEvent event) {
            statusBar.setText("the mouse is moving");
        }

    }

}
