package linked;
import java.io.*;
import java.util.*;
import java.util.LinkedList;
public class run extends MyLinkedList{
       public static void main(String[]args)
    {
        MyLinkedList l=new MyLinkedList();
        MyLinkedList l2=new MyLinkedList();
        l.insertatfront(1);
        l.insertatback(3);
        l.insertatback(5);
        l2.insertatfront(2);
        l2.insertatback(4);
        l2.insertatback(6);

        System.out.println("LIST 1:"+l);
        System.out.println("LIST 2:"+l2);
        System.out.println("MERGED:"+l.merge(l2));
        System.out.println("CONCATENATE:"+l.concatenate(l2));

    }
}
