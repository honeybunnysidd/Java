
public class OOPS {

    public static void main(String args[]) {
        Pen p1 = new Pen(); //Created Pen Object p1
        p1.setColor("red");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

    }
}

class Pen {

    //Properties
    private String color;
    private int tip;

    //Function
    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

}
