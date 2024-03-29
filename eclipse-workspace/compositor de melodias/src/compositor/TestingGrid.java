package compositor;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

import compositor.TestGrid02.CellPane;

public class TestingGrid extends JPanel {

        public TestingGrid() {
            setLayout(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();
            for (int row = 0; row < 5; row++) {
                for (int col = 0; col < 5; col++) {
                    gbc.gridx = col;
                    gbc.gridy = row;

                    //CellPane cellPane = new CellPane();
                    JPanel cellPane = new JPanel();
                    Border border = null;
                    if (row < 4) {
                        if (col < 4) {
                            border = new MatteBorder(1, 1, 0, 0, Color.GRAY);
                        } else {
                            border = new MatteBorder(1, 1, 0, 1, Color.GRAY);
                        }
                    } else {
                        if (col < 4) {
                            border = new MatteBorder(1, 1, 1, 0, Color.GRAY);
                        } else {
                            border = new MatteBorder(1, 1, 1, 1, Color.GRAY);
                        }
                    }
                    cellPane.setBorder(border);
                    add(cellPane, gbc);
                }
            }
        }
    }

//    public class CellPane extends JPanel {
//
//        private Color defaultBackground;
//
//        public CellPane() {
//            addMouseListener(new MouseAdapter() {
//                @Override
//                public void mouseEntered(MouseEvent e) {
//                    defaultBackground = getBackground();
//                    setBackground(Color.BLUE);
//                }
//
//                @Override
//                public void mouseExited(MouseEvent e) {
//                    setBackground(defaultBackground);
//                }
//            });
//        }
//
//        @Override
//        public Dimension getPreferredSize() {
//            return new Dimension(50, 50);
//        }
//    }
//}


