package ex08;

import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DiskPanel extends JPanel {
  private int radius = 100;

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
    repaint();                                   // イベントキューに登録
  }
  
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);                     // 背景を描画してもらう
    int x = getWidth()/2-radius;                 // 円盤の左上隅のx座標
    int y = getHeight()/2-radius;                // 円盤の左上隅のy座標
    g.fillOval(x, y, radius*2, radius*2);
  }
}
