package Java15;
class CTest extends Thread{
	private String id;
	public CTest(String str) {
		id=str;
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			for(int j=0;j<100000000;j++);
			System.out.println(id+" "+i);
		}
	}
}

public class hw15_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest hi=new CTest("Hello");
		CTest bye=new CTest("Good bye");
		hi.start();
		bye.start();
	}

}
