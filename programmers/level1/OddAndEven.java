package level1;

/*
 * ���� num�� ¦���� ��� "Even"�� ��ȯ�ϰ� Ȧ���� ��� "Odd"�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.

	���� ����
	num�� int ������ �����Դϴ�.
	0�� ¦���Դϴ�.
	����� ��
 * num	return
	3	"Odd"
	4	"Even"
 * 
 */
public class OddAndEven {
	 public String solution(int num) {
	        String answer = "";
	        if(num % 2 == 1 || num % 2 == -1){
	            answer = "Odd";
	        }
	        else{
	            answer = "Even";
	        }
	    
	        return answer;
	    }
	 
}
