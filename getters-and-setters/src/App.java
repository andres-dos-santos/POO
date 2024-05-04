import classes.People;

public class App {
    public static void main(String[] args) throws Exception {
        People people = new People();

        people.changeName("João o pé de feijão");
        people.changeAge(29);
        people.changeHeight(1.76);
        
        System.out.println(people.getName());
        System.out.println(people.getAge());
        System.out.println(people.getHeight());
    }
}
