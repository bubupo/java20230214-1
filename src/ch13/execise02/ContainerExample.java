package ch13.execise02;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String> container1 = new Container<String>();
		container1.set("홍길동");
		String str = container1.get();
		
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6);
		int value = container2.get();
	}
}

class Container<T>{
	private T item;
	
	public void set(T i) {
		this.item = i;
	}
	public T get(){
		return item;
	}
	
}
