public class MammalFactory {
    public static Mammal getMammal(String MammalType){
        if (MammalType==null){
            return null;
        }
        else if(MammalType.equals("Human")){
            return new Human();
        } else if (MammalType.equals("Zeebra")) {
            return new Zeebra();
        }
        return null;
    }
}
