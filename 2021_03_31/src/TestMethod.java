public class TestMethod {
    //Q：如何解决参数不固定的方法
    //方法1：传入数组
    public int sumArray(int[] arr){

        int sum = 0;
        for (int i = 0; i<arr.length ;i++){
            sum += arr[i];
        }
        return sum;
    }

    //方法2：动态参数列表
    //多个数相加，参数类型相同但数目不固定
    //底层的实现其实还是数组
    //x既可以传入单个数，也可以是多个数，也可以是数组，也可以啥都不传
    // "数据类型 ... 变量名"在一个方法中只能有一个，且必须放在参数列表的最后
    // eg. public int sumDynamic(double y,int ... x)
    public int sumDynamic(int ... x){
        int sum = 0;
        for (int i = 0; i< x.length; i++){ //x本质上还是数组
            sum+=x[i];
        }
        return sum;
    }


    

    public static void main(String[] args) {
        TestMethod tm = new TestMethod();
        int[] arr = {1,2,3,4,5};
        System.out.println(tm.sumArray(arr));

        System.out.println(tm.sumDynamic(1));
        System.out.println(tm.sumDynamic(1,2,3,4,5));
        System.out.println(tm.sumDynamic(arr));
        System.out.println(tm.sumDynamic());

    }
}
