package controlWork2.emotionals;

public class MainApp {

	public static void main(String[] args) {
		
		LaughtApp laughtApp = new LaughtApp();
		EmotionalApp emotionalApp = new EmotionalApp();
		
		laughtApp.laugh();
		
		System.out.println("___________________________");
		
		emotionalApp.cry();
		emotionalApp.fun();
		emotionalApp.laugh();
		emotionalApp.sad();
		emotionalApp.getEmotion();

	}

}
