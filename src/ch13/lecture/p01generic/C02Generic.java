package ch13.lecture.p01generic;

public class C02Generic {

}


//generic type
//T: type parameter
//type Parameter 명 작성 관습: 대문자 한글자
class MyClass02<T>{
	 private T item;
	 
	 public T getItem() {
		return item;
	}
	 public void setItem(T item) {
		this.item = item;
	}
}
