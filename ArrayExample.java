public class ArrayExample {
    public static void main(String[] args) {

        int[] numbers = new int[3];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        int[] arr = {5,2,9,1,7};

int max = arr[0];

for(int i = 1; i < arr.length; i++){
    if(arr[i] > max){
        max = arr[i];
    }
}

System.out.println(max);
    }
}