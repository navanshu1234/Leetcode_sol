class Solution {
    public int sumSubarrayMins(int[] arr) {
       int n = arr.length;
       int sum = 0;
        for(int i=0;i<n;i++)
        {   ArrayList<Integer> ar = new ArrayList<Integer>();
            for(int j=i;j<n;j++)
            {   
               ar.add(arr[j]);
               int min = Collections.min(ar);
               sum = sum + min;
            }
        }
        int mod =  (int)Math.pow(10,9) + 7;
        return sum%mod;
    }
}
//time limit exceed
class Solution {
    public int sumSubarrayMins(int[] arr) {
       int n = arr.length;
       int sum = 0;
        for(int i=0;i<n;i++)
        {   ArrayList<Integer> ar = new ArrayList<Integer>();
            for(int j=i;j<n;j++)
            {   
               ar.add(arr[j]);
               Collections.sort(ar);
               int min = ar.get(0);
               sum = sum + min;
            }
        }
        int mod =  (int)Math.pow(10,9) + 7;
        return sum%mod;
    }
}
//time limit exceed case: 72
class Solution {
public:
    int sumSubarrayMins(vector<int>& arr) {
        int n = arr.size();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            std::vector<int> subarray;
            for (int j = i; j < n; j++) {
                subarray.push_back(arr[j]);
                int min_val = *std::min_element(subarray.begin(), subarray.end());
                sum = (sum + min_val) % ((int)pow(10, 9) + 7);
            }
        }

        return sum;
    }
}; // Yes, it is equivalent c++ solution, time limit exceed case: 77
// Here comes the python solution
class Solution(object):
    def sumSubarrayMins(self, arr):
        n = len(arr)
        mod = 10**9 + 7
        total_sum = 0

        for i in range(n):
            subarray = []
            for j in range(i, n):
                subarray.append(arr[j])
                min_val = min(subarray)
                total_sum = (total_sum + min_val) % mod

        return total_sum
//time limit exceed case: 77
// here comes C code:
    int sumSubarrayMins(int* arr, int arrSize) {
    int mod = 1000000007;
    int sum = 0;
    int n = arrSize;
    for (int i = 0; i < n; i++) {
        int subarray[n - i];
        for (int j = i; j < n; j++) {
            subarray[j - i] = arr[j];
            int min_val = subarray[0];
            for (int k = 1; k <= j - i; k++) {
                if (subarray[k] < min_val) {
                    min_val = subarray[k];
                }
            }
            sum = (sum + min_val) % mod;
        }
    }

    return sum;
} //time limit exceed case: 77
/* Another approach:
    find all subarray(contigous) (the subarray division is similar to all sub string finding of a string, You can also try this question by converting given array to string and divide them into substring using s.substring(i,j+1) to get all contigous substring), size= (n*(n+1))/2 and add to arraylist which is added to list of arraylist
    then find all min in List and add them;
    then divide by modulo */
