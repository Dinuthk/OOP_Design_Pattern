public class Main {
    public static void main(String[] args) {

        Mammal first = MammalFactory.getMammal("");
        if(first != null){
            first.drinkMilk();
        }
        else {
            System.out.println(first);
        }

        Mammal second = MammalFactory.getMammal("Zeebra");
        second.drinkMilk();

    }
}