public class Queue {
   public static  class queue{
        int size;
        static int arr[];
        int rear=-1;
        public queue(int size){
            arr=new int [size];
            this.size=size;
        }
        public boolean isempty(){
            return rear==-1;
        }
        public void add(int data){
            if(rear==size-1){
                System.out.println("this is full stupid");
                return ;
            } 
            rear++;
             arr[rear]=data;
        }  
    public int  remove(){
        if(isempty()){
            System.out.println("this is empty");
            return -1;
        }
        int front=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return front;

    }  }
    public static void main(String[] args) {
        queue q=new queue(3);
        q.add(112);
           q.add(20);
              q.add(3);
               
        for(int i=0;i<=q.rear;i++){
            System.out.print(q.arr[i]+" ");
        }
        q.remove();
        System.out.println(" ");
                for(int i=0;i<=q.rear;i++){
            System.out.print(q.arr[i]+" ");
        }
    }

}
