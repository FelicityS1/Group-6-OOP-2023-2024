import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Abstract class representing the basic structure of an item
abstract class Item {
    double price;

    // Constructor
    public Item(double price) {
        this.price = price;
    }

    // Abstract method to calculate total sales
    public abstract double calculateTotalSales();
}

public class SalesCalculator extends JFrame {
    private JTextField phonePriceField, phoneQuantityField, phoneTypeField, repairPriceField, repairHoursField, repairTypeField;
    private JButton calculateButton;

    // Concrete class for phones
    private class Phone extends Item {
        private int quantity;
        private String type;

        // Constructor
        public Phone(double price) {
            super(price);
        }

        // Implementation of the abstract method
        @Override
        public double calculateTotalSales() {
            return price * quantity;
        }

        // Setter for quantity
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        // Setter for type
        public void setType(String type) {
            this.type = type;
        }
    }

    // Concrete class for repair services
    private class Repair extends Item {
        private int hours;
        private String type;

        // Constructor
        public Repair(double price) {
            super(price);
        }

        // Implementation of the abstract method
        @Override
        public double calculateTotalSales() {
            return price * hours;
        }

        // Setter for hours
        public void setHours(int hours) {
            this.hours = hours;
        }

        // Setter for type
        public void setType(String type) {
            this.type = type;
        }
    }

    public SalesCalculator() {
        setTitle("Sales Calculator");
        setSize(300, 430);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);

        setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel phoneLabel = new JLabel("ITEM DETAILS:");
        phoneLabel.setBounds(20, 20, 150, 25);
        panel.add(phoneLabel);

        JLabel phoneTypeLabel = new JLabel("Item Type:");
        phoneTypeLabel.setBounds(30, 50, 150, 25);
        panel.add(phoneTypeLabel);

        phoneTypeField = new JTextField(10);
        phoneTypeField.setBounds(140, 50, 100, 25);
        panel.add(phoneTypeField);

        JLabel phonePriceLabel = new JLabel("Price:");
        phonePriceLabel.setBounds(30, 90, 150, 25);
        panel.add(phonePriceLabel);

        phonePriceField = new JTextField(10);
        phonePriceField.setBounds(140, 90, 100, 25);
        panel.add(phonePriceField);

        JLabel phoneQuantityLabel = new JLabel("Quantity sold:");
        phoneQuantityLabel.setBounds(30, 130, 150, 25);
        panel.add(phoneQuantityLabel);

        phoneQuantityField = new JTextField(10);
        phoneQuantityField.setBounds(140, 130, 100, 25);
        panel.add(phoneQuantityField);

        JLabel repairPanel = new JLabel("REPAIR DETAILS:");
        repairPanel.setBounds(20, 180, 150, 25);
        panel.add(repairPanel);

        JLabel repairTypeLabel = new JLabel("Service Type:");
        repairTypeLabel.setBounds(30, 210, 150, 25);
        panel.add(repairTypeLabel);

        repairTypeField = new JTextField(10);
        repairTypeField.setBounds(140, 210, 100, 25);
        panel.add(repairTypeField);

        JLabel repairPriceLabel = new JLabel("Price per hour:");
        repairPriceLabel.setBounds(30, 250, 150, 25);
        panel.add(repairPriceLabel);

        repairPriceField = new JTextField(10);
        repairPriceField.setBounds(140, 250, 100, 25);
        panel.add(repairPriceField);

        JLabel repairHoursLabel = new JLabel("Number of hours:");
        repairHoursLabel.setBounds(30, 290, 150, 25);
        panel.add(repairHoursLabel);

        repairHoursField = new JTextField(10);
        repairHoursField.setBounds(140, 290, 100, 25);
        panel.add(repairHoursField);

        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(95, 330, 100, 30);
        panel.add(calculateButton);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateSales();
            }
        });
    }

    private void calculateSales() {
        double phonePrice = Double.parseDouble(phonePriceField.getText());
        int phoneQuantity = Integer.parseInt(phoneQuantityField.getText());
        String phoneType = phoneTypeField.getText();

        double repairPricePerHour = Double.parseDouble(repairPriceField.getText());
        int repairHours = Integer.parseInt(repairHoursField.getText());
        String repairType = repairTypeField.getText();

        // Creating instances of concrete classes
        Phone phone = new Phone(phonePrice);
        Repair repair = new Repair(repairPricePerHour);

        // Setting quantities/hours and types for items
        phone.setQuantity(phoneQuantity);
        phone.setType(phoneType);

        repair.setHours(repairHours);
        repair.setType(repairType);

        // Calculating and displaying total sales
        double phoneTotalSales = phone.calculateTotalSales();
        double repairTotalSales = repair.calculateTotalSales();

        JOptionPane.showMessageDialog(this, "Total Sales for " + phoneType + " : ₱" + phoneTotalSales +
                "\nTotal Sales for " + repairType + " Services: ₱" + repairTotalSales);
    }

    public static void main(String[] args) {
        new SalesCalculator();
    }
}
