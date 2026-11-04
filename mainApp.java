public class mainApp {
    public static void main(String[] args){
    
    Student student1 = new Student();
    student1.name = "Ahmed";
    student1.id = 2026001;
    student1.major = "Computer Engineering";
    student1.email = "ahmed@gmail.com";
   
    Student student2 = new Student();
    student2.name = "Sara";
    student2.id = 2026002;
    student2.major = "Cybersecurity";
    student2.email = "sara@gmail.com";
    
    Student student3 = new Student();
    student3.name = "Selma";
    student3.id = 2026002;
    student3.major = "Computer science";
    student3.email = "nettariselma@gmail.com";

    student1.displayInfo();
    student2.displayInfo();
    student3.displayInfo();
    }
    
}           