package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(200,300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }


    public JFrame getFrame() {
        return frame;
    }

    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("Are you?"));

        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");

        container.add(yes);
        container.add(no);

        container.add(new JLabel("Why?"));

        JRadioButton noReason = new JRadioButton("No reason!");
        JRadioButton itIsFun = new JRadioButton("Because it is fun!");

        ButtonGroup buttonGroup = new ButtonGroup();

        buttonGroup.add(noReason);
        buttonGroup.add(itIsFun);

        container.add(noReason);
        container.add(itIsFun);

        JButton done = new JButton("Done!");

        container.add(done);
    }
}
