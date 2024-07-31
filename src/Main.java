public class Main {
    public static Parent createObject(String className) {
        switch (className) {
            case "Child1":
                return new Child1("Aktan", 11, "Blue");
            case "Child2":
                return new Child2("Akylai", 12, "Manty");
            case "Child3":
                return new Child3("Bakyt", 13, "Soccer");
            default:
                throw new IllegalArgumentException(" Неизвестное имя класса: " + className);
        }
    }

    public static void main(String[] args) {
        Parent object1 = createObject("Child1");
        Parent object2 = createObject("Child2");
        Parent object3 = createObject("Child3");

        Printable[] printables = { (Printable) object1, (Printable) object2, (Printable) object3 };

        for (Printable printable : printables) {
            printable.print();
        }
    }
}
