import javax.swing.*;

public class BinaryToNumberConverter {

    static int decoder(String code){
        int n = code.length();
        int s = 0;
        int k = 1;
        int q = 1;
        int a;

        while (k<=n){
            if (code.charAt(n-k)=='1'){
                a = 1;
            }
            else {
                a = 0;
            }

            s+=q*a;
            q*=2;
            k++;
        }
        return s;
    }

    public static void main(String[] args) {
        String input;
        String title ="Binary decoding";

        input = JOptionPane.showInputDialog(null,"Insert binary code", title, JOptionPane.QUESTION_MESSAGE);

        if (input == null){
            System.exit(0);
        }

        int num = decoder(input);
        String text = "You enter a binary code: "+input;
        text+="\nCode is equal to number: "+ num;

        JOptionPane.showMessageDialog(null,text, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
