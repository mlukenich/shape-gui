package cmsc.shape;
/**
 * File: ShapeGUI.java
 * Name: Matt Lukenich
 * Class: CMSC335
 * Date: 11/08/2025
 */

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Shape GUI main class
 * Builds the GUI, handles events, and coordinates all actions
 */
public class ShapeGUI extends JFrame {

    // variables for the different gui components
    private final JList<String> shapeList;
    private final DisplayPanel displayPanel;
    private final JLabel dim1Label;
    private final JLabel dim2Label;
    private final JComboBox<Integer> dim1ComboBox;
    private final JComboBox<Integer> dim2ComboBox;

    /**
     * Constructor
     */
    public ShapeGUI() {
        // sets up the frame for the gui
        setTitle("Shape Displayer");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // shapes for gui control
        String[] shapeNames = {
                "Circle", "Square", "Rectangle", "Triangle", "Sphere",
                "Cube", "Cone", "Cylinder", "Torus"
        };
        shapeList = new JList<>(shapeNames);
        shapeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        shapeList.addListSelectionListener(new ShapeListListener());
        JScrollPane listScrollPane = new JScrollPane(shapeList);
        listScrollPane.setBorder(BorderFactory.createTitledBorder("Select Shape"));
        add(listScrollPane, BorderLayout.WEST);

        // center panel
        displayPanel = new DisplayPanel();
        displayPanel.setBorder(BorderFactory.createTitledBorder("Display"));
        add(displayPanel, BorderLayout.CENTER);

        // bottom panel
        JPanel controlPanel = new JPanel(new FlowLayout());
        controlPanel.setBorder(BorderFactory.createTitledBorder("Enter Dimensions"));

        dim1Label = new JLabel("Dim 1:");
        Integer[] dimensionChoices = {50, 100, 150, 200, 250};
        dim1ComboBox = new JComboBox<>(dimensionChoices);
        controlPanel.add(dim1Label);
        controlPanel.add(dim1ComboBox);

        dim2Label = new JLabel("Dim 2:");
        dim2ComboBox = new JComboBox<>(dimensionChoices);
        controlPanel.add(dim2Label);
        controlPanel.add(dim2ComboBox);

        // display button
        JButton displayButton = new JButton("Display Shape");
        displayButton.addActionListener(new DisplayButtonListener());
        controlPanel.add(displayButton);

        add(controlPanel, BorderLayout.SOUTH);

        // initial state
        shapeList.setSelectedIndex(0);
        updateControls();
    }

    /*
     * Updates the control panel based on the current shape
     */
    private void updateControls() {
        String selectedShape = shapeList.getSelectedValue();
        if (selectedShape == null) return;

        switch (selectedShape) {
            case "Circle":
            case "Sphere":
                dim1Label.setText("Radius:");
                dim2Label.setVisible(false);
                dim2ComboBox.setVisible(false);
                break;
            case "Square":
            case "Cube":
                dim1Label.setText("Side:");
                dim2Label.setVisible(false);
                dim2ComboBox.setVisible(false);
                break;
            case "Triangle":
                dim1Label.setText("Side:");
                dim2Label.setVisible(false);
                dim2ComboBox.setVisible(false);
                break;
            case "Rectangle":
                dim1Label.setText("Width:");
                dim2Label.setText("Height:");
                dim2Label.setVisible(true);
                dim2ComboBox.setVisible(true);
                break;
            case "Cone":
            case "Cylinder":
                dim1Label.setText("Radius:");
                dim2Label.setText("Height:");
                dim2Label.setVisible(true);
                dim2ComboBox.setVisible(true);
                break;
            case "Torus":
                dim1Label.setText("Major Radius:");
                dim2Label.setText("Minor Radius:");
                dim2Label.setVisible(true);
                dim2ComboBox.setVisible(true);
                break;
            default:
                dim1Label.setText("Dim 1:");
                dim2Label.setVisible(false);
                dim2ComboBox.setVisible(false);
                break;
        }
    }

    /*
     * Listener for JList. Calls updateControls() when selection changes.
     */
    private class ShapeListListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
                updateControls();
            }
        }
    }

    /*
     * Listener for the Display Shape button
     * Creates selected shape object and tells display panel to draw it
     */
    private class DisplayButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedShape = shapeList.getSelectedValue();
            if (selectedShape == null) {
                JOptionPane.showMessageDialog(ShapeGUI.this,
                        "Please select a shape.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int dim1 = (Integer) dim1ComboBox.getSelectedItem();
            int dim2 = (Integer) dim2ComboBox.getSelectedItem();

            Shape shapeToDisplay = null;
            
            switch (selectedShape) {
                case "Circle":
                    shapeToDisplay = new Circle(dim1);
                    break;
                case "Square":
                    shapeToDisplay = new Square(dim1);
                    break;
                case "Rectangle":
                    shapeToDisplay = new Rectangle(dim1, dim2);
                    break;
                case "Triangle":
                    shapeToDisplay = new Triangle(dim1);
                    break;
                case "Sphere":
                    shapeToDisplay = new Sphere(dim1);
                    break;
                case "Cube":
                    shapeToDisplay = new Cube(dim1);
                    break;
                case "Cone":
                    shapeToDisplay = new Cone(dim1, dim2);
                    break;
                case "Cylinder":
                    shapeToDisplay = new Cylinder(dim1, dim2);
                    break;
                case "Torus":
                    shapeToDisplay = new Torus(dim1, dim2);
                    break;
            }

            if (shapeToDisplay != null) {
                displayPanel.setShape(shapeToDisplay);
            }
        }
    }

    /**
     * Inner class for custom drawing panel
     */
    private class DisplayPanel extends JPanel {
        private Shape currentShape;

        public DisplayPanel() {
            setBackground(Color.WHITE);
        }

        /**
         * setter
         * @param s object to display
         */
        public void setShape(Shape s) {
            this.currentShape = s;
            repaint(); 
        }

        /**
         * paint component method
         * @param g graphics object
         */
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            if (currentShape != null) {
                
                currentShape.display(g, getWidth() / 2, getHeight() / 2);
                
                String info = currentShape.getName() + " (" + currentShape.getDimensions() + ")";
                g.setColor(Color.BLACK);
                g.setFont(new Font("Arial", Font.BOLD, 16));
                int infoWidth = g.getFontMetrics().stringWidth(info);
                g.drawString(info, (getWidth() - infoWidth) / 2, 30);
            } else {
                String message = "Select a shape and click 'Display Shape'";
                g.setColor(Color.GRAY);
                g.setFont(new Font("Arial", Font.ITALIC, 14));
                int msgWidth = g.getFontMetrics().stringWidth(message);
                g.drawString(message, (getWidth() - msgWidth) / 2, getHeight() / 2);
            }
        }
    }

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ShapeGUI frame = new ShapeGUI();
            frame.setVisible(true);
        });
    }
}
