package qianfengJAVA.Coliction.treemap;

import java.util.TreeMap;

public class MytreeMap {
    //左旋
    private Entry root;
    private void roundleft(Entry e){
        Entry r=e.right;
        e.right=r.left;
        if (r.left !=null){
            r.left.parent=e;
            r.parent=e.parent;
        }
        if (e.parent==null){
            root=r;
        }else if (e.parent.left==e){
            e.parent.left=r;
        }
        //左旋完成
        e.parent=r;
        r.left=e;
    }
    //左旋换成比我大的数，右旋换成比我小的数
    private void roundright(Entry e){
        Entry r=e.left;
        e.left=r.right;
        if (e.left !=null){
            e.left.parent=e;
            r.parent=e.parent;
        }
        if (e.parent ==null){
            root=r;
        }else if (e.parent.right==e){
            e.parent.right=r;
        }
        e.parent=r;
        r.right=e;

    }

    class Entry {
        Entry left;
        Entry right;
        Entry parent;
        boolean color=true;
    }
}
