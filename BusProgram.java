
public class BusProgram {

	static class BusAnalyser {

		public static int minDelay(int[] t1) {

			int minNumber = t1[0];
			for (int i = 1; i < t1.length; i++) {
				if (t1[i] < minNumber) {
					minNumber = t1[i];
				}
			}

			return minNumber;
		}

		public static int daysAboveAvg(int[] t1) {

			double avg = 0;
			int above = 0; 
			for (int j = 0; j <t1.length; j++) {
				avg +=t1[j];
				avg = avg/t1.length;	
			}
			for (int j = 0; j <t1.length; j++) {
				if (t1[j] > avg) {
					return above = t1[j];
				}
				
			}
			return above;
			
	
		}

	}

	public static void main(String[] args) {

		int[] t1 = { 1, 5, 3, 9, 3, 10 };
		int[] t2 = { 2, 2, 3 };
		int[] t3 = { 9, 9, 8, 6, 5, 5, 6 };
		System.out.println(BusAnalyser.minDelay(t1));
		System.out.println(BusAnalyser.minDelay(t2));
		System.out.println(BusAnalyser.minDelay(t3));
		System.out.println(BusAnalyser.daysAboveAvg(t1));
		System.out.println(BusAnalyser.daysAboveAvg(t2));
		System.out.println(BusAnalyser.daysAboveAvg(t3));
	}

}
