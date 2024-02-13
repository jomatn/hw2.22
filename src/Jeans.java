public class Jeans extends Cloth {
    private String typeOfMaterial;
    public Jeans(int size, String name, ColorOfCloth colorOfCloth, String typeOfMaterial) {
        super(size, name, colorOfCloth);
        this.typeOfMaterial = typeOfMaterial;
    }
    public String Jeans() {
        return typeOfMaterial;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("The type of material of the jeans: " + typeOfMaterial);
    }
}
