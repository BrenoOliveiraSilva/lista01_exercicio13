import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Object[] options = {"Homem", "Mulher"};
        double height = 0;
        boolean validInput = false;
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        int gender = JOptionPane.showOptionDialog(null, "Por favor escolha seu genêro", "Escolha de genêro",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        while (!validInput) {
            String input = JOptionPane.showInputDialog(null, "Informe sua altura (m)");
            try {
                height = Double.parseDouble(input);
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida!");
            }
        }

        if (gender == JOptionPane.YES_OPTION) {
            double idealWeight = (72.7 * height) - 58;
            JOptionPane.showMessageDialog(null, "Seu peso ideal é " + numberFormat.format(idealWeight) + " kg");
        } else {
            double idealWeight = (62.1 * height) - 44.7;
            JOptionPane.showMessageDialog(null, "Seu peso ideal é " + numberFormat.format(idealWeight) + " kg");
        }
    }
}