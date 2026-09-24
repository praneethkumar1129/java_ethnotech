public class main {
    static int[] array = {1, 2, 3, 4};
    

    public static void main(String[] args){
        for (int i = 0; i < 4; i++) {
            System.out.println(array[i]);
    
        }
        array[1]=6;
        array[2]=10;
        for (int i = 0; i < 4; i++) {
            System.out.println(array[i]);
    
        }
        int[] array1 = new int[5];
        for (int i = 0; i < 4; i++) {
            System.out.println(array1[i]);
    
        }
    }
}
