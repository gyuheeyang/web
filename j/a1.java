import java.util.Scanner;

public class Algo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		입력 받기
		Scanner sc = new Scanner(System.in);
		String firstLine = sc.nextLine();
		
		String[] firstInput = firstLine.split(" ");
		int[] firstInputInt  = new int[firstInput.length];
		
		for (int i = 0 ; i < firstInput.length; i++) {
			firstInputInt[i] = Integer.parseInt(firstInput[i]);
		}
		
//		firstInputInt[0] : 공사현장 x좌표
//		firstInputInt[1] : 공사현장 y좌표
//		firstInputInt[2] : 공사현장 소음 크기 
		
		String secondLine = sc.nextLine();
		
		int n = Integer.parseInt(secondLine); 
//		n : 나무 그늘의 수 
		
		String[] thirdLine = new String[n];
		
		for (int i = 0; i < n; i++) {
			thirdLine[i] = sc.nextLine();
		}
//		"20 10"/ "20 15"/ "70 70"
//		int형으로 변환 필요
		
		
		
//		거리 계산
		for (int i = 0; i < n; i++) {
			String location = thirdLine[i];
			String[] locationArr = location.split(" ");
			
			int x = Integer.parseInt(locationArr[0]); //나무 그늘 x 
			int y = Integer.parseInt(locationArr[1]); //나무 그늘 y
			
			if (Math.pow(x - firstInputInt[0], 2) + Math.pow(y - firstInputInt[1] , 2) < Math.pow(firstInputInt[2], 2)) {
				System.out.println("noisy");
			}else {
				System.out.println("silent");
			}
		}

		

		
	}

}
