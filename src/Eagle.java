public class Eagle extends Animal implements Flyable{
    private int age;

    public Eagle(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Eagle(String name) {
        super(name);
    }

    @Override
    public void flyable() {
        System.out.println("Flying on heaven");
    }

    @Override
    public String toString() {
        return "Eagle: " +super.toString()+
                "age=" + age ;
    }
}
