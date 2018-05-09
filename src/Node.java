/**
 * Created by michael_hopps on 5/7/18.
 */
public class Node {

    private int x , y; //relative to top left of the map jpg
    private String label; //the text description of this Node

    public Node(int x, int y, String label) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getLabel() {
        return label;
    }
}
