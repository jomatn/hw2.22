public class Dress extends Cloth {
    private double koreanSize;

    public Dress(int size, String name, ColorOfCloth colorOfCloth, double koreanSize) {
        super(size, name, colorOfCloth);
        this.koreanSize = koreanSize;
    }

    public double Dress() {
        return koreanSize;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Korean size of dress: " + koreanSize);
    }
}
