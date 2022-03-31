package firststate.day05;

public class ArrayDemo {
    public static void main(String[] args) {
//        3)数组的访问
        int[] arr= new int[3];
        arr[0]=100;
        arr[1]=200;
        arr[2]=300;
        System.out.println(arr.length);
        System.out.println(arr[arr.length-1]);//数组中最后一个元素

//        arr[3]=400;
//        ArrayIndexOutOfBoundsException ----->数组下标越界异常


        int[] arr1= new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=(int)(Math.random()*100);//0---99的随机数
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr["+i+"]="+arr1[i]);
        }























        /*int[] arr1 =new int[3];
        int[] arr2={2,5,8};
        int[] arr3 =new int[]{2,5,8};
        System.out.println(arr2.length);
        int[] arr4;
//        arr4={2,5,8}; //编译错误，此方式只能声明同时初始化
        arr4=new int[]{2,5,8};

        int[] arr5=new int[33];
        int[] arr6={1,3,5};
        int[] arr7=new int[]{1,3,45};
        int[] arr8 ;
        arr8=new int[]{1,4,5,6,7};
*/

    }
}
