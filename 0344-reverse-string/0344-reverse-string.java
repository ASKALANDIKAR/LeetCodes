class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(right>left){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left ++;
            right --;
        }
        for(int num : s){
            System.out.print(num);
        }
    }
}