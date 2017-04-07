package ariyamanTeam.farmapp.util;

public class MathUtil {
	public int add(int a, int b){
		int sum = Math.addExact(a, b);
//		System.out.println("Math.addExact(" +a+"," +b+ ") ==> " +sum);
		return sum;
	}
}