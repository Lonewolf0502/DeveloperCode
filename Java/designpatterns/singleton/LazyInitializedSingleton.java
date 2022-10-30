public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;
    
    private LazyInitializedSingleton(){}
    
    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
	
	public void test() {
		System.out.println("This is LazyInitializedSingleton instance");
	}
	
	public static void main(String[] args) {
		LazyInitializedSingleton.getInstance().test();
	}
}