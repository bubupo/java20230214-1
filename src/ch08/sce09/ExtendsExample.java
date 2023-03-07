package ch08.sce09;

public class ExtendsExample {
	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		
		InterfaceA ia = impl;
		ia.methodA();
		//ia.methodB();
		System.out.println();
		
		InterfaceB ib = impl;
		//ib.methodA();
		ib.methodB();
		System.out.println();
		
		InterfaceC iC = impl;
		iC.methodA();
		iC.methodB();
		iC.methodC();
		System.out.println();
	}
}
