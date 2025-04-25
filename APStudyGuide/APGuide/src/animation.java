import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class animation {
	JButton name;
	public static void animateButton(JButton name) {
		name.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                name.setBounds(name.getX(), name.getY() - 5, name.getWidth(), name.getHeight());
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	name.setBounds(name.getX(), name.getY() + 5, name.getWidth(), name.getHeight());
            }
        });
	}
}
