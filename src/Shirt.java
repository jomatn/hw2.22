public class Shirt extends Cloth{
    private int internationalSize;
    public Shirt(int size, String name, ColorOfCloth colorOfCloth, int internationalSize) {
        super(size, name, colorOfCloth);
        this.internationalSize = internationalSize;
    }
    public int Shirt() {
        return internationalSize;
    }

    public void print() {
        super.print();
        System.out.println("international size of Shirt: " + internationalSize);
    }
}
