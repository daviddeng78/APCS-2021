public class recursion-2 {
	public boolean groupSum(int start, int[] nums, int target) {
  if (nums.length==0){return true;}
  if (start>=nums.length){
    return target==0;
  }
  int firstVal = nums[start];
  if (start == nums.length-1) {
    return firstVal==target||target==0;
  }
  return groupSum(start + 1, nums, target - firstVal) || groupSum(start + 1, nums, target);
}
}
