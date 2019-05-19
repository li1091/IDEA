package Oop;

/**
 * @Auther: zhaoss
 * @Date: 2019/4/24
 * @Description: Oop
 * @version: 1.0
 */
public class paixv {
    int cont;
    public static void main(String[] args){
        paixv p=new paixv();
        int[] arr={3,4,6,1,8};
        p.sort(arr,0,arr.length-1);



    }
        //{3,4,6,1,8}
    private void sort(int[] arr,int low,int hei){
       if (low>=hei){  //134
           return;
       }
        int i=low;
        int j=hei;
        int key=arr[i];
        //{3,4,6,1,8}
          while (i<j) { //
              while (arr[j] >= key && i<j) {//134
                  j--;  //0
              }
              int t;
              t = arr[j];
              arr[j] = arr[i];
              arr[i] = t;       //134
              while (arr[i] <= key && i<j) {
                  i++;
              }
              t = arr[i];
              arr[i] = arr[j];
              arr[j] = t; //468 3 3

          } //外循环结束


          sort(arr,0,i-1); //0 0
          sort(arr,i+1,hei);// 4 4

    }
}
