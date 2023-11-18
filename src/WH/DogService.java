package WH;

import javax.print.DocFlavor;

public class DogService {
    public static void main(String[] args){
        Dog pluto = new Dog();
        pluto.setNickname("Pluto");
        pluto.setAge(5);
        pluto.setColor("Red");
        System.out.println(pluto);

    }
}
