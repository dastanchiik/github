public class Main {
    public static void main(String[] args) {
        Curse curse = new Curse();
        curse.setName("IT.KG");
        curse.setNumber(43);
        curse.setNameTeacher("Azamat Muratov");
        curse.setStartDay("10 October");
        System.out.println(curse.getName()+"\n"+curse.getNumber()+"\n"+curse.getNameTeacher()+"\n"+curse.getStartDay());
        Student student = new Student();
        student.setName("Sanjar ");
        student.setLastName("Kaliev");
        student.setAge(17);
        student.setBirthday(1);
        System.out.println(student.getName()+"\n"+student.getLastName()+"\n"+student.getBirthday()+"\n"+student.getAge());
    }
}