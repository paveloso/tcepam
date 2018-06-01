public class OneLevelArray {
	
	public int maxNum(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= max) {
				max = array[i];
			}
		}
		return max;
	}

}
