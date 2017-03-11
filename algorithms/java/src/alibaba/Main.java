package alibaba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum1, sum2, sum3, sum4;
		int p1 = 1, p2 = 3, p3 = 5, len;
		int[] arr = new int[1000001];
		len = sc.nextInt();
		if (len < 7) {
			System.out.println("false");
			sc.close();
			return;
		}
		for (int i = 0; i < len; ++i) {
			if (i == 0)
				arr[i] = sc.nextInt();
			else
				arr[i] = arr[i - 1] + sc.nextInt();
		}
		sum1 = arr[p1 - 1];
		sum2 = arr[p2 - 1] - arr[p1];
		sum3 = arr[p3 - 1] - arr[p2];
		sum4 = arr[len - 1] - arr[p3];
		while (p3 != len - 1) {
			if (sum4 == sum1 && sum4 == sum2 && sum4 == sum3) {
				System.out.println(sum4 + " true");
				sc.close();
				return;
			}
			if (sum1 <= sum2 && sum1 <= sum3 && sum1 <= sum4) {
				++p1;
				if (p1 + 1 == p2) {
					++p2;
					if (p2 + 1 == p3) {
						++p3;
						if (p3 == len - 1)
							break;
					}
				}

			} else if (sum2 <= sum1 && sum2 <= sum3 && sum2 <= sum4) {
				++p2;
				if (p2 + 1 == p3) {
					++p3;
					if (p3 == len - 1)
						break;
				}
			} else if (sum3 <= sum1 && sum3 <= sum2 && sum3 <= sum4) {
				++p3;
				if (p3 == len - 1)
					break;
			}
			sum1 = arr[p1 - 1];
			sum2 = arr[p2 - 1] - arr[p1];
			sum3 = arr[p3 - 1] - arr[p2];
			sum4 = arr[len - 1] - arr[p3];
		}
		System.out.println("false");
		sc.close();
	}

}
