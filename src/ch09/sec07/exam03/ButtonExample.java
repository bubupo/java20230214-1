package ch09.sec07.exam03;

public class ButtonExample {
	public static void main(String[] args) {
		Button bntOk = new Button();
		
		bntOk.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");
				
			}
		});
		bntOk.click();
		
		Button bntCancel = new Button();
		
		bntCancel.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
				
			}
		});
		bntCancel.click();
	}
}
