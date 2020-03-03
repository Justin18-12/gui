package Lijst;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Lijst extends JFrame {

    private JList list;
    private static String[] colornames = {"Black", "Blue", "Red", "White", "Green", "Yellow"};
    private static Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE, Color.GREEN, Color.YELLOW};

    public Lijst(){
        super("Justin's Color Panel");
        setLayout(new FlowLayout());

        list = new JList(colornames);
        list.setVisibleRowCount(6);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(list));

        list.addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent event) {
                        getContentPane().setBackground(colors[list.getSelectedIndex()]);
                    }
                }
        );

    }


}
