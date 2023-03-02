public class Cat extends Cats {
    @Override
    public void Food() {
        String food="Рыбу";
        System.out.println("Котик кушает "+food);
    }
    @Override
    public void Species() {
        String Specie="Бирманская";
        System.out.println(Specie+" кошка");
    }
}
