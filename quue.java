public class quue{
    static class  node{
        node next;
        int data;
        public node(int data){
            this.data=data;
            this.next=next;
        }}
        static class Queue{
        static node head=null;
        static node tails=null;
        public void add(int data)
        {
            node newnode=new node(data);
            if(head==null&& tails==null){
               tails=head=null;
            }
        
            tails.next=newnode;
            tails=newnode;

            
        }
         
        }
    public static void main(String[] args) {
        
    }

}