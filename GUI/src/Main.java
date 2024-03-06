import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {
    private String name;
    private String weapon;
    private JTextField nameDragon;
    private JPanel main;
    private JButton submitButton;
    private JLabel lblLog;
    private JTextField nameWizard;
    private JTextField hitpointsWizard;
    private JTextField hitpointsDragon;
    private JComboBox cbDragon;
    private JComboBox cbWizard;
    private JLabel lblAvatarDragon;
    private JLabel lblAvatarWizard;
    private JTextField specialDragon;
    private JTextField specialWizard;
    private JLabel winner;
    private JLabel gameover;

    public Main() {

        // Create Dragons and Wizards
        Wizard g = new Wizard("Gandalf, the Grey", 100, "gandalf-thegrey.jpg", new SpecialMove("Lightning", 0.3, 10));
        Wizard w = new Wizard("Gandalf, the White", 1000, "gandalf-thewhite.jpg", new SpecialMove("Flash", 0.5, 20));
        Wizard s = new Wizard("Saruman", 10, "saruman.jpg", new SpecialMove("The Voice of Saruman", 0.1, 100));

        Dragon n = new Dragon("Ancalagon", 10, "ancalagon.jpg", new SpecialMove("Liquid Fire", 0.1, 10));
        Dragon d = new Dragon("Smaug", 100, "smaug.jpeg", new SpecialMove("Fire Tongue", 0.3, 20));
        Dragon e = new Dragon("Glaurung", 1000, "glaurung.jpg", new SpecialMove("Breath of Fire", 0.8, 100));


        // Empty Form
        this.nameWizard.setText("");
        this.hitpointsWizard.setText("");

        this.nameDragon.setText("");
        this.hitpointsDragon.setText("");

        // Add Dragons and Wizards to the Select Fields
        cbDragon.addItem("Please choose");
        cbDragon.addItem(n);
        cbDragon.addItem(d);
        cbDragon.addItem(e);

        cbWizard.addItem("Please choose");
        cbWizard.addItem(s);
        cbWizard.addItem(g);
        cbWizard.addItem(w);


        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dragon dragon = (Dragon) cbDragon.getSelectedItem();
                Wizard wizard = (Wizard) cbWizard.getSelectedItem();

                // Aufgabe 5.x
                // With specialMove this can only be called once
                int dragonHits = dragon.getHitpoints();
                int wizardHits = wizard.getHitpoints();

                if (dragonHits == wizardHits){
                    lblLog.setText("unentschieden");
                } else if (dragonHits > wizardHits){
                    lblLog.setText(dragon.getName() + " gewinnt gegen " + wizard.getName() + ", mit " + dragonHits + ":" + wizardHits);
                    cbDragon.removeItem(wizard);
                    cbWizard.removeItem(wizard);
                } else {
                    lblLog.setText(wizard.getName() + " gewinnt gegen " + dragon.getName() + ", mit " + wizardHits + ":" + dragonHits);
                    cbDragon.removeItem(dragon);
                    cbWizard.removeItem(dragon);
                }

                if (cbDragon.getItemCount() == 1 || cbWizard.getItemCount() == 1){
                    System.out.println("Game Over");
                    for (Component com : main.getComponents()){
                        com.setVisible(false);
                    }
                    if (cbDragon.getItemCount() == 1){
                        winner.setText("The Dragons win!");
                    } else if (cbWizard.getItemCount() == 1){
                        winner.setText("The Wizards win!");
                    }
                    winner.setVisible(true);
                    winner.setLocation(0,100);
                    winner.setSize(300, 300);

                    gameover.setVisible(true);
                    gameover.setLocation(0, 200);
                    gameover.setSize(400, 400);

                }
            }
        });

        // if dragon or wizard is selected, update the stat fields
        cbDragon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateDragon(cbDragon.getSelectedItem());
            }
        });
        cbWizard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateWizard(cbWizard.getSelectedItem());
            }
        });
    }

    public void updateDragon(Object dragon){
        try {
            Dragon d;
            nameDragon.setText(dragon.toString());
            d = (Dragon) dragon;
            hitpointsDragon.setText(String.valueOf(d.getHitpoints()));
            specialDragon.setText(d.getSpecialMove().getName());

            System.out.println(d);

            //lblAvatar.setSize(100, 100);
            BufferedImage image = null;
            try {
                System.out.println(d.getIcon());
                image = ImageIO.read(getClass().getResource(d.getIcon()));

            } catch (IOException exception) {
                exception.printStackTrace();
            }
            ImageIcon icon = new ImageIcon(image);
            lblAvatarDragon.setIcon(icon);

        } catch (Exception exception){
            System.out.println(exception.getMessage());
            nameDragon.setText("");
            hitpointsDragon.setText("");
            lblAvatarDragon.setIcon(null);

        }
    }

    public void updateWizard(Object wizard){
        if (wizard instanceof Dragon) {
            System.out.println("ja");
        }

        try {
            Wizard w;
            nameWizard.setText(wizard.toString());
            w = (Wizard) wizard;
            hitpointsWizard.setText(String.valueOf(w.getHitpoints()));
            specialWizard.setText(w.getSpecialMove().getName());

            System.out.println(w);


            //lblAvatar.setSize(100, 100);
            BufferedImage image = null;
            try {
                System.out.println(w.getIcon());
                image = ImageIO.read(getClass().getResource(w.getIcon()));

            } catch (IOException exception) {
                exception.printStackTrace();
            }
            ImageIcon icon = new ImageIcon(image);
            lblAvatarWizard.setIcon(icon);

        } catch (Exception exception){
            System.out.println(exception.getMessage());
            nameWizard.setText("");
            hitpointsWizard.setText("");
            lblAvatarWizard.setIcon(null);

        }
    }

    public static void main(String[] args)  {
        JFrame frame = new JFrame("Main");
        JPanel w = new Main().main;
        frame.setContentPane(w);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
