import java.util.HashMap;
import java.util.ArrayList;


public class Code_Test {
	//알쏭달쏭정렬
	
	public static void main(String[] args) {
		
		//input 받기
		String input = "3 2 4 6 8 9 0 1";
		
		//1. HashMap 이용
		HashMap<Integer,Integer> sorted = new HashMap<Integer,Integer>();
		int cnt = 0;
		
		cnt = sort(input, 8, sorted, cnt);
		cnt = sort(input, 5, sorted, cnt);
		cnt = sort(input, 2, sorted, cnt);
		cnt = sort(input, 4, sorted, cnt);
		cnt = sort(input, 3, sorted, cnt);
		cnt = sort(input, 7, sorted, cnt);
		cnt = sort(input, 6, sorted, cnt);
		cnt = sort(input, 1, sorted, cnt);
		cnt = sort(input, 0, sorted, cnt);
		cnt = sort(input, 9, sorted, cnt);
		
		int len = input.split(" ").length;
		String print = "";
		
		for(int j = 0; j < len; j++) {
			print += sorted.get(j) + " ";
		}
		
		print = print.trim();
		
		System.out.println(print);
		
		//2. ArrayList 이용
		ArrayList<Integer> sorted2 = new ArrayList<Integer>();
		
		sort2(input, 8, sorted2);
		sort2(input, 5, sorted2);
		sort2(input, 2, sorted2);
		sort2(input, 4, sorted2);
		sort2(input, 3, sorted2);
		sort2(input, 7, sorted2);
		sort2(input, 6, sorted2);
		sort2(input, 1, sorted2);
		sort2(input, 0, sorted2);
		sort2(input, 9, sorted2);
		
		String print2 = "";
		
		for (Object obj : sorted2) {
			print2 += obj + " ";
		}
		
		print2 = print2.trim();
		
		System.out.println(print2);
		
	}
	
	//각각의 theInput을 받아, 정해진 순서로 입력된 chkNum과 동일한 값을 가지면, sequential한 cnt 값에 차례로 넣는다.
	public static int sort(String theInput,  int chkNum, HashMap<Integer, Integer> theSorted, int cnt) {
	
		String numbers[] = theInput.split(" ");
		for(int i = 0; i < numbers.length; i++) {
			if(Integer.parseInt(numbers[i]) == chkNum) {
				theSorted.put(cnt, Integer.parseInt(numbers[i]));
				cnt++;
			}
		}
		return cnt;
	}
	
	//각각의 theInput을 받아, 정해진 순서로 입력된 chkNum과 동일한 값을 가지면, 순서대로 add한다.
	public static void sort2(String theInput,  int chkNum, ArrayList<Integer> theSorted) {
		
		String numbers[] = theInput.split(" ");
		for(int i = 0; i < numbers.length; i++) {
			if(Integer.parseInt(numbers[i]) == chkNum) {
				theSorted.add(Integer.parseInt(numbers[i]));
			}
		}
	}
}


