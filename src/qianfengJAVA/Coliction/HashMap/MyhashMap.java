package qianfengJAVA.Coliction.HashMap;

//两对象值相同，哈希码必定也相同
public class MyhashMap {
    Entry[] table;
    int size;
    final double yinzi=0.75;
    int threshold;
    public MyhashMap(){
       table=new Entry[16];
       //计算出数组的最大承重
       threshold=(int) (table.length*yinzi);
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder("[");
        for(int i=0;i< table.length;i++){
            if (table[i] !=null){
                Entry temp=table[i];
                while (temp !=null){
                    builder.append(temp.value+",");
                    temp=temp.next;
                }
            }
        }
        builder.setCharAt(builder.length()-1,']');
        return builder.toString();
    }

    public void put(Object key, Object value){
        int hash=key.hashCode();
        int i=hash&(table.length-1);
        for (Entry e=table[i];e !=null;e=e.next){
            if (e.equals(key) || e.key.hashCode()==key.hashCode()){

                e.value=value;
                return;
            }

        }

        addEntry(hash,key,value,i);
    }

    public boolean remove(Object key){
        int hash=key.hashCode();
        int i=hash&(table.length-1);
        Entry temp=table[i];
        //如果要删除的正好是第一个节点
        if (temp.key.equals(key)){
            table[i]=temp.next;
            temp.next=null;
            temp.key=null;
            temp.value=null;
            temp.hash=0;
            temp=null;
            size--;
            return true;
        }
        //如果不是第一个节点，那就遍历整个链表找到那个节点
        while (temp !=null){
            if (temp.next.key.equals(key)){
                temp.next=temp.next.next;
                temp.next.key=null;
                temp.next.value=null;
                temp.next=null;
                size--;
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public Object getnode(Object key){
        int hash=key.hashCode();
        int i=hash&(table.length-1);

        Entry temp=table[i];

        while (temp !=null){
            if (temp.key.equals(key) || temp.hash==key.hashCode()){
                return "["+temp.key+","+temp.value+"]";
            }
            temp=temp.next;
        }
        return null;
    }

    private void addEntry(int hash,Object key,Object value,int index){
        if (size >=threshold){
            Entry[] nowarr=new Entry[threshold*2];
            System.arraycopy(table,0,nowarr,0,size);
        }
        creatEntry(hash,key,value,index);
    }

    private void creatEntry(int hash,Object key,Object value,int index){
        Entry e=table[index];
        table[index]=new Entry(hash,key,value,e);
        size++;
    }

    class Entry {
        int hash;
        Object key;
        Object value;
        Entry next;

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }

        public void setHash(int hash) {
            this.hash = hash;
        }

        public Entry(int hash, Object key, Object value, Entry next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public void setKey(Object key) {
            this.key = key;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public void setNext(Entry next) {
            this.next = next;
        }

        public int getHash() {
            return hash;
        }

        public Object getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }

        public Entry getNext() {
            return next;
        }
    }

    public static void main(String[] args){


    }
}
