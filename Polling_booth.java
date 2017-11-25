import javax.swing. * ;
import java.awt.event. * ;
class Polling_booth extends JFrame implements ActionListener {
    JRadioButton rb1,
    rb2,
    rb3;
    int count_1 = 0,
    count_2 = 0,
    count_3 = 0,
    x;
    JButton submit,
    result;
    Polling_booth() {
        rb1 = new JRadioButton("Tezuesh");
        rb1.setBounds(50, 50, 100, 30);
        rb2 = new JRadioButton("Square");
        rb2.setBounds(50, 100, 100, 30);
        rb3 = new JRadioButton("Gullu");
        rb3.setBounds(50, 150, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        submit = new JButton("Submit");
        submit.setBounds(50, 200, 80, 30);
        submit.addActionListener(this);
        result = new JButton("Result");
        result.setBounds(150, 200, 80, 30);
        result.addActionListener(this);
        add(rb1);
        add(rb2);
        add(submit);
        add(rb3);
        add(result);
        setSize(500, 500);
        setLayout(null);
        setTitle("POLL:");
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {
            if (rb1.isSelected()) {
                x = JOptionPane.showConfirmDialog(this, "are you sure?");
                if (x == 0) {
                    count_1++;
                }
            }
            if (rb2.isSelected()) {
                x = JOptionPane.showConfirmDialog(this, "are you sure?");
                if (x == 0) {
                    count_2++;
                }
            }
            if (rb3.isSelected()) {
                x = JOptionPane.showConfirmDialog(this, "are you sure?");
                if (x == 0) {
                    count_3++;
                }
            }
        }
        if (e.getSource() == result) {
            if (count_1 > count_3 && count_1 > count_2) {
                JOptionPane.showMessageDialog(this, "Tezuesh");
            }
            if (count_2 > count_1 && count_2 > count_3) {
                JOptionPane.showMessageDialog(this, "Square");
            }
            if (count_3 > count_1 && count_3 > count_2) {
                JOptionPane.showMessageDialog(this, "Gullu");
            }
            if (count_2 == count_1 && count_1 > count_3) {
                JOptionPane.showMessageDialog(this, "Tezuesh and Square get same amount of votes");
            }
            if (count_3 == count_1 && count_1 > count_2) {
                JOptionPane.showMessageDialog(this, "Tezuesh aur Gullu get same amount of votes");
            }
            if (count_2 == count_3 && count_3 > count_1) {
                JOptionPane.showMessageDialog(this, "Gullu aur Tezuesh get same amount of votes");
            }
            if (count_3 == count_1 && count_1 == count_2) {
                JOptionPane.showMessageDialog(this, "All candidates same amount of votes");
            }
        }

    }
    public static void main(String args[]) {
        new Polling_booth();
    }
}