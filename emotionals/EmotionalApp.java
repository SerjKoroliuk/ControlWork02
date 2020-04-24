package controlWork2.emotionals;

public class EmotionalApp implements Emotional{

	@Override
	public void cry() {
		System.out.println("... is crying");
		
	}

	@Override
	public void fun() {
		System.out.println("... is havingFun");
		
	}

	@Override
	public void laugh() {
		System.out.println("... is laughing");
		
	}

	@Override
	public void sad() {
		System.out.println("... is sadly");
		
	}

	@Override
	public void getEmotion() {
		System.out.println("... is crying and havingFun and laughing and sadly");
		
	}

}
