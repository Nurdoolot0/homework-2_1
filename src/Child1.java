public class Child1 extends Parent implements Printable {
    private String favoriteColor;

    public Child1(String name, int age, String favoriteColor) {
        super(name, age);
        this.favoriteColor = favoriteColor;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Favorite Color: " + favoriteColor);
    }
}
