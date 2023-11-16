import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registration extends JFrame implements ActionListener {

    private Container container;
    private JLabel titleLabel;
    private JLabel nameLabel;
    private JTextField nameTextField;
    private JLabel mobileLabel;
    private JTextField mobileTextField;
    private JLabel genderLabel;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private ButtonGroup genderButtonGroup;
    private JLabel dobLabel;
    private JComboBox<String> dayComboBox;
    private JComboBox<String> monthComboBox;
    private JComboBox<String> yearComboBox;
    private JLabel addressLabel;
    private JTextArea addressTextArea;
    private JCheckBox termsCheckBox;
    private JButton submitButton;
    private JButton resetButton;
    private JTextArea outputTextArea;
    private JLabel resultLabel;
    private JTextArea resultAddressTextArea;

    private String days[]
            = {"1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31"};
    private String months[]
            = {"Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sep", "Oct", "Nov", "Dec"};
    private String years[]
            = {"1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019", "2020", "2021", "2022", "2023"};

    public Registration() {
        setTitle("Registration Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        titleLabel = new JLabel("Registration Form");
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        titleLabel.setSize(300, 30);
        titleLabel.setLocation(300, 30);
        container.add(titleLabel);

        nameLabel = new JLabel("Name");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        nameLabel.setSize(100, 20);
        nameLabel.setLocation(100, 100);
        container.add(nameLabel);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        nameTextField.setSize(190, 20);
        nameTextField.setLocation(200, 100);
        container.add(nameTextField);

        mobileLabel = new JLabel("Mobile");
        mobileLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        mobileLabel.setSize(100, 20);
        mobileLabel.setLocation(100, 150);
        container.add(mobileLabel);

        mobileTextField = new JTextField();
        mobileTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        mobileTextField.setSize(150, 20);
        mobileTextField.setLocation(200, 150);
        container.add(mobileTextField);

        genderLabel = new JLabel("Gender");
        genderLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        genderLabel.setSize(100, 20);
        genderLabel.setLocation(100, 200);
        container.add(genderLabel);

        maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setFont(new Font("Arial", Font.PLAIN, 15));
        maleRadioButton.setSelected(true);
        maleRadioButton.setSize(75, 20);
        maleRadioButton.setLocation(200, 200);
        container.add(maleRadioButton);

        femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setFont(new Font("Arial", Font.PLAIN, 15));
        femaleRadioButton.setSelected(false);
        femaleRadioButton.setSize(80, 20);
        femaleRadioButton.setLocation(275, 200);
        container.add(femaleRadioButton);

        genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(maleRadioButton);
        genderButtonGroup.add(femaleRadioButton);

        dobLabel = new JLabel("DOB");
        dobLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        dobLabel.setSize(100, 20);
        dobLabel.setLocation(100, 250);
        container.add(dobLabel);

        dayComboBox = new JComboBox<>(days);
        dayComboBox.setFont(new Font("Arial", Font.PLAIN, 15));
        dayComboBox.setSize(50, 20);
        dayComboBox.setLocation(200, 250);
        container.add(dayComboBox);

        monthComboBox = new JComboBox<>(months);
        monthComboBox.setFont(new Font("Arial", Font.PLAIN, 15));
        monthComboBox.setSize(60, 20);
        monthComboBox.setLocation(250, 250);
        container.add(monthComboBox);

        yearComboBox = new JComboBox<>(years);
        yearComboBox.setFont(new Font("Arial", Font.PLAIN, 15));
        yearComboBox.setSize(60, 20);
        yearComboBox.setLocation(320, 250);
        container.add(yearComboBox);

        addressLabel = new JLabel("Address");
        addressLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        addressLabel.setSize(100, 20);
        addressLabel.setLocation(100, 300);
        container.add(addressLabel);

        addressTextArea = new JTextArea();
        addressTextArea.setFont(new Font("Arial", Font.PLAIN, 15));
        addressTextArea.setSize(200, 75);
        addressTextArea.setLocation(200, 300);
        addressTextArea.setLineWrap(true);
        container.add(addressTextArea);

        termsCheckBox = new JCheckBox("Accept Terms And Conditions.");
        termsCheckBox.setFont(new Font("Arial", Font.PLAIN, 15));
        termsCheckBox.setSize(250, 20);
        termsCheckBox.setLocation(150, 400);
        container.add(termsCheckBox);

        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.PLAIN, 15));
        submitButton.setSize(100, 20);
        submitButton.setLocation(150, 450);
        submitButton.addActionListener(this);
        container.add(submitButton);

        resetButton = new JButton("Reset");
        resetButton.setFont(new Font("Arial", Font.PLAIN, 15));
        resetButton.setSize(100, 20);
        resetButton.setLocation(270, 450);
        resetButton.addActionListener(this);
        container.add(resetButton);

        outputTextArea = new JTextArea();
        outputTextArea.setFont(new Font("Arial", Font.PLAIN, 15));
        outputTextArea.setSize(300, 400);
        outputTextArea.setLocation(500, 100);
        outputTextArea.setLineWrap(true);
        outputTextArea.setEditable(false);
        container.add(outputTextArea);

        resultLabel = new JLabel("");
        resultLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        resultLabel.setSize(500, 25);
        resultLabel.setLocation(100, 500);
        container.add(resultLabel);

        resultAddressTextArea = new JTextArea();
        resultAddressTextArea.setFont(new Font("Arial", Font.PLAIN, 15));
        resultAddressTextArea.setSize(200, 75);
        resultAddressTextArea.setLocation(580, 175);
        resultAddressTextArea.setLineWrap(true);
        container.add(resultAddressTextArea);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            if (termsCheckBox.isSelected()) {
                String data1;
                String data
                        = "Name : "
                        + nameTextField.getText() + "\n"
                        + "Mobile : "
                        + mobileTextField.getText() + "\n";
                if (maleRadioButton.isSelected())
                    data1 = "Gender : Male"
                            + "\n";
                else
                    data1 = "Gender : Female"
                            + "\n";
                String data2
                        = "DOB : "
                        + (String) dayComboBox.getSelectedItem()
                        + "/" + (String) monthComboBox.getSelectedItem()
                        + "/" + (String) yearComboBox.getSelectedItem()
                        + "\n";

                String data3 = "Address : " + addressTextArea.getText();
                outputTextArea.setText(data + data1 + data2 + data3);
                outputTextArea.setEditable(false);
                resultLabel.setText("Registration Successfully..");
            } else {
                outputTextArea.setText("");
                resultAddressTextArea.setText("");
                resultLabel.setText("Please accept the"
                        + " terms & conditions..");
            }
        } else if (e.getSource() == resetButton) {
            String def = "";
            nameTextField.setText(def);
            addressTextArea.setText(def);
            mobileTextField.setText(def);
            resultLabel.setText(def);
            outputTextArea.setText(def);
            termsCheckBox.setSelected(false);
            dayComboBox.setSelectedIndex(0);
            monthComboBox.setSelectedIndex(0);
            yearComboBox.setSelectedIndex(0);
            resultAddressTextArea.setText(def);
        }
    }

    public static void main(String[] args) throws Exception {
        new Registration();
    }
}
