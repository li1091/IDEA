package Thread.homework;

public class print {
    private int cont=1;
   public synchronized void num(int i){
        if (cont%2==0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("[");
        System.out.print(i);
        System.out.print(",");
        System.out.print(i+1);
        System.out.print("]");
        cont++;
        this.notify();
   }

   public synchronized void En(char ch){
        if (cont%2 !=0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(ch);
        cont++;
        this.notify();
   }
}
