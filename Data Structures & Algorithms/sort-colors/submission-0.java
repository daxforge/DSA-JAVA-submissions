
class Solution {
    public void sortColors(int[] nums) {

        int zero = 0;
        int one = 0;
        int two = 0;

        // Count all three values
        for (int temp : nums) {
            if (temp == 0) {
                zero++;
            }
            else if (temp == 1) {
                one++;
            }
            else if (temp == 2) {
                two++;
            }
        }

        // Now all my 3 sections are ready to join
        // Let's join

        int index = 0;

        // Insert all 0's
        while (zero > 0) {
            nums[index] = 0;
            index++;
            zero--;
        }

        // Insert all 1's
        while (one > 0) {
            nums[index] = 1;
            index++;
            one--;
        }

        // Insert all 2's
        while (two > 0) {
            nums[index] = 2;
            index++;
            two--;
        }
    }
}
