package Adapter;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Adapter extends JFrame {
    private String details;
    private JLabel statusbar;

    public Adapter(){
        super("the title");

        statusbar = new JLabel("this is the default");
        add(statusbar, BorderLayout.SOUTH);
        addMouseListener(new MouseClass());

    }

    private class MouseClass extends MouseAdapter{ //mouse adapter zit al in java
        public void mouseClicked(MouseEvent event){
            details = String.format("You clicked %d", event.getClickCount());

            if(event.isMetaDown()) // maakt het niet uit welke muis je hebt
                details += " With the right mouse button";
            else if(event.isAltDown())
                details += " with center mouse button";
            else
                details += " with the left mouse button";

            statusbar.setText(details);

        }

    }

}
