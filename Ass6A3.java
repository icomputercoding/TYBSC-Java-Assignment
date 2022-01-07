import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="Ass6A3.class" width=400 height=200>

</applet>
*/

@Deprecated(since = "Version 52.0", forRemoval = true)
public class Ass6A3 extends Applet implements MouseMotionListener,MouseListener,KeyListener
{

 String msg="";

 public void init()
 {

  setBackground(Color.cyan);
  addMouseMotionListener(this);
  addMouseListener(this);
  addKeyListener(this);

 }

 public void paint(Graphics g)
 {

  g.drawString(msg,10,10);

 }

 public void mouseDragged(MouseEvent e)
 {

  msg="Mouse Dragged.";
  repaint();
 
 }

 public void mouseMoved(MouseEvent e)
 {

  msg="Mouse Moved.";
  repaint();
 
 }

 public void mouseClicked(MouseEvent e)
 {

  msg="Mouse Button "+e.getButton()+"clicked.";
  repaint();

 }

 public void mousePressed(MouseEvent e)
 {

  msg="Mouse Button "+e.getButton()+"pressed.";
  repaint();
 
 }
 
 public void mouseReleased(MouseEvent e)
 {

  msg="Mouse Button Released.";
  repaint();

 }

 public void mouseEntered(MouseEvent e)
 {

 }

 public void mouseExited(MouseEvent e)
 {
 
 }
 
 public void keyTyped(KeyEvent e)
 {

  msg="Key Typed "+ e.getKeyChar();
  repaint();

 }

 public void keyPressed(KeyEvent e)
 {

  msg="Key pressed "+ e.getKeyChar();
  repaint();

 }

 public void keyReleased(KeyEvent e)
 {

 }

}
