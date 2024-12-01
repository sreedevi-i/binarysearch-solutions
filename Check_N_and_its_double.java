//* 1346. Check If N and Its Double Exist: Given an array arr of integers, check if there exist two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j] *//

  class Solution {
    public boolean checkIfExist(int[] arr) {
        // two pointer approach
        Arrays.sort(arr);
        int length=arr.length;
        for(int left=0, right=0;left < length; left++) {
            int target = arr[left] * 2;
            while (right<length && arr[right]<target) {
                right++;
            }
            if(target == 0) {
                right++;
            }
            if (right == length) {
                break;
            }
            if (arr[right] == target){
                return true;
            }
        }
        return false;
        

    }

    public boolean withBinarySearch (int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            int t= 2*arr[i];
            int index = binarySearch(arr,t);
            if (index != i && index != -1){
                return true;
            }
        }
        return false;
    }

    public int binarySearch(int[] arr, int t) {
        int left =0;
        int right = arr.length-1;
        while(left<=right) {
            int mid = left+ (right-left)/2;
            if (arr[mid] == t) {
                return mid;
            } else if (arr[mid]<t) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return -1;
    }

    public boolean withHashMap(int[] arr) {
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for(int i:arr) {
            frequency.put(i,frequency.getOrDefault(i,0)+1);
        }
        for(int i:arr) {
            if((i !=0 && frequency.containsKey(i*2))) {
                return true;
            }
            if (i ==0 && frequency.get(i)>1) {
                return true;
            }
        }
        return false;
    }

    public boolean withHashSet(int[] arr) {
        HashSet<Integer> checkedNumbers = new HashSet<>();
        for(int i:arr) {
            if(checkedNumbers.contains(i*2) || (checkedNumbers.contains(i/2) && (i%2)==0)) 
            {
                return true;
            } else {
                checkedNumbers.add(i);
            }
        }
        return false;
    }
}
