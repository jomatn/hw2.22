public class Cloth implements Printable{
    private int size;
    private String name;
    private ColorOfCloth colorOfCloth;

    public Cloth(int size, String name, ColorOfCloth colorOfCloth) {
        this.size = size;
        this.name = name;
        this.colorOfCloth = colorOfCloth;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public ColorOfCloth getColorOfCloth() {
        return colorOfCloth;
    }
    public void print() {
        System.out.println("Size:" + size+
                "\nName: " + name+
                "\nColor: " + getColorOfCloth());
    }

}
