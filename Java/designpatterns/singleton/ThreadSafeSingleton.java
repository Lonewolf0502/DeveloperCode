public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton(){}
    
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
	
	public void test() {
		System.out.println("This is ThreadSafeSingleton instance");
	}
	
	public static void main(String[] args) {
		ThreadSafeSingleton.getInstance().test();
	}
    
}