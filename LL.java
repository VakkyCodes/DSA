public class LL{
    class  node{
        node next;
        String data;
        static int Size=0;
        public node(String data){
            this.data=data;
            this.next=next;
           Size++;
        }
    }
    public node head;
    public void addFirst(String data){
        node newnode=new node(data);
        newnode.next=head;
        head=newnode;
    }
    public void print(){
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void addLast(String data){
         node newnode=new node(data);
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;}

        public void deleteFirst(){
            head=head.next;
        }
         public void deleteLast(){
            node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
        public void findMiddle(){
        
            node slow=head;
            node fast=head;
            while(fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            System.out.println("this is middle element  "+slow.data);
        }
      public void  loop(){
        node slow=head;
            node fast=head;
            while(fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            if(fast.data==slow.data){
                System.out.println("loop exist");
            }
           else{
            System.out.println("lol loop doesnt exist");
           }
      }
        public static void main(String[] args) {
     LL list=new LL();
     list.addFirst("world");   
     list.addFirst("Hi");
     list.addFirst("middle");
     list.addFirst("Hilw");
     list.addFirst("Hbgbgbghi");
     System.out.println(node.Size);
     list.print();
     list.findMiddle();
     list.loop();
    
     
    }
}