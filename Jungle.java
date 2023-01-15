class Animal{
    int height;
    String color;
    
}
class LandAnimal extends Animal{
    int legs;
    boolean horn;
    LandAnimal(int h, String c, int l, boolean x){
        this.height = h;
        this.color = c;
        this.legs = l;
        this.horn = x;
    }
    LandAnimal(){

    }
}
class AquaticAnimal extends Animal{
    int fins;
    boolean Gills;
}

public class Jungle {
    public static void main(String [] args){
        LandAnimal lion = new LandAnimal(45,"Yellow",4,false);
        System.out.println(lion.horn);
    }
}
