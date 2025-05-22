package bt_tuan11;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ShopOnline extends JFrame {
    private JPanel TOP, BOTTOM;
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

        customerInfoPanel.setLayout(new GridLayout(3, 2));
        productInfoPanel.setLayout(new GridLayout(2, 2));
        functionPanel.setLayout(new FlowLayout());

        customerInfoPanel.setBorder(BorderFactory.createTitledBorder("Thong tin khach hang"));
        productInfoPanel.setBorder(BorderFactory.createTitledBorder("Chon san pham"));
        functionPanel.setBorder(BorderFactory.createTitledBorder("Thao tac dat hang"));
        finalPricePanel.setBorder(BorderFactory.createTitledBorder("Tong so tien can thanh toan"));


        //customerPanel

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

        //orderPanel
        JTable table = new JTable(new DefaultTableModel());
        orderPanel.add(table);

        //finalPricePanel
        finalPricePanel.add(new JLabel("0.0"));






        //add to window
        TOP.add(customerInfoPanel, BorderLayout.NORTH);
        TOP.add(productInfoPanel, BorderLayout.CENTER);
        TOP.add(functionPanel, BorderLayout.SOUTH);

        BOTTOM.add(orderPanel, BorderLayout.CENTER);
        BOTTOM.add(finalPricePanel, BorderLayout.SOUTH);

        //setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setLayout(new BorderLayout());
        getContentPane().add(TOP, BorderLayout.NORTH);
        getContentPane().add(productInfoPanel, BorderLayout.CENTER);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ShopOnline();
    }
}
