public class first {
    public static void main(String[] args) {
        class animal {
            void sound() {
                System.out.println("Animal makes a sound");
            }
        }

        class dog extends animal {
            @Override 
            void sound() {
                System.out.println("Dog barks");
            }
        }

       
        dog d = new dog();

    
        d.sound();
    }
}
