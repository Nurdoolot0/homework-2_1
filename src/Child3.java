public class Child3 extends Parent implements Printable {
    private String favoriteSport;

    public Child3(String name, int age, String favoriteSport) {
        super(name, age);
        this.favoriteSport = favoriteSport;
    }

    public String getFavoriteSport() {
        return favoriteSport;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Favorite Sport: " + favoriteSport);
    }
}
