
class LamdaThread{
	public static void main(String ar[]){
		Runnable runnable = ()->{
			System.out.println("Thread is running");
		};
		
		new Thread(runnable).start();
	}
}
/*
Output : 
Thread is running

Create a thread using lambda function
*/
