public class Student {

    String firstName;
    String lastName;
    int age;
    Faculty Faculty;
    Lang Lang;


    public Student(String firstName, String lastName, int age, Faculty Faculty, Lang Lang) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.Faculty = Faculty;
       this.Lang = Lang;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Faculty getFaculty() {
        return Faculty;
    }

    public Lang getLang() {
        return Lang;
    }
        @Override
     public String toString() {
        return firstName + " " + lastName + " is " + age + " years old and studying at " + Faculty.getNameEN() + " faculty.";
    }



}
