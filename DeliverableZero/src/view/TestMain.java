/*
 * TCSS 360 - Winter 2017
 * Deliverable 0
 */
package view;

import java.awt.EventQueue;

/**
 * @author Caleb Smith, John Chang, Mustaf Dahir, Abdullah Islam, Peter Chang
 * @version 22 January 17
 */
public final class TestMain {
    
    /**
     * Private constructor to prevent construction of instances.
     */
    private TestMain() {
        // do nothing
    }

    /**
     * Constructs the main GUI window frame.
     * 
     * @param theArgs Command line arguments (ignored).
     */
    public static void main(final String... theArgs) {
        EventQueue.invokeLater(new Runnable() {
           
            @Override
            public void run() {
                new TestGUI();     
            }
        });
    }
}