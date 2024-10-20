public class Main extends Object {

    public static void main(String[] args) {
        Student max = new Student("max", 21);
        System.out.println(max.toString());
        // Student@5acf9800 : className@Hashcode
        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("jimmy", 8, "Carole");
        System.out.println(jimmy.toString());
    }
}

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // we are overriding tostring method in java.lang.object class
    @Override
    public String toString() {
        // return super.toString(); //this is redunant way of calling super.tostring
        // return "Strudent{" +
        // "name='" + name + '\'' +
        // ", age=" + age +
        // '}';
        return name + " is " + age;
    }
}

class PrimarySchoolStudent extends Student {
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid " + super.toString();
    }
}