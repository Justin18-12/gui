import java.awt.FlowLayout; // geeft de default layout
import javax.swing.JFrame; // geeft al de windows features
import javax.swing.JLabel; // dit geeft tekst en afbeeldingen

public class WindowsGuiTwee extends JFrame{ // voor de basis windows features

    private JLabel item1;
    private JLabel item2;

    public WindowsGuiTwee(){
        super("The Title Bar"); //super is imported
        setLayout(new FlowLayout()); //default layout

        item1 = new JLabel("This is a Scentence");
        item2= new JLabel("\n \n This is also a Scentence");
        item1.setToolTipText("This is gonna show up a hover"); // deze tekst komt in beeld als je over de vorige zin gaat met je muis
        item2.setToolTipText("Khalid is een baas");
        add(item1);
        add(item2);

    }
}
