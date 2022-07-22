public class Student extends Person{

    private String idStudent;
    private boolean integral;

    public Student(){
        //age = 18
        //name = "not set"
        super(18, "not set");
        idStudent = "no studentID assigned.";
        integral = true;
    }

    public Student(String idStudent) {
//        super();
        this();
        this.idStudent = idStudent;
    }

    public Student(boolean integral) {
        this.integral = integral;
    }

    @Override
    public void getJobStatus() {
        System.out.println(super.getName() + " is a student. His/her main job is studying");
    }

    @Override
    public void isEligibleForDriversLicense() {
        System.out.println(super.getName() + " is a eligible for a drivers licence");
    }

    @Override
    public void ticketPricing() {
        System.out.println(super.getName() + " is a student, tickets are free.");
    }

    //setters
    public void setIdStudent(String id){
        //if methods arguments name is different from the
        //class attribute "this" can be omitted
        idStudent = id;
    }

    public void setIntegral(boolean integral){
        this.integral = integral;
    }


    //getters

    public String getIdStudent(){
        return idStudent;
    }

    public boolean isIntegral(){
        return integral;
    }



}
