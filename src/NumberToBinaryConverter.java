import javax.swing.*;

public class NumberToBinaryConverter {

    static String coder(int number){
        String s = "";
        int n = number;

        do {
            s = (n%2)+s;
            n/=2;
        } while (n!=0);
        return s;
    }

    public static void main(String[] args) {

        String input;
        String title = "Binary code calculation";

        input = JOptionPane.showInputDialog(null, "Enter an integer", title, JOptionPane.QUESTION_MESSAGE);

        if (input==null){
            System.exit(0);
        }

        int num = Integer.parseInt(input);

        String code = coder(num);

        String text = "You enter a number: "+num;
        text+="\nBinary code of number: "+code;
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
