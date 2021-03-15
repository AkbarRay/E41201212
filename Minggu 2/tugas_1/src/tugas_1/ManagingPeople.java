package tugas_1;

public class ManagingPeople {
    
    public static void main(String[] args) {
    
        person p1 = new person("Rama", 20);
    
        person p2 = new person("Firdaus", 22);



        if(p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }
        
    }
}