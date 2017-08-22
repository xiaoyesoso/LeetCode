package Number.Complement;

public class Solution {
	public int findComplement(int num) {
		long x = 1;
		while(x <= num) x = x << 1;
		return (int) (num^(x-1));
	}
}
