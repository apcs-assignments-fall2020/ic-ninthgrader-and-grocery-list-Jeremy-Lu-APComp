public class NinthGrader extends Student {
    public NinthGrader(String a, String b) {
        super(a, b, 2024);
    }

    // A default/no-argument constructor
    public NinthGrader() {
        super("Bob", "Dylan", 2024);
    }
    public void doSomething(){
        System.out.println("I am preparing for a Harkness discussion!");
    }
    public String toString(){
        String str = this.getFirstName() + " " + this.getLastName() + " " + this.getClassYear() + " (Ninth Grader)";
        return str;
    }
}