import javax.swing.JOptionPane;

public class gui {
    public static void main(String[] args) {

        String fn = JOptionPane.showInputDialog("Enter First Number");
        String sn = JOptionPane.showInputDialog("Enter Second Number");

        int num1 = Integer.parseInt(fn);  // we zetten de string om naar een int
        int num2 = Integer.parseInt(sn);
        int sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "The answer is " +sum, "the title", JOptionPane.PLAIN_MESSAGE );

        // de eerst plek is de locatie van de box
        // de tweede plek is de uitkomst van de input
        // de derde plek is het kopje van de uitkomst
        // de vierde plek is voor de icons zoals een error of waarschuwing
    }
}
