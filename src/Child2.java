public class Child2 extends Parent implements Printable {
    private String favoriteFood;

    public Child2(String name, int age, String favoriteFood) {
        super(name, age);
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Favorite Food: " + favoriteFood);
    }
}
