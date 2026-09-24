public class student{
    String name;
    int age;
    int energy;
    String mood;
    float attendance;

    public student(String name,String mood,int age,int energy,float attendance){
        this.name=name;
        this.age=age;
        this.energy=energy;
        this.mood=mood;
        this.attendance=attendance;
    }

    public void skipClass(){
        if(energy<2){
            System.out.println("I am skipping class");
        }else{
            System.out.println("I am attending class");
        }
    }

    public void sleep(){
        if(mood.equals("bored")){
            System.out.println("I am feeling sleepy");
        }else{
            System.out.println("I am not feeling sleepy");
        }
    }

    public void study(){
        if(mood.equals("ambitious")){
            System.out.println("I am going to study to achieve my ambition");
        }
    }

    public void takeTest(){
        if(attendance > 85.00){
            System.out.println("I am taking test");
        }
    }

    public void eat(){
        energy=energy+5;
        System.out.println("I ate food and my energy is now " + energy);
    }

    public static void main(String[] args){
        superstudent s2 = new superstudent("Aarav", "ambitious", 18, 10, 90.0f, "Super Speed", "Coding and Chess");
        s2.sleep();
        s2.study();
        s2.takeTest();
        s2.skipClass();
        s2.codeAllNight();
        s2.debugForFiveHrs();
        s2.eat();
    }
}

class superstudent extends student{
    String superpower;
    String hobbies;

    public superstudent(String name,String mood,int age,int energy,float attendance,String superpower,String hobbies){
        super(name,mood,age,energy,attendance);
        this.superpower=superpower;
        this.hobbies=hobbies;
    }

    public void codeAllNight(){
        energy=energy-4;
        System.out.println("I am coding all night. Remaining energy " + energy);
    }

    public void debugForFiveHrs(){
        energy=energy-3;
        System.out.println("I debugged for five hours. Remaining energy " + energy);
    }
}
