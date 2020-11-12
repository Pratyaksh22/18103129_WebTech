public class Ass5Q1 extends Thread{
	public static void main(String args[]){
		Ass5Q1 count=new Ass5Q1();
		count.start();
	}

	public void run(){
		for(int i=1;i<100;i++){
			System.out.println(i);
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}