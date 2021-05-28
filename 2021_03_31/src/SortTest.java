import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class SortTest {
    //引用传递:即直接传递参数地址
    //定义一个排序方法
    public void sort(int[] arr){ //因为参数是地址，所以可以直接用void
        for (int i = 0 ; i<arr.length; i++){
            for (int j = 0 ; j<arr.length-1-i ;j++){
                if (arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0 ; i<arr.length ;i++){
            arr[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        new SortTest().sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
