package mostramensagem;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author William
 */
public class MostraMensagem extends Applet {
    /**
     *
     * @param g
     */
    @Override
    public void paint(Graphics g){
        g.drawString("I am Java Programmer", 50, 25);
    }
    public static void main(String[] args) {
        
    }
    
}
