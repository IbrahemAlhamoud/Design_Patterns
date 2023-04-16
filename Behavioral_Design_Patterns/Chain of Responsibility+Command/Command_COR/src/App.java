import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class App {

    public static JLabel label;
    public static JTextArea textArea;


    private Control control = new Control();




    public void initMobile() {
        JFrame frame = new JFrame("Mobile");
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        label = new JLabel();
        label.setPreferredSize(new Dimension(300, 100));
        content.add(label);


        textArea = new JTextArea();
        textArea.setSize(280,100);
        textArea.setBackground(Color.cyan);
        textArea.setForeground(Color.BLUE);
        Font f = new Font("Arial", Font.BOLD, 12);
        textArea.setFont(f);



        JPanel buttons = new JPanel();
        GridBagLayout grid =new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        buttons.setLayout(grid);
        JButton On = new JButton("on");
        JButton Off = new JButton("off");
        JButton VolumeUp = new JButton("Volume+");
        JButton VolumeDown = new JButton("Volume-");
        JButton Next = new JButton("<--");
        JButton Previous= new JButton("-->");
        JButton Send= new JButton("Send");
        JButton Add= new JButton("add");
        JButton Delete= new JButton("delete");
        JButton n1 = new JButton("1");
        JButton n2 = new JButton("2");
        JButton n3 = new JButton("3");
        JButton n4 = new JButton("4");
        JButton n5 = new JButton("5");
        JButton n6 = new JButton("6");
        JButton n7 = new JButton("7");
        JButton n8 = new JButton("8");
        JButton n9 = new JButton("9");
        JButton n0 = new JButton("0");



        gridBagConstraints.gridx=0; gridBagConstraints.gridy=0;
        grid.setConstraints(On,gridBagConstraints);
        buttons.add(On);

        gridBagConstraints.gridx=1; gridBagConstraints.gridy=0;
        grid.setConstraints(VolumeUp,gridBagConstraints);
        buttons.add(VolumeUp);

        gridBagConstraints.gridx=2; gridBagConstraints.gridy=0;
        grid.setConstraints(Off,gridBagConstraints);
        buttons.add(Off);

        gridBagConstraints.gridx=0; gridBagConstraints.gridy=1;
        grid.setConstraints(Next,gridBagConstraints);
        buttons.add(Next);

        gridBagConstraints.gridx=1; gridBagConstraints.gridy=1;
        grid.setConstraints(Send,gridBagConstraints);
        buttons.add(Send);

        gridBagConstraints.gridx=2; gridBagConstraints.gridy=1;
        grid.setConstraints(Previous,gridBagConstraints);
        buttons.add(Previous);

        gridBagConstraints.gridx=0; gridBagConstraints.gridy=2;
        grid.setConstraints(Add,gridBagConstraints);
        buttons.add(Add);

        gridBagConstraints.gridx=1; gridBagConstraints.gridy=2;
        grid.setConstraints(VolumeDown,gridBagConstraints);
        buttons.add(VolumeDown);

        gridBagConstraints.gridx=2; gridBagConstraints.gridy=2;
        grid.setConstraints(Delete,gridBagConstraints);
        buttons.add(Delete);

        gridBagConstraints.gridx=0; gridBagConstraints.gridy=3;
        grid.setConstraints(n1,gridBagConstraints);
        buttons.add(n1);

        gridBagConstraints.gridx=1; gridBagConstraints.gridy=3;
        grid.setConstraints(n2,gridBagConstraints);
        buttons.add(n2);

        gridBagConstraints.gridx=2; gridBagConstraints.gridy=3;
        grid.setConstraints(n3,gridBagConstraints);
        buttons.add(n3);

        gridBagConstraints.gridx=0; gridBagConstraints.gridy=4;
        grid.setConstraints(n4,gridBagConstraints);
        buttons.add(n4);

        gridBagConstraints.gridx=1; gridBagConstraints.gridy=4;
        grid.setConstraints(n5,gridBagConstraints);
        buttons.add(n5);

        gridBagConstraints.gridx=2; gridBagConstraints.gridy=4;
        grid.setConstraints(n6,gridBagConstraints);
        buttons.add(n6);

        gridBagConstraints.gridx=0; gridBagConstraints.gridy=5;
        grid.setConstraints(n7,gridBagConstraints);
        buttons.add(n7);

        gridBagConstraints.gridx=1; gridBagConstraints.gridy=5;
        grid.setConstraints(n8,gridBagConstraints);
        buttons.add(n8);

        gridBagConstraints.gridx=2; gridBagConstraints.gridy=5;
        grid.setConstraints(n9,gridBagConstraints);
        buttons.add(n9);

        gridBagConstraints.gridx=1; gridBagConstraints.gridy=6;
        grid.setConstraints(n0,gridBagConstraints);
        buttons.add(n0);



        On.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x= executeCommand(new ON(control));
                label.setVerticalAlignment(JLabel.CENTER);
                label.setText("<html><font size='4' color='green'><b>"+x+"</b></font></html>");


            }

        });

        Off.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String x= executeCommand(new OFF(control));
                label.setVerticalAlignment(JLabel.CENTER);
                label.setText("<html><font size='4' color='red'><b>"+x+"</b></font></html>");

            }
        });

        VolumeUp.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String x= executeCommand(new VolumeUpMo(control));
                label.setVerticalAlignment(JLabel.CENTER);
                label.setText("<html><font size='4' color='green'><b>"+x+"</b></font></html>");
            }
        });

        VolumeDown.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String x= executeCommand(new VolumeDownMo(control));
                label.setVerticalAlignment(JLabel.CENTER);
                label.setText("<html><font size='4' color='green'><b>"+x+"</b></font></html>");
            }
        });

        n0.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String x = executeCommand(new number0(control));
                label.setVerticalAlignment(JLabel.CENTER);


                label.setText("<html><font size='4' color='green'><b>" + x + "</b></font></html>");

            }
        });

        n1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String x= executeCommand(new number1(control));
                label.setVerticalAlignment(JLabel.CENTER);
                label.setText("<html><font size='4' color='green'><b>"+x+"</b></font></html>");
            }
        });

        n2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String x= executeCommand(new number2(control));
                label.setVerticalAlignment(JLabel.CENTER);
                label.setText("<html><font size='4' color='green'><b>"+x+"</b></font></html>");
            }
        });

        n3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String x= executeCommand(new number3(control));
                label.setVerticalAlignment(JLabel.CENTER);
                label.setText("<html><font size='4' color='green'><b>"+x+"</b></font></html>");
            }
        });

        n4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String x= executeCommand(new number4(control));
                label.setVerticalAlignment(JLabel.CENTER);
                label.setText("<html><font size='4' color='green'><b>"+x+"</b></font></html>");
            }
        });

        n5.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String x= executeCommand(new number5(control));
                label.setVerticalAlignment(JLabel.CENTER);
                label.setText("<html><font size='4' color='green'><b>"+x+"</b></font></html>");
            }
        });
        n6.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String x= executeCommand(new number6(control));
                label.setVerticalAlignment(JLabel.CENTER);
                label.setText("<html><font size='4' color='green'><b>"+x+"</b></font></html>");
            }
        });

        n7.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String x= executeCommand(new number7(control));
                label.setVerticalAlignment(JLabel.CENTER);
                label.setText("<html><font size='4' color='green'><b>"+x+"</b></font></html>");
            }
        });

        n8.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String x= executeCommand(new number8(control));
                label.setVerticalAlignment(JLabel.CENTER);
                label.setText("<html><font size='4' color='green'><b>"+x+"</b></font></html>");
            }
        });

        n9.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String x= executeCommand(new number9(control));
                label.setVerticalAlignment(JLabel.CENTER);
                label.setText("<html><font size='4' color='green'><b>"+x+"</b></font></html>");
            }
        });



        Add.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String x= executeCommand(new ADD(control));
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

        Send.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String x= executeCommand(new Send(control));
                label.setVerticalAlignment(JLabel.CENTER);
                label.setText("<html><font size='1' color='green'><b>"+x+"</b></font></html>");
            }
        });

        Next.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CommandHistory.setCheckNext(true);
                NEXT n =new NEXT(control);
                String x= executeCommand(n);
                label.setVerticalAlignment(JLabel.CENTER);
                label.setText("<html><font size='4' color='green'><b>"+x+"</b></font></html>");


            }
        });

       Previous.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CommandHistory.setCheckPrevious(true);
                Previous p = new Previous(control);
                String x= executeCommand(p);
                label.setVerticalAlignment(JLabel.CENTER);
                label.setText("<html><font size='4' color='green'><b>"+x+"</b></font></html>");


            }
        });




        content.add(textArea);
        content.add(buttons);
        frame.setSize(280, 350);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private String executeCommand(CommandBase command) {

                String x=command.execute();
                return x;

    }

}
