import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class Ex8 {

  private JFrame frame;
  private DiskPanel colorPanel;
  private CurrentColor crrntBckColor = new CurrentColor();
  private CurrentColor crrntForColor = new CurrentColor();

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ex8 window = new Ex8();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public Ex8() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel btnPanel = new JPanel();
    frame.getContentPane().add(btnPanel, BorderLayout.NORTH);
    
    JButton btnRed = new JButton("Red");
    btnRed.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntBckColor.changeRed();
        colorPanel.setBackground(c);
      }
    });
    btnPanel.add(btnRed);
    
    JButton btnGreen = new JButton("Green");
    btnGreen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntBckColor.changeGreen();
        colorPanel.setBackground(c);
      }
    });
    btnPanel.add(btnGreen);
    
    JButton btnBlue = new JButton("Blue");
    btnBlue.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntBckColor.changeBlue();
        colorPanel.setBackground(c);
      }
    });
    btnPanel.add(btnBlue);
    
    colorPanel = new DiskPanel();
    colorPanel.setBackground(Color.BLACK);
    frame.getContentPane().add(colorPanel, BorderLayout.CENTER);
    
    JPanel btmPanel = new JPanel();
    frame.getContentPane().add(btmPanel, BorderLayout.SOUTH);
    btmPanel.setLayout(new GridLayout(2, 1, 0, 0));
    
    JPanel fBtnPanel = new JPanel();
    btmPanel.add(fBtnPanel);
    
    JButton btnFRed = new JButton("fRed");
    btnFRed.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntForColor.changeRed();
        colorPanel.setForeground(c);
      }
    });
    fBtnPanel.add(btnFRed);
    
    JButton btnFGreen = new JButton("fGreen");
    btnFGreen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntForColor.changeGreen();
        colorPanel.setForeground(c);
      }
    });
    fBtnPanel.add(btnFGreen);
    
    JButton btnFBlue = new JButton("fBlue");
    btnFBlue.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntForColor.changeBlue();
        colorPanel.setForeground(c);
      }
    });
    fBtnPanel.add(btnFBlue);
    
    JPanel szPanel = new JPanel();
    btmPanel.add(szPanel);
    
    JButton btnLarge = new JButton("Large");
    btnLarge.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        colorPanel.setRadius(150);
      }
    });
    szPanel.add(btnLarge);
    
    JButton btnMedium = new JButton("Medium");
    btnMedium.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        colorPanel.setRadius(100);
      }
    });
    szPanel.add(btnMedium);
    
    JButton btnSmall = new JButton("Small");
    btnSmall.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        colorPanel.setRadius(50);
      }
    });
    szPanel.add(btnSmall);
  }

}
