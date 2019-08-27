import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MyThread1 implements Runnable{
    List l = null;
     
    public MyThread1(List l) {
        super();
        this.l = l;
    }
 
    @Override
    public void run() {
    	System.out.println(Thread.currentThread().getName());
    	    synchronized (l) {
    	        Iterator iter = l.iterator();
    	           while(iter.hasNext()){
    	               System.out.println(iter.next());
   	           }
   	       }
    }
  }
 
class MyThread2 implements Runnable{
    List l = null;
     
    public MyThread2(List l) {
        super();
        this.l = l;
    }
 
    @Override
    public void run() {
    	
	    synchronized (l) {
	        Iterator iter = l.iterator();
	           while(iter.hasNext()){
	        	   System.out.print(Thread.currentThread().getName());
	               System.out.println(" "+iter.next());
	           }
	       }
    }
}

public class Thread_demo3 {
	public static void main(String a[]) throws InterruptedException{
        List<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(4));
        list.add(new Integer(5));
        list.add(new Integer(6));
        list.add(new Integer(7));
        list.add(new Integer(9));
        list.add(new Integer(10));
        list.add(new Integer(11));
         
        Thread t1 = new Thread(new MyThread1(list));
        Thread t2 = new Thread(new MyThread2(list));
 
        t1.setName("Thread_1");
        t2.setName("Thread_2");
         
        t1.start();
        t1.join();
        t2.start();
        t2.join();
    }
}
