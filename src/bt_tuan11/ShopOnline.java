package bt_tuan11;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ShopOnline extends JFrame {
    private JPanel TOP, BOTTOM, LOW;
    private JPanel customerInfoPanel, productInfoPanel, functionPanel, finalPricePanel;
    private JScrollPane orderPanel;

    public ShopOnline() {
        super("Shop Online");
        TOP = new JPanel(new BorderLayout());
        BOTTOM = new JPanel(new BorderLayout());

        customerInfoPanel = new JPanel();
        productInfoPanel = new JPanel();
        functionPanel = new JPanel();
        orderPanel = new JScrollPane();
        finalPricePanel = new JPanel();

        //layout
        customerInfoPanel.setLayout(new GridLayout(3, 2));
        productInfoPanel.setLayout(new GridLayout(2, 2));
        functionPanel.setLayout(new FlowLayout());

        //border
        customerInfoPanel.setBorder(BorderFactory.createTitledBorder("Thong tin khach hang"));
        productInfoPanel.setBorder(BorderFactory.createTitledBorder("Chon san pham"));
        functionPanel.setBorder(BorderFactory.createTitledBorder("Thao tac dat hang"));
        finalPricePanel.setBorder(BorderFactory.createTitledBorder("Tong so tien can thanh toan"));


        //customerPanel
        JTextField nameField = new JTextField(10);
        JTextField addressField = new JTextField(10);
        JTextField phoneField = new JTextField(10);

        customerInfoPanel.add(new JLabel("Ho ten:"));
        customerInfoPanel.add(nameField);
        customerInfoPanel.add(new JLabel("Dia chi:"));
        customerInfoPanel.add(addressField);
        customerInfoPanel.add(new JLabel("So dien thoai:"));
        customerInfoPanel.add(phoneField);
        //customerInfoPanel.setLayout();

        //productInfoPanel
        JCheckBox check1 = new JCheckBox("Banh trang tron");
        JCheckBox check2 = new JCheckBox("Tra sua tran chau");
        JCheckBox check3 = new JCheckBox("Khoai tay chien");
        JCheckBox check4 = new JCheckBox("Banh trang tron");
        productInfoPanel.add(check1);
        productInfoPanel.add(check2);
        productInfoPanel.add(check3);
        productInfoPanel.add(check4);

        //functionPanel
        JButton book = new JButton("DatHang");
        JButton cancel = new JButton("Thoat");
        JButton delete = new JButton("Xoa SP");
        JButton pay = new JButton("Thanh toan");
        functionPanel.add(book);
        functionPanel.add(cancel);
        functionPanel.add(delete);
        functionPanel.add(pay);


        //orderPanel
        String[] columnNames = {"STT", "Ten san pham", "Don gia"};
        Object[][] initData = {
                {"1", "Banh trang tron", "10000"},
                {"2", "Tra sua tran chau", "20000"},
                {"3", "Khoai tay chien", "15000"},
                {"4", "Banh trang tron", "10000"},
                {"1", "Banh trang tron", "10000"},
                {"2", "Tra sua tran chau", "20000"},
                {"3", "Khoai tay chien", "15000"},
                {"4", "Banh trang tron", "10000"},
                {"1", "Banh trang tron", "10000"},
                {"2", "Tra sua tran chau", "20000"},
                {"3", "Khoai tay chien", "15000"},
                {"4", "Banh trang tron", "10000"},
                {"1", "Banh trang tron", "10000"},
                {"2", "Tra sua tran chau", "20000"},
                {"3", "Khoai tay chien", "15000"},
                {"4", "Banh trang tron", "10000"}
        };
        JTable table = new JTable(initData, columnNames);
        table.setFillsViewportHeight(true);
        orderPanel.setViewportView(table);

        //finalPricePanel
        JLabel finalPrice = new JLabel("0.0");
        finalPricePanel.add(finalPrice);






        //add to window
        TOP.add(customerInfoPanel, BorderLayout.NORTH);
        TOP.add(productInfoPanel, BorderLayout.CENTER);
        TOP.add(functionPanel, BorderLayout.SOUTH);

        BOTTOM.add(orderPanel, BorderLayout.CENTER);
        BOTTOM.add(finalPricePanel, BorderLayout.SOUTH);

        //setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setLayout(new BorderLayout());
        getContentPane().add(TOP, BorderLayout.NORTH);
        getContentPane().add(BOTTOM, BorderLayout.CENTER);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);
        //pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        new ShopOnline();
    }
}
