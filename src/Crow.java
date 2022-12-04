public class Crow extends Animal implements Flyable{
    private int age;


    public Crow(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Crow(String name) {
        super(name);
    }

    @Override
    public void flyable() {
        System.out.println("Flying under snow");
    }

    @Override
    public String toString() {
        return "Crow: " +super.toString()+
                "age=" + age ;
    }
}
