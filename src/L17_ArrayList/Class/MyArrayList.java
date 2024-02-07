package L17_ArrayList.Class;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(5);
        System.out.println(al.getSize());
        System.out.println(al.getCapacity());
        al.print();
        for(int i = 0; i<=10; i++){
            al.add(i, i-2);
            System.out.println(al.getSize());
            System.out.println(al.getCapacity());
            al.print();
        }
        System.out.println(al.getFirst());
        System.out.println(al.get(4));
        System.out.println(al.getLast());
        al.print();
        System.out.println(al.removeFirst());
        al.print();
        System.out.println(al.removeLast());
        al.print();
        System.out.println(al.remove(3));
        al.print();

        ArrayList al1 = new ArrayList();
        System.out.println(al1.getSize());
        System.out.println(al1.getCapacity());
        al1.print();

        ArrayList al2 = new ArrayList(new int[]{1,2,3,4,5});
        System.out.println(al2.getSize());
        System.out.println(al2.getCapacity());
        al2.print();
        al2.add(10,3);
        al2.addFirst(100);
        al2.addLast(1000);
        al2.print();
        System.out.println(al2.remove(2));
        al2.print();
    }
}

class ArrayList{
    private int size;
    private int capacity;
    private int[] arr;

    ArrayList(){
        this.size = 0;
        this.capacity = 10;
        arr = new int[this.capacity];
    }

    ArrayList(int capacity){
        this.size = 0;
        this.capacity = capacity;
        arr = new int[this.capacity];
    }

    ArrayList(int[] arr){
       this.size = this.capacity = arr.length;
       this.arr = arr;
    }

    int getSize(){
        return this.size;
    }

    int getCapacity(){
        return this.capacity;
    }

    void addInternal(int val, int idx){
        if(idx > this.size || idx < 0){
            System.out.println("Index is out of bound. No addition possible");
            return;
        }
        if(size == capacity){
            int[] newArr = new int[2*this.capacity];
            if(idx == this.size){
                System.arraycopy(this.arr, 0, newArr, 0, this.size);
            }
            else{
                System.arraycopy(this.arr, 0, newArr, 0, idx);
                System.arraycopy(this.arr, idx, newArr, idx+1, this.size-idx);
            }
            this.arr = newArr;
            this.arr[idx] = val;
            this.capacity = 2*this.capacity;
        }
        else{
            if(idx != this.size){
                System.arraycopy(this.arr, idx, this.arr, idx+1, this.size-idx);
            }
            this.arr[idx] = val;
        }
        this.size++;
    }

    void add(int val){
       this.addInternal(val, this.size);
    }

    void add(int val, int index){
        this.addInternal(val, index);
    }

    void addLast(int val){
        this.add(val);
    }

    void addFirst(int val){
        this.add(val, 0);
    }

    int get(int index){
        if(index<0 || index>=this.size){
            System.out.println("Index is out of bound. No get possible");
            return -1;
        }
        return this.arr[index];
    }

    int getFirst(){
        return this.get(0);
    }

    int getLast(){
        return this.get(this.size-1);
    }

    int remove(int index){
        if(index<0 || index>=this.size){
            System.out.println("Index is out of bound. No get possible");
            return -1;
        }
        int temp = this.arr[index];
        this.size--;
        if(index != this.size){
            System.arraycopy(this.arr, index+1, this.arr, index, this.size-index);
        }
        return temp;
    }

    int removeFirst(){
        return remove(0);
    }

    int removeLast(){
        return remove(this.size-1);
    }

    void print(){
        System.out.print("[ ");
        for(int i = 0; i<this.size; i++){
            System.out.print(this.arr[i]+" ");
        }
        System.out.println("]");
    }
}
