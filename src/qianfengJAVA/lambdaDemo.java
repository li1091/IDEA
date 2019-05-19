package qianfengJAVA;

/**
 * lambda表达式是在一名内部类的基础上进一步的简化，
 * 但lambda的缺点也很明显，它只能重写什么属性都没没有
 * 只有一个抽象方法的接口。
 */
public class lambdaDemo {
    public static void main(String[] args){
        ieat ieat=new myeat();
        boolean b=ieat.eat("pizza");
        System.out.println(b);

        boolean b1=new ieat() {
            @Override
            public boolean eat(String food) {
                System.out.println(food);
                return "noodle".equals(food)?true:false;
            }
        }.eat("noodle");
        System.out.println(b1);
        //lambda表达式
        qianfengJAVA.ieat ieat1=(food)->{
            System.out.println("lambda= "+food);
            return "potatos".equals(food)?true:false;
        };

        boolean b2= ieat1.eat("potatos");
        System.out.println(b2);
    }
}

interface ieat{
    public boolean eat(String food);
}

class myeat implements ieat{

    @Override
    public boolean eat(String food) {
        System.out.println(food);
        return false;
    }
}
