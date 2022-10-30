public class EagerInitializedSingleton {
    
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    
    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
	
	public void test() {
		System.out.println("This is Singleton instance");
	}
	
	public static void main(String[] args) {
		EagerInitializedSingleton.getInstance().test();
	}
}