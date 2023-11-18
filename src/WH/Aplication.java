package WH;

public class Aplication {
    public static void main(String[] args){
        Cat jon = new Cat();
        jon.setNickname("Джони");
        jon.setInitials("J");
        Cat noname = new Cat();
        jon.spit();
        jon.eat();
        jon.walk();
        System.out.println(jon);
//        public void grow(){
//            System.out.println("коту по кличке " + nickname + " уже " + (age = age + 1) + " лет");
//        }
        noname.grow();
        noname.grow();
        noname.grow();
        System.out.println(noname);
    }
}
