package Java15;
class CTested extends Thread implements Runnable{
	private String id;
	private int sec;
	public CTested(String str,int s) {
		id=str;
		sec=s;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				sleep(sec);
			}
			catch(InterruptedException e){}
			System.out.println(id+" is running..");
		}
	}
}

public class hw15_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTested one=new CTested("Åª¬í 1",1000);
		CTested two=new CTested("Åª¬í 2",2000);
		Thread t1=new Thread(one);
		Thread t2=new Thread(two);
		t1.start();
		t2.start(); 

	}

}
