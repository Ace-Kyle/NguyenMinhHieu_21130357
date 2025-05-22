package bt_tuan10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class SimpleDraw extends JFrame {

    private JToolBar toolBar;
    private JPanel panelNorth, panelWest, panelCenter;

    private JButton btnClear, btnRed, btnBlue;
    private JRadioButton btnSquare, btnOval, btnLine;
    private JRadioButton btnFill, btnOutline;
    private ButtonGroup groupShape, groupType;

    private String selectedColor = "";
    private String selectedShape = "";
    private String selectedType = "";
    private List<Point> list = new ArrayList<Point>();

    public SimpleDraw() {
        super("Using mouse to paint");
        //or use setTitle()
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        //panel
        toolBar = new JToolBar();
        panelNorth = new JPanel();
        panelNorth.setLayout(new FlowLayout());
        panelCenter = new ProcessPain();
        panelCenter.setBackground(Color.YELLOW);
        panelWest = new JPanel();
        panelWest.setLayout(new FlowLayout());
        panelWest.setBackground(Color.PINK);

        //menu
        JMenuItem itemSquare = new JMenuItem(btnSquareAction);
        JMenuItem itemOval = new JMenuItem(btnOvalAction);
        JMenuItem itemLine = new JMenuItem(btnLineAction);

        JMenuItem itemRed = new JMenuItem(btnRedAction);
        JMenuItem itemBlue = new JMenuItem(btnBlueAction);

        JMenuItem itemFill = new JMenuItem(btnFillAction);
        JMenuItem itemOutline = new JMenuItem(btnOutlineAction);

        JMenu shapeMenu = new JMenu("Shape");
            shapeMenu.add(itemSquare);
            shapeMenu.add(itemOval);
            shapeMenu.add(itemLine);
        JMenu colorMenu = new JMenu("Color");
            colorMenu.add(itemRed);
            colorMenu.add(itemBlue);
        JMenu typeMenu = new JMenu("Type");
            typeMenu.add(itemFill);
            typeMenu.add(itemOutline);
        JMenu fileMenu = new JMenu("File");
            fileMenu.add(new JMenuItem(exitAction));

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        menuBar.add(shapeMenu);
        menuBar.add(colorMenu);
        menuBar.add(typeMenu);

        toolBar.add(menuBar);

        //button
        btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.clear();
                panelCenter.repaint();
            }
        });
/*        btnBlue = new JButton("Blue");
        btnBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedColor = "Blue";
            }
        });*/
        btnBlue = new JButton(btnBlueAction);
        btnBlue.setBackground(Color.BLUE);
/*        btnRed = new JButton("Red");
        btnRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedColor = "Red";
            }
        });*/
        btnRed = new JButton(btnRedAction);
        btnRed.setBackground(Color.RED);

        /*btnSquare = new JRadioButton("Square");
        btnSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedShape = "Square";
            }
        });
        btnOval = new JRadioButton("Oval");
        btnOval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedShape = "Oval";
            }
        });
        btnFill = new JRadioButton("Fill");
        btnFill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedType = "Fill";
            }
        });
        btnOutline = new JRadioButton("Outline");
        btnOutline.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedType = "Outline";
            }
        });*/
        btnSquare = new JRadioButton(btnSquareAction);
        btnOval = new JRadioButton(btnOvalAction);
        btnLine = new JRadioButton(btnLineAction);

        btnFill = new JRadioButton(btnFillAction);
        btnOutline = new JRadioButton(btnOutlineAction);

        //add
        panelNorth.add(btnRed);
        panelNorth.add(btnBlue);
        panelWest.add(btnClear);
        //panelWest.add(btnClear, FlowLayout.CENTER);

        groupShape = new ButtonGroup();
        groupShape.add(btnSquare);
        groupShape.add(btnOval);
        groupShape.add(btnLine);

        groupType = new ButtonGroup();
        groupType.add(btnFill);
        groupType.add(btnOutline);

        panelNorth.add(btnSquare);
        panelNorth.add(btnOval);
        panelNorth.add(btnLine);
        panelNorth.add(btnFill);
        panelNorth.add(btnOutline);
        toolBar.add(panelNorth);

        getContentPane().add(toolBar, BorderLayout.NORTH);
        getContentPane().add(panelWest, BorderLayout.WEST);
        getContentPane().add(panelCenter, BorderLayout.CENTER);

        setSize(800, 500);
        setLocationRelativeTo(null);
        setVisible(true);



    }

    //Refactor code - reuse
    //Action for color
    Action btnRedAction = new AbstractAction("Red") {
        @Override
        public void actionPerformed(ActionEvent e) {
            selectedColor = "Red";
        }
    };
    Action btnBlueAction = new AbstractAction("Blue") {
        @Override
        public void actionPerformed(ActionEvent e) {
            selectedColor = "Blue";
        }
    };

    //Action for shape
    Action btnSquareAction = new AbstractAction("Square") {
        @Override
        public void actionPerformed(ActionEvent e) {
            selectedShape = "Square";
        }
    };
    Action btnOvalAction = new AbstractAction("Oval") {
        @Override
        public void actionPerformed(ActionEvent e) {
            selectedShape = "Oval";
        }
    };
    Action btnLineAction = new AbstractAction("Line") {
        @Override
        public void actionPerformed(ActionEvent e) {
            selectedShape = "Line";
        }
    };
    Action btnFillAction = new AbstractAction("Fill") {
        @Override
        public void actionPerformed(ActionEvent e) {
            selectedType = "Fill";
        }
    };
    Action btnOutlineAction = new AbstractAction("Outline") {
        @Override
        public void actionPerformed(ActionEvent e) {
            selectedType = "Outline";
        }
    };
    Action exitAction = new AbstractAction("Exit") {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    };



    private class ProcessPain extends JPanel{
        Point first = null;
        int mx, my;
        int size = 10;

        public ProcessPain(){
            addMouseListener(new ProcessMouse());
            addMouseMotionListener(new ProcessMouse());
            revalidate();
            setFocusable(true);
            repaint();
        }

        @Override
        public void paintComponents(Graphics g) {
            super.paintComponents(g);

            Color currentColor = switch (selectedColor){
                case "Blue" -> Color.BLUE;
                case "Red" -> Color.RED;
                default -> Color.BLACK;
            };
            boolean isFill = selectedType.equals("Fill");

            System.out.println("::paintComponents::");
            for (int i=0; i<list.size(); i++){
                mx = list.get(i).x;
                my = list.get(i).y;


                if (selectedColor.isEmpty() && selectedShape.isEmpty() && selectedType.isEmpty()) {
                    System.out.println("Please select color, shape and type");
                    System.exit(0);
                } else {
                    g.setColor(currentColor);
                    switch (selectedShape){
                        case "Square":{
                            if(isFill){g.fillRect(mx, my, size, size);}
                            g.drawRect(mx, my, size, size);
                            break;
                        }
                        case "Oval":{
                            if(isFill){g.fillOval(mx, my, size, size);}
                            g.drawOval(mx, my, size, size);
                            break;
                        }
                        case "Line":{
                            g.drawLine(mx, my, mx+size, my+size);
                        }

                    }


                }
            }
        }

        private class ProcessMouse implements MouseListener, MouseMotionListener {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("::mouseClicked::");
                if (first == null) {
                    first = e.getPoint();
                }
                paintComponents(getGraphics());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("::mouseDragged::");
                Point point = e.getPoint();
                list.add(point);
                paintComponents(getGraphics());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                //System.out.println("::mouseMoved::");

            }
        }
    }
}
