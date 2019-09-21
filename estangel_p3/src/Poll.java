import java.util.Scanner;
public class Poll {
	public static void main(String args[]) {
		String[] topics = {"Environment", "Politics", "Sports", "Food", "Travel"};
		int maxTopicLength = Integer.MIN_VALUE;
		for(int i = 0; i< topics.length; i++) {
			if(maxTopicLength < topics[i].length()) {
				maxTopicLength = topics[i].length();
			}
		}
		int[][] responses = new int[5][10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<10 ; i++) {
			System.out.println("User " + (i+1)+ ", please enter responses between (1 - 10): ");
			for(int j = 0 ; j < 5; j++) {
				int response;
				do {
					System.out.println("Topic " + topics[j]);
					response = sc.nextInt();
					if(response>10 || response < 1) {
						System.out.println("Invalid Input. Please Try Again!");
					}
				}while(response>10 || response < 1);
				responses[j][i] = response;
				sc.nextLine();
			}
		}
		
		int highest = Integer.MIN_VALUE;
		int lowest = Integer.MAX_VALUE;
		int highestIndex = 0;
		int lowestIndex = 0;
		for(int i = 0; i < 5; i++) {
			System.out.print(topics[i]);
			for(int k = 0; k< ((maxTopicLength + 5) - topics[i].length()); k++) {
				System.out.print(" ");
			}
			int total = 0;
			for(int j = 0; j < 10; j++) {
				total += responses[i][j];
				System.out.print(responses[i][j]+"\t");
			}
			if(total>highest) {
				highest = total;
				highestIndex = i;
			}
			if(total<lowest) {
				lowest = total;
				lowestIndex = i;
			}
			System.out.println("Average: " + (double)total/10.0);
		}
		
		System.out.println("Highest total of "+ highest+ " is for the topic " + topics[highestIndex]);
		System.out.println("Lowest total of "+ lowest+ " is for the topic " + topics[lowestIndex]);
	}
}
