import javax.swing.*;
import java.time.ZonedDateTime;
import java.util.Objects;

public class Person {

    private int age;
    private ZonedDateTime dateOfBirth;
    public String name;
    public float height;
    public boolean isEmployed;
    private Animal pet;


    //If no Constructor is defined by us
    // a default Constructor is added by Java,
    //through inheritance from Object.class
    //But if we add a Constructor, the default
    //Constructor won't exist-and we have to add it.
//    public Person() {
//        super();
//    }

    public Person() {
//        super();
        pet = new Animal("Default name");
    }

//    public Person(int age, String name, float height, boolean isEmployed) {
//        this.age = age;
//        this.name = name;
//        this.height = height;
//        this.isEmployed = isEmployed;
//    }

    public Person(int age, String name){
        this();
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        age = ZonedDateTime.now().getYear() - dateOfBirth.getYear();
        return age;
    }

    public ZonedDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public float getHeight() {
        return height;
    }

    public Animal getPet() {
        return pet;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(ZonedDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public void getJobStatus() {
        if (age < 21) {
            System.out.println("Not old enough for a full time job.");
        } else {
            System.out.println(name + " is working");
        }
    }

    public void isEligibleForDriversLicense() {
        if (age >= 18) {
            System.out.println(name + " is eligible for his/hers full drivers licence");
        } else if (age >= 16) {
            System.out.println(name + " is eligible for his/hers drivers licence");
        } else {
            System.out.println(name + " will ride his.her bike until 16");
        }
    }

    public void ticketPricing() {
        if (age < 7){
            System.out.println(name + " has free tickets.");
    } else if(age<18){
            System.out.println(name + " has a 50% off tickets.");
        } else {
            System.out.println(name + "needs to pay full price");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(dateOfBirth, person.dateOfBirth) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfBirth, name);
    }

    @Override
    public String toString() {
        return "Person{" +  "age=" + age +  ", dateOfBirth=" + dateOfBirth +  ", name='" + name + '\'' +  ", height=" + height +  ", isEmployed=" + isEmployed + (pet != null ? ", has a pet called " + pet.toString() + '}' : '}');

        //if (pet =! null)
//            System.out.println("has a pet called " + pet.toString() + '}');
//        else    System.out.println('}');
    }


}
