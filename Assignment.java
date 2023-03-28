package March28;
	class Assignment extends Thread {
	public void run() {
		System.out.println("ACBACBACBACBACABCA");
	}
	public static void main(String[] args) {
		Assignment t = new Assignment();
		t.start(); //move the thread to the active state
	}}
