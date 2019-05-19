package qianfengJAVA;

public class binarytree {
    private node root;

    public void add(int date){
        if (root==null){
            root=new node(date);
        }else {
            root.addnode(date);
        }
    }

    public void print(){
        root.printnode();
    }

    private class node{
        private int date;
        private node left;
        private node right;

        public node(int date) {
            this.date = date;
        }

        public void addnode(int d){
            if (date>d){
                if (this.left==null){
                    this.left=new node(d);
                }else {
                    this.left.addnode(d);
                }

            }else {
                if (this.right==null){
                    this.right=new node(d);
                }else {
                    this.right.addnode(d);
                }
            }
        }

        public void printnode(){
            if (this.left !=null){
                this.left.printnode();
            }
            System.out.print(this.date+"->");
            if (this.right !=null){
                this.right.printnode();
            }
        }
    }
}
