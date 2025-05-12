package language.java.frame_example;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 * This program is for myself understand the basic of java swing before exam.
 * So, it can not work and not make sense in code.
 * And it also can not work.
 * 
 */




public class main extends JFrame implements ActionListener {
    
    private int confirm_msg_result;
    public static void main(String[] args) {
        main frame = new main();
        frame.createGUI();
    }

    private JTextField textField;
    private void createGUI(){
        createFrame();
        welcome_msg();
        confirm_msg();
        get_confirm_msg();
    }
    private void createFrame(){
        
        // Initialize the frame
        JFrame frame = new JFrame("Recurrence Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize the panel
        JPanel panel = new JPanel();

        // Value text field
        JLabel label = new JLabel("Enter the initial value:");
        textField = new JTextField(10);

        // Caculate button
        JButton button = new JButton("Caculate");
        button.addActionListener(this);

        // Add components to the panel
        panel.add(button);
        panel.add(textField);
        panel.add(label);

        // Add panel to the frame
        frame.add(panel);

        // Set the frame to visible
        frame.setVisible(true);
        frame.pack();

        panel.setLayout(new FlowLayout());
        

    }

    private void welcome_msg(){
        JOptionPane.showMessageDialog(this, "Welcome to the Recurrence Calculator");
    }

    private void confirm_msg(){
        confirm_msg_result = JOptionPane.showConfirmDialog(
            this,
            "Are you sure you want to calculate?",
            "Title",
            JOptionPane.YES_NO_OPTION
        );
    }

    private void get_confirm_msg(){
        if(confirm_msg_result == JOptionPane.YES_OPTION){
            JOptionPane.showInputDialog(this, "Enter the initial value:");
        }else{
            JOptionPane.showMessageDialog(this, "You clicked no");
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textField.getText();
        int value = Integer.parseInt(text);
        int result = value * 2;
    }

}


