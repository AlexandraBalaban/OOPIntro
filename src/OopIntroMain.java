import java.time.ZonedDateTime;

public class OopIntroMain {
    public static void main(String[] args){

//        System.out.println("Starting the investigation...");
//        Person p1 = new Person(30,"Bogdan",1.6f, true);
//        int x = p1.getAge();
//        System.out.println(p1.name);
//        System.out.println("Investigation is still running");
//        Person p2 = new Person(24, "Andreea", 1.5f, true);
//        int y = p2.getAge();

//        System.out.println("Investigation is done!");
//        System.out.println(x);
//        System.out.println(y);

        //getters//setters/Inheritance
//          Animal myPet = new Cat();
//          myPet.setHungry(true);
//          myPet.feed();

        //Cat cat = new Cat();

//          Animal sistersPet = new Dog();
//          sistersPet.setHungry(true);
//          sistersPet.feed();
//          Animal dadsPet = new Rabbit();
//          dadsPet.setHungry(true);
//          dadsPet.feed();

        //composition
          Person p = new Person();
          Animal cat = new Cat("Garfield");

          System.out.println(p);

          p.setPet(cat);
          p.setName("Dan");
          p.setDateOfBirth(ZonedDateTime.now());
          System.out.println(p);

          p = new Person();
          System.out.println(p + "and a owner-less cat: " + cat);

          Person p4 = new Person();
          p4.setName("Adrian");
          p4.setDateOfBirth(ZonedDateTime.now());
          System.out.println(p4);
          p4.setPet(new Dog("Dog"));
          System.out.println(p4);

          p4 = new Person();
        //access to previous instance is lost forever.
          System.out.println(p4);

        Person student1 = new Student();
        System.out.println(student1);
        student1.setName("Florin");
        student1.getJobStatus();
        System.out.println(student1);
        student1.isEligibleForDriversLicense();
        student1.ticketPricing();
        System.out.println(student1);

        Student student2 = new Student("BV1256224646415456");
        student2.setName("Mihai");
        student2.getPet().setName("Rex");

        System.out.println(student2);


    }
}
