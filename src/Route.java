import java.awt.*;

public class Route {

    private Node x;
    private Node y;
    private Color colo;
    private int trackInt=10;
    private boolean filled;


    public Route(Node x2, Node y2, Color col){
        x=x2;
        y=y2;
        colo=col;
    }
    public int getDistance(Node x,Node y){
        int xdis= Math.abs(x.getX()-y.getX());
        int ydis=Math.abs(x.getY()-y.getY());
        return (int)(Math.sqrt((xdis*xdis)*(ydis*ydis)));
    }
    public void draw(Graphics2D g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(colo);
        g2.drawLine(x.getX()-15,x.getY()-15,y.getX()-15,y.getY()-15);
        g2.drawLine(x.getX()+15,x.getY()+15,y.getX()+15,y.getY()+15);
        int dis=getDistance(x,y);
        int totalTrack=dis/trackInt;
        for (int i = 0; i < totalTrack; i++) {
            int temp=(dis/totalTrack)*1;
            g2.drawLine(temp+15,temp+15,temp-15,temp-15);
        }
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }


}
