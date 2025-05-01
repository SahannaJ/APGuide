/*
 * This class makes animations.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class animation {
	JButton name;
	// When the mouse hovers over the button, it will pop up
	public static void animateButton(JButton name) {
		name.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                name.setBounds(name.getX(), name.getY() - 2, name.getWidth(), name.getHeight());
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	name.setBounds(name.getX(), name.getY() + 2, name.getWidth(), name.getHeight());
            }
        });
	}
}
