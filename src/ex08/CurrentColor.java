package ex08;

import java.awt.Color;

public class CurrentColor {
  private int red = 0;
  private int green = 0;
  private int blue = 0;
  private int[] vals = { 0, 64, 128, 192, 255 };
  
  private int nextBright(int b) {
    return (b+1)%vals.length;
  }
  
  public Color changeRed() {
    red = nextBright(red);
    return new Color(vals[red], vals[green], vals[blue]);
  }

  public Color changeGreen() {
    green = nextBright(green);
    return new Color(vals[red], vals[green], vals[blue]);
  }

  public Color changeBlue() {
    blue = nextBright(blue);
    return new Color(vals[red], vals[green], vals[blue]);
  }
}
