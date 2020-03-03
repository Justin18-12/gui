import javax.swing.JFrame;

public class WindowsGui {
    public static void main(String[] args) {

        WindowsGuiTwee voorbeeld = new WindowsGuiTwee();
        voorbeeld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // als je op kruisje drukt, sluit het
        voorbeeld.setSize(275,180); // de groote van de pop up
        voorbeeld.setVisible(true); // zorgt dat het zichtbaat is
    }
}
