public class Parrot extends Animal implements Flyable {

  private int age;

    public Parrot(String name, int age) {
        super(name);
        this.age = age;
    }

    public Parrot(String name) {
        super(name);
    }


    @Override
    public void flyable() {
        System.out.println("Flying next to wood");
    }

    @Override
    public String toString() {
        return "Parrot: " +super.toString()+
                "age=" + age ;
    }
}
