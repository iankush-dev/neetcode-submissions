class Solution {
    public int[] replaceElements(int[] arr) {
        
        int max = -1;
        for(int i=arr.length-1; i>=0; i--) {
            if (arr[i] == arr[arr.length-1]) {
                max = arr[i];
                arr[i] = -1;
            } else {
                if (arr[i] < max) {
                    arr[i] = max;
                } else {
                    arr[i] = arr[i] + max;
                    max = arr[i] - max;
                    arr[i] = arr[i] - max;
                }
            }
        }
        return arr;
    }
}