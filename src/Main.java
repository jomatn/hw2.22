public class Main {

    public static Printable createObject(String className) {
        switch (className) {
            case "2":
                return new Jeans(42,"new breath", ColorOfCloth.BLUE,"silk");
            case "3":
                return new Dress(44, "pie", ColorOfCloth.RED, 28.2);
            case "4":
                return new Shirt(42,"Hope", ColorOfCloth.YELLOW, 33);
            default:
                throw new IllegalArgumentException("Invalid class name");
        }
    }
    public static void main(String[] args) {
        Printable obj2 = createObject("2");
        Printable obj3 = createObject("3");
        Printable obj4 = createObject("4");
        Printable[] objects = {obj2, obj3, obj4};


        for (Printable obj : objects) {
            obj.print();
            System.out.println();
        }
    }
}