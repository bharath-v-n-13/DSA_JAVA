import java.util.Queue;

class StackUsing2Queues{
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    void push(int n){
        q2.add(n);
        while(!q1=isEmpty()){
            q2.add(q1.poll());
        }
        Queue<Integer> temp =q1;
        q1=q2;
        q2=temp;
        } 
        int pop(){
            return q1.poll();
        }
        int peek(){
            return q1.peek();
        }
    boolean isEmpty(){
        return q1.isEmpty();
    }
}
class que{
    public class static main(String args[]{
        StackUsing2Queues():
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(2);
        

    })
}
    

