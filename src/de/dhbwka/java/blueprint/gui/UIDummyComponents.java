package de.dhbwka.java.blueprint.gui;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class UIDummyComponents
{
    JFrame componentFrame;

    public UIDummyComponents()
    {
        initGUI();

        //        this.componentFrame.pack();
        this.componentFrame.setSize(650, 150);
        this.componentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.componentFrame.setVisible(true);
    }

    private void initGUI()
    {
        this.componentFrame = new JFrame("Component Frame");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("Label");
        panel.add(label);

        JTextField text = new JTextField("Text");
        panel.add(text);

        JPasswordField password = new JPasswordField("Password");
        panel.add(password);

        JButton btn = new JButton("Button");
        btn.setToolTipText("tooltip");
        btn.addActionListener(clicked -> openOptionPane());
        panel.add(btn);

        JToggleButton toggleBtn = new JToggleButton("toggle Button");
        panel.add(toggleBtn);

        JCheckBox checkBox = new JCheckBox("JCheckBox");
        panel.add(checkBox);
        String comboBoxListe[] = {"Baden-Württemberg", "Bayern", "Berlin", "Brandenburg", "Bremen", "Hamburg", "Hessen",
            "Mecklenburg-Vorpommern", "Niedersachsen", "Nordrhein-Westfalen", "Rheinland-Pfalz", "Saarland", "Sachsen",
            "Sachsen-Anhalt", "Schleswig-Holstein", "Thüringen"};
        JComboBox<String> comboBox = new JComboBox<String>(comboBoxListe);
        panel.add(comboBox);

        ButtonGroup group = new ButtonGroup();
        JRadioButton rbtn1 = new JRadioButton("rbtn1");
        rbtn1.setSelected(true);
        group.add(rbtn1);
        panel.add(rbtn1);
        JRadioButton rbtn2 = new JRadioButton("rbtn2");
        group.add(rbtn2);
        panel.add(rbtn2);
        JRadioButton rbtn3 = new JRadioButton("rbtn3");
        group.add(rbtn3);
        panel.add(rbtn3);

        this.componentFrame.add(panel);
    }

    private void openOptionPane()
    {
        String problem = JOptionPane.showInputDialog(null, "Was ist das Problem?");
        System.out.println(problem);
    }

    public static void main(String[] args)
    {
        new UIDummyComponents();
    }
}
