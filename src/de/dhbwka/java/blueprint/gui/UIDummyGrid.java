package de.dhbwka.java.blueprint.gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UIDummyGrid
{
    JFrame mainFrame;
    JPanel inputPanel;
    JPanel inputPanel1;
    JPanel inputPanel2;
    JPanel radioPanel;
    JPanel outputPanel;

    JLabel input1;
    JTextField input1Value;
    JLabel input2;
    JTextField input2Value;
    JRadioButton radio1;
    JRadioButton radio2;
    JButton button;
    JLabel output;
    JTextField outputValue;
    JTextArea status;

    public UIDummyGrid()
    {
        mainFrame = new JFrame("Beispiel");
        mainFrame.getContentPane().setLayout(new GridLayout(6, 1));

        inputPanel1 = new JPanel(new FlowLayout());
        input1 = new JLabel("Input 1: ");
        inputPanel1.add(input1);
        input1Value = new JTextField(10);
        inputPanel1.add(input1Value);
        mainFrame.add(inputPanel1);

        inputPanel2 = new JPanel(new FlowLayout());
        input2 = new JLabel("Input2: ");
        inputPanel2.add(input2);
        input2Value = new JTextField(10);
        inputPanel2.add(input2Value);
        mainFrame.add(inputPanel2);

        radioPanel = new JPanel(new FlowLayout());
        ButtonGroup group = new ButtonGroup();
        radio1 = new JRadioButton("opt1");
        radio1.setSelected(true);
        radioPanel.add(radio1);
        group.add(radio1);
        radio2 = new JRadioButton("opt2");
        radioPanel.add(radio2);
        group.add(radio2);
        mainFrame.add(radioPanel);

        button = new JButton("some Action");
        button.addActionListener(clicked -> doSomething());
        mainFrame.add(button);

        outputPanel = new JPanel(new FlowLayout());
        output = new JLabel("output:");
        outputPanel.add(output);
        outputValue = new JTextField(15);
        outputPanel.add(outputValue);
        mainFrame.add(outputPanel);

        status = new JTextArea();
        mainFrame.add(status);


        this.mainFrame.setSize(400, 600);
        //        this.mainFrame.pack();
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainFrame.setVisible(true);
    }

    private void doSomething()
    {
        if (radio1.isSelected())
        {
            outputValue.setText(input1Value.getText());
            status.setText("Input 1 gewählt");
        }
        else
        {
            outputValue.setText(input2Value.getText());
            status.setText("Input 2 gewählt");
        }
    }

    public static void main(String[] args)
    {
        new UIDummyGrid();
    }
}
