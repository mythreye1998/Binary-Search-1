// time complexity - O(logn), space complexity - O(N)
//Exponential Search is used in finding the range where the target might exist. The range is defined by the low and high pointers.
//Once the range is found, a standard binary search is performed within that range to find the target.

class Solution{
    public int search(ArrayReader reader, int target){
        if(reader.get(0) == target) return 0;
        int low =0;
        int high=1;
        while(reader.get(high) < target){
            low = high;
            high = 2*high;
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            if(reader.get(mid)==target) return mid;
            else if(reader.get(mid)> target) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
}