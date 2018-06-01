public class TwoDArray {

	public static void main(String[] args) {
		
		int[][] twoLevelArray = new int[6][6];
		
		for (int i = 0, j = 0; i < twoLevelArray.length; i++, j++) {
			twoLevelArray[i][j] = 1;
			twoLevelArray[i][(twoLevelArray.length - 1) - j] = 1;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println("");
			for (int j = 0; j < 6; j++) {
				System.out.print(twoLevelArray[i][j]);
			}
		}

	}

}
