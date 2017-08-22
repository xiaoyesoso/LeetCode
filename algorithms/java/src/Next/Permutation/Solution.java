package Next.Permutation;

public class Solution {
	public static void swap(int[] nums, int i, int j) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
    /* 我们来设想下：
     *  1 如何调整为比原来大的数？
     *      需要 swap（nums【i】，nums【j】） ， nums【i】< nums【j】 && i < j
     * 2 那我们如何调整为原来大且最小的数呢？
     *     （1）首先使得i最大。
     *         假设 nuns 为 {……，4,7,5,3,1} ，我们可以看到i为从数组尾部开始的递增序列前一个数值，这里即为nums【i】 4。
     *     （2）使得j最大。
     *             我们能从递增序列中找到nums【j】为 5. 
     *     （3）使得swap（nums【i】，nums【j】）后，比i低位的数字构成的数值最小
     *             swap（nums【i】，nums【j】） 得到 {……，5,7,4,3,1}
     *             reverse（nums，i+1，len（nums）-1） 得到{……，5,1,3,4,7}
     * */
	public static void nextPermutation(int[] nums) {
		if (nums.length <= 1)
			return;
		int a = nums.length - 1, b = nums.length - 1;
		while (b > 0 && nums[b - 1] >= nums[b])
			--b;
		if (b > 0) {
			while (nums[b - 1] >= nums[a])
				--a;
			swap(nums, a, b - 1);
		}
		for (int i = 0; i * 2 <= nums.length - 2 - b; ++i) {
			swap(nums, b + i, nums.length -1 - i);
		}
	}
}
