import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel {
  private Image johnturner;

  public Board() {
    initBoard();
  }

  private void initBoard() {
    loadImage();

    int w = johnturner.getWidth(this);
    int h = johnturner.getHeight(this);
    setPreferredSize(new Dimension(w, h));
  }

  private void loadImage() {
    ImageIcon ii = new ImageIcon("../src/resources/IMG_2223 - blue-grey.jpeg");
    johnturner = ii.getImage();
  }

  @Override
  public void paintComponent(Graphics g) {
    g.drawImage(johnturner, 0, 0, null);
  }
}
