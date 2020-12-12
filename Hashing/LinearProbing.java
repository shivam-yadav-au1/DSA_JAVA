
class MyHash{

    int[] arr;
    int cap,size;
    MyHash(int c){
        cap = c;
        size = 0;
        arr = new int[cap];
        for(int i=0;i<cap;i++){
            arr[i] = -1;
        }
    }

    int hash(int key){
        return key % cap;
    }
    void print(){
        for(int i=0;i<cap;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
    }

    boolean insert(int key){
        if(size == cap){
            return false;
        }
        int i = hash(key);
        while (arr[i] != -1 && arr[i] != -2 && arr[i] != key ){
            i = (i + 1) % cap;
        }
        if(arr[i] == key){
            return false;
        }else{
            arr[i] = key;
            size = size + 1;
            return true;
        }

    }

    boolean search(int key){
        int h = hash(key);
        int i = h;
        while(i != -1){
            if(arr[i] == key){
                return true;
            }
            i = (i + 1) % cap;
            if(i == h){
                return false;
            }
        }
        return false;
    }


    boolean delete(int key){
        int h = hash(key);
        int i = h;
        while(arr[i] != -1){
            if(arr[i] == key){
                arr[i] = -2;
                return true;
            }
            i = (i + 1) % cap;
            if(i == h){
                return false;
            }
        }
        return false;
    }
}

class Run {
    public static void main(String args[]){
        MyHash myHash = new MyHash(7);
        myHash.print();
        myHash.insert(23);
        myHash.insert(20);
        myHash.insert(56);
        myHash.insert(44);
        myHash.insert(24);
        myHash.insert(34);
        myHash.insert(56);
        myHash.insert(66);
        myHash.print();
        System.out.println(myHash.search(20));
        System.out.println(myHash.search(100));
        myHash.delete(20);
        myHash.delete(23);
        myHash.print();
    }
}