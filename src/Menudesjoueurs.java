import javax.swing.*;

public class Menudesjoueurs extends JFrame
{
    private JLabel Labelthomas, Labelnicolas;
    private JTextField fieldthomas, fieldnicolas;
    private JButton boutonDemarrer;

    public Menudesjoueurs()
    {
        setTitle("『 PUISSANCE 4 』");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        Labelthomas = new JLabel("Joueur n°1:");
        fieldthomas = new JTextField(20);

        Labelnicolas = new JLabel("Joueur n°2:");
        fieldnicolas = new JTextField(20);

        boutonDemarrer = new JButton("GO !");
        boutonDemarrer.addActionListener(e -> demarrerPartie());

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(Labelthomas);
        panel.add(fieldthomas);

        panel.add(Box.createVerticalStrut(20));

        panel.add(Labelnicolas);
        panel.add(fieldnicolas);

        panel.add(Box.createVerticalStrut(20));

        panel.add(boutonDemarrer);

        add(panel);
        setVisible(true);
    }

    private void demarrerPartie()
    {
        String nomJoueur1 = fieldthomas.getText();
        String nomJoueur2 = fieldnicolas.getText();
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(Menudesjoueurs::new);
    }
}
