import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Arena {
    private JTextField dragonName;
    private JTextField wizardName;
    private JTextField dragonHitpoints;
    private JTextField wizardHitpoints;
    private JButton fightButton;
    private JLabel resultLog;
    private JPanel arena;

    public Arena() {


        // Aufgabe 5.c
        Wizard Gandalf = new Wizard("Gandalf", 100);
        Dragon Smaug = new Dragon("Smaug", 150);

        dragonName.setText(Smaug.getName());
        dragonHitpoints.setText(String.valueOf(Smaug.getHitpoints()));
        wizardName.setText(Gandalf.getName());
        wizardHitpoints.setText(String.valueOf(Gandalf.getHitpoints()));



        boolean b = false;
        for (int n=1;n<=10;n++) {
            b = Math.random() < 0.2;
            System.out.println(b);
        }

        // Aufgabe 5.b
        fightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((Integer.parseInt(dragonHitpoints.getText()) == Integer.parseInt(wizardHitpoints.getText()))){
                    resultLog.setText("Unentschieden");
                } else if (Integer.parseInt(dragonHitpoints.getText()) > Integer.parseInt(wizardHitpoints.getText())){
                    resultLog.setText(dragonName.getText() + " gewinnt gegen " + wizardName.getText() + " (" + dragonHitpoints.getText() + ":" + wizardHitpoints.getText() + ")");
                } else {
                    resultLog.setText(wizardName.getText() + " gewinnt gegen " + dragonName.getText() + " (" + wizardHitpoints.getText() + ":" + dragonHitpoints.getText() + ")");
                }
            }
        });
    }

    public static void main(String[] args)  {
        JFrame frame = new JFrame("Arena");
        JPanel w = new Arena().arena;
        frame.setContentPane(w);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
