
/*GROUP MEMBERS:  
AGAHOZO MARIE CLAIRE:221004758
ISHIMWE KEVIN:221023342
MUTUYIMANA PASCALINE:221018019
IHIRWE SHINGIRO ARTHUR:

*/








package linked;
import java.util.List;
import java.util.LinkedList;
public class MyLinkedList {
    class node
    {
        int data;
        node next;
        public node(){
            next=null;
        }
        public node(int a)
        {
            data=a;
            next=null;
        }
    }
    node head;
    node tail;
    int size;
    public MyLinkedList()
    {
        head=null;
        tail=null;
        size=0;
    }
    public MyLinkedList(int a)
    {
        node newnode= new node(a);
        head=newnode;
        tail=newnode;
        size=1;
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return size()==0;
    }
    public void insertatfront(int a)
    {
        node newnode= new node(a);
        if(isEmpty())
        {
            head=newnode;
            tail=newnode;
        }
        else
        {
           newnode.next=head;
           head=newnode;
        }
        size++;
    }
    public void insertatback(int a)
    {
        node newnode= new node(a);
         if(isEmpty())
        {
            head=newnode;
            tail=newnode;
        }
        else
        {
           tail.next=newnode;
           tail=newnode;
        }
        size++;
    }
    public void insertatback(int a,int i)
    {
       // if(i<0||)
    }
    public String toString()
    {
        String s= new String("");
        if(!isEmpty())
        {
            node current=head;
            s+="[";
            while(current!=null)
            {
                s+=current.data+",";
                current=current.next;
            }
            s+="]";
        }
        return s;
    }
  public void reverse()
  {
      if(this.size()<=1)// empty or we have one node!
          return;
      else
      {

          node previous =this.head;
          node forward=previous.next;
          node other;
          while(forward.next!=null)
          {
              other=forward.next;
              forward.next=previous;
              previous=forward;
              forward=other;
          }
          forward.next=previous;
          node temp=head;
          head=tail;
          tail=temp;
          tail.next=null;
      }
  }
  public void insertAt(int a, int i)
  {
      if(i<0||i>this.size())
          return;
      else if(i==0)
          insertatfront(a);
      else if(i==size())
          insertatback(a);
      else
      {
          node current=head;
          node forward=head.next;
          for(int j=1;j<i;++j)
          {
              current=current.next;
              forward=forward.next;
          }
          node newNode =new node(a);
          current.next=newNode;
          newNode.next=forward;
      }
  }
  public boolean equals(MyLinkedList l)
  {
      if(this.size()!=l.size())
          return false;
      node h1= this.head;
      node h2=l.head;
      while(h1!=null)
      {
          if(h1.data !=h2 .data)
              return false;
          h1=h1.next;
          h2=h2.next;
      }
      return true;
  }
  public MyLinkedList concatenate(MyLinkedList l)
  {
      node t1= this.tail;
      node h2=l.head;
      node h3=l.tail;
      t1.next=h2;
      
      size++;
     
      
      //this method concatenates two linked lists.
      //the call is of the form l1.concatenate(l2);
      //it will modify l1 by append to it l2 and then returns it.
      return this;
  }
  public boolean isSorted(MyLinkedList l) //helper method to check if a linked list is sorted
  {//returns true if the Linked List is sorted in ascending order.
      node current=l.head;
      node t;
     // node forward=current.next;
//      if (current==null)
//      {
//          return true;
//      }
      for(t=current;t.next!=null;t=t.next)
      {
          if (t.data>t.next.data)
          {
              return false;
          }
      }
             return true;
  }

  public MyLinkedList merge(MyLinkedList l)//Merges two sorted lists into a sorted one
  {

      if(!isSorted(this) || !isSorted(l))
      {
          return null;
      }
      else
      {
          this.concatenate(l);
          //System.out.println(this.toString());
          // Node current will point to head
        node current = head, index = null;
 
        int temp;
 
        if (head == null) {
            return null;
        }
        else {
            while (current != null) {
                // Node index will point to node next to
                // current
                index = current.next;
 
                while (index != null) {
                    // If current node's data is greater
                    // than index's node data, swap the data
                    // between them
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
 
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
      return this;
 }








      
      //This method merges two sorted Linked Lists. If one of the two lists
      //is not sorted, it returns null. You will receive extra credit if you don't create
      // a new Linked list. l1.merge(l2)
      
  
//Submission: (1) Work in groups of 4 max
// Each group creates a Github account
// Create a repository containing the MyLinkedList class with the
//required methods implemented.
//Send the link to your repository to tmurangira@gmail.com
//Deadline today midnight!
}
//    public List<Object> concatenate(List<Object>list1, List<Object>list2)
//    {
//        List<Object>ret=new LinkedList<>();
//        if(list1==null && list2==null)
//        {
//            return null;
//        }
//        if(list1==null || list1.isEmpty())
//        {
//            return list2;
//        }
//        if(list2==null || list2.isEmpty())
//        {
//            return list1;
//        }
//        if( !list1.isEmpty() || !list2.isEmpty())
//        {
//            ret.addAll(list1);
//            ret.addAll(list2);
//        }
//        return ret;
//    }
//}

