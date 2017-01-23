/*
 * TCSS 360 - Winter 2016
 * Deliverable 0
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author Caleb Smith, John Chang, Mustaf Dahir, Abdullah Islam, Peter Chang
 * @version 22 January 17
 */
public class WeaveGUI extends JPanel {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 6129890651191728134L;


	/**
     * Preferred game frame size.
     */
    private static final Dimension FRAME_SIZE = new Dimension(300, 180);


    /**
     * A frame to build the GUI.
     */
    private final JFrame myFrame = new JFrame("Operation Tangerine");

    /**
     * A panel to add the button.
     */
	private JPanel myPanel;

    /**
     * Constructs a new WeaveGUI, using the files in the current working
     * directory.
     */
    public WeaveGUI() {
       
        super();
        
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setMinimumSize(FRAME_SIZE);  
        myFrame.setVisible(true); 
        myFrame.setResizable(false);
        
        addButton();
       
        myFrame.pack();
        myFrame.setLocationRelativeTo(null);
    }
    
    /**
     * Sets up GUI for constructor.
     */
    private void addButton() {  
    	
    	 final JButton aboutButton = new JButton("About...");
         aboutButton.addActionListener(new ActionListener() {
             
             @Override
             public void actionPerformed(final ActionEvent theEvent) {
                 
                 JOptionPane.showMessageDialog(myPanel, "OPERATION TANGERINE\n" 
                 + "Peter Chu - Aspiring artist.\n" 
                 + "Abdullah Islam - Perfectionist.\n"
                 + "Mustaf Dahir - The Lion King.\n" 
                 + "John Chang - Diva.\n" 
                 + "Caleb Smith - Secret agent."
                 , "We are...", JOptionPane.INFORMATION_MESSAGE);
             }
             
         });
         
         this.add(aboutButton);
         this.setBackground(java.awt.Color.ORANGE);
  
         myFrame.add(this);
    	
    }
 
    
    /**
     * Paints the component appropriate to current state.
     * 
     * @param theGraphic the graphics object for this panel
     */
    @Override
    public void paintComponent(final Graphics theGraphic) {

        super.paintComponent(theGraphic);
        final Graphics2D g2d = (Graphics2D) theGraphic;
      
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
                             RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2d.setColor(Color.RED);
        g2d.setFont(new Font("Serif", 0, 50));
        g2d.drawString("BE-WEAVE!", 10, 80);
        g2d.setFont(new Font("Serif", 0, 20));
        g2d.drawString("Under Construction...", 70, 120);
    }
    
}