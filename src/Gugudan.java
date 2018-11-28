
public class Gugudan {
	// 구구단 함수
	public static int[] calculate(int num)
	{
		int[] result = new int[9];
		for(int i=0;i<result.length;i++)
		{
			result[i] = num*(i+1);
		}
		return result;
	}
	// 배열 화면 출력 함수
	public static void print(int[] result)
	{
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}
	//메인 함수
	public static void main(String[] args) {
		for(int i=2;i<10;i++)
		{
			int[] result = calculate(i); // 구구단 함수 호출
			print(result); // 배열 함수 화면출력 호출
		}
	}
}
