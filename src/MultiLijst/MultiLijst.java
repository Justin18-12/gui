package MultiLijst;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MultiLijst extends JFrame{

    private JList leftList;
    private JList rightList;
    private JButton moveButton;
    private static String[] food = {"spareribs", "chicken", "ribeye", "bacon", "tbone"};

    public MultiLijst(){
        super("menu kaart");
        setLayout(new FlowLayout());

        leftList = new JList(food);
        leftList.setVisibleRowCount(3); // het aantal items zichtbaar
        leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // meerdere items selecteren
        add(new JScrollPane(leftList)); //hiermee kan je scrollen

        moveButton = new JButton("Move there -->");
        moveButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        rightList.setListData(leftList.getSelectedValues()); // hiermee kunnen we wat links staat naar rechts verplaatsen
                    }
                }
        );
        add(moveButton); // ddit word de knop

        rightList = new JList();
        rightList.setVisibleRowCount(3); // dit is de grootte van het rijtje rechts
        rightList.setFixedCellWidth(100);
        rightList.setFixedCellHeight(15);
        rightList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(rightList));

    }

}
