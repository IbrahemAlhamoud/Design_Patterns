import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class App {

    public static JLabel label;
    public static JTextArea textArea;

    private Control control = new Control();

    public void initScreen() {
        JFrame frame = new JFrame("Screen");
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        label = new JLabel();
        label.setPreferredSize(new Dimension(300, 100));
        label.setBackground(Color.GRAY);
        content.add(label);

        textArea = new JTextArea();
        textArea.setSize(280, 100);
        textArea.setBackground(Color.cyan);
        textArea.setForeground(Color.BLUE);
        Font f = new Font("Arial", Font.BOLD, 12);
        textArea.setFont(f);


        JPanel buttons = new JPanel();
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        buttons.setLayout(grid);
        JButton Save = new JButton("Save");
        JButton CtrlZ = new JButton("Ctrl+z");
        JButton Delete = new JButton("Delete");

        Save.setBackground(Color.GREEN);
        CtrlZ.setBackground(Color.ORANGE);
        Delete.setBackground(Color.red);


        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        grid.setConstraints(Save, gridBagConstraints);
        buttons.add(Save);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        grid.setConstraints(CtrlZ, gridBagConstraints);
        buttons.add(CtrlZ);

        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        grid.setConstraints(Delete, gridBagConstraints);
        buttons.add(Delete);


        Save.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String x= executeCommand(new Save(control));
                label.setVerticalAlignment(JLabel.CENTER);
                label.setText("<html><font size='4' color='green'><b>"+x+"</b></font></html>");
            }
        });

        CtrlZ.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String x= executeCommand(new CtrlZ(control));
                label.setVerticalAlignment(JLabel.CENTER);
                label.setText("<html><font size='4' color='green'><b>"+x+"</b></font></html>");
            }
        });


        Delete.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String x= executeCommand(new Delete(control));
                label.setVerticalAlignment(JLabel.CENTER);
                label.setText("<html><font size='4' color='green'><b>"+x+"</b></font></html>");
            }
        });



        content.add(textArea);
        content.add(buttons);
        frame.setSize(280, 250);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    private String executeCommand(CommandBase command) {

        String x=command.execute();
        return x;

    }
}
