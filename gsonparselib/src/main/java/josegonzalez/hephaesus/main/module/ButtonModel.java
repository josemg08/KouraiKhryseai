package josegonzalez.hephaesus.main.module;

import josegonzalez.hephaesus.main.JsonModel;

/**.___
 * Created by Jose Gonzalez
 __.*/
public class ButtonModel extends JsonModel{

    private int positionX;
    private int positionY;
    private int width;
    private int height;
    private String background;

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

}
//.___ End of ButtonModel __./