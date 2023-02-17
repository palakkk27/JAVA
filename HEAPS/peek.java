import java.util.ArrayList;

public class peek {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            int x = arr.size()-1;
            int par = (x-1)/2;

            while(arr.get(x)<arr.get(par)){
                //swap
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
            }
        }

        public int peek(){
            return arr.get(0);
        }

    }
}
