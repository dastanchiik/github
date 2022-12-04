public class Main {
    public static void main(String[] args) {
    Parrot parrot = new Parrot("Kesha",2);
    Eagle eagle = new Eagle("Berkut",4);
    Crow crow = new Crow("Kara bash",1);
        System.out.println(parrot);
        parrot.flyable();
        System.out.println(eagle);
        eagle.flyable();
        System.out.println(crow);
        crow.flyable();
    }
}