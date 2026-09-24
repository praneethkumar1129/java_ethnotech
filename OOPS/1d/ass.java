public class ass {
    public static void main(String[] args){
        int [] array = {1,2,3,4,5};
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];//running sum
        }
        System.out.println("Sum:"+sum);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Max:"+max);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Min:"+min);
        for(int i=array.length-1;i>=0;i--){
            System.out.println(array[i] + "");

        }
        int even = 0;
        int odd = 0;
        for(int i =0;i<array.length;i++){
            if(array[i]% 2 ==0){
                even+=1;
            }
            else{
                odd+=1;
            }
        }
        System.out.println("Even:"+even);
        System.out.println("ODD:"+odd);
    }

}
