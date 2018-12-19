package pkg;

import javax.swing.*;

public class PccForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("PccForm");
        frame.setContentPane(new PccForm().mPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        exitButton.addActionListener(e -> System.exit(0));
        }
    public JPanel mPanel;
    public JButton chassisButton;
    public JButton videoCardButton;
    public JButton storageButton;
    public JCheckBox storageSelectedCheckBox;
    public JCheckBox videoCardSelectedCheckBox;
    public JCheckBox chassisSelectedCheckBox;
    public JTextField textField1;
    private JButton exitButton;
}
