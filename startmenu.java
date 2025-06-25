public // File: StartMenu.java
import javax.swing.*;
import java.awt.*;

public class StartMenu {
    public static void showStartWindow() {
        JFrame startFrame = new JFrame("Start Tic Tac Toe");
        startFrame.setSize(500, 400);
        startFrame.setLayout(null);
        startFrame.getContentPane().setBackground(new Color(255, 240, 245));
        startFrame.setLocationRelativeTo(null);
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel titleLabel = new JLabel("Let's Play Tic Tac Toe!", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
        titleLabel.setForeground(new Color(0, 102, 204));
        titleLabel.setBounds(50, 20, 400, 40);
        startFrame.add(titleLabel);

        JLabel p1Label = new JLabel("👤 Player 1 Name:");
        p1Label.setFont(new Font("Arial", Font.BOLD, 16));
        p1Label.setBounds(50, 80, 150, 30);
        startFrame.add(p1Label);

        JTextField p1Field = new JTextField();
        p1Field.setFont(new Font("Arial", Font.PLAIN, 16));
        p1Field.setBounds(220, 80, 200, 30);
        startFrame.add(p1Field);

        JLabel p2Label = new JLabel("👤 Player 2 Name:");
        p2Label.setFont(new Font("Arial", Font.BOLD, 16));
        p2Label.setBounds(50, 130, 150, 30);
        startFrame.add(p2Label);

        JTextField p2Field = new JTextField();
        p2Field.setFont(new Font("Arial", Font.PLAIN, 16));
        p2Field.setBounds(220, 130, 200, 30);
        startFrame.add(p2Field);

        JLabel symbolLabel = new JLabel("🕹️ Player 1 Symbol:");
        symbolLabel.setFont(new Font("Arial", Font.BOLD, 16));
        symbolLabel.setBounds(50, 180, 150, 30);
        startFrame.add(symbolLabel);

        JComboBox<String> symbolChoice = new JComboBox<>(new String[]{"X", "O"});
        symbolChoice.setFont(new Font("Arial", Font.PLAIN, 16));
        symbolChoice.setBounds(220, 180, 80, 30);
        startFrame.add(symbolChoice);

        JButton startBtn = new JButton("Start Game");
        startBtn.setFont(new Font("Arial", Font.BOLD, 18));
        startBtn.setBackground(new Color(144, 238, 144));
        startBtn.setBounds(160, 250, 180, 40);

        startBtn.addActionListener(e -> {
            String name1 = p1Field.getText().trim();
            String name2 = p2Field.getText().trim();
            String symbol = (String) symbolChoice.getSelectedItem();

            if (name1.isEmpty() || name2.isEmpty() || name1.equalsIgnoreCase(name2)) {
                JOptionPane.showMessageDialog(startFrame, "Please enter valid, distinct names!");
                return;
            }

            startFrame.dispose();
            new TicTacToeGUI(name1, name2, symbol.charAt(0));
        });

        p1Field.addActionListener(e -> p2Field.requestFocusInWindow());
        p2Field.addActionListener(e -> symbolChoice.requestFocusInWindow());
        symbolChoice.addActionListener(e -> startBtn.requestFocusInWindow());

        startFrame.getRootPane().setDefaultButton(startBtn);

        startFrame.add(startBtn);
        startFrame.setVisible(true);
    }
}
 {
    
}
