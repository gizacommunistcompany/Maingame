package com.zetcode

import javax.swing.JPanel;

public class Board extends JPanel {

   public Application() {

        initUI();
    }

    private void initUI() {

        add(new Board());
HI JACOB
        setSize(250, 200);

        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            Application ex = new Application();
            ex.setVisible(true);
        });
    }
}
}

