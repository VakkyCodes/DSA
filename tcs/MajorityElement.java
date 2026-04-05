//Boyer-Moore Voting Algorithm
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        
        // Voting phase
        for (int num : nums) {
            if (count == 0) {
                candidate = num;  // pick new candidate
            }
            if (num == candidate) {
                count++;          // same as candidate → support
            } else {
                count--;          // different → cancel out
            }
        }

        // Candidate is guaranteed to be majority (problem condition)
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums)); // Output: 2
    }
}
