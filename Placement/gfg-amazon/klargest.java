class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here 
        
        ArrayList<Integer> al = new ArrayList<Integer>(k);
    
       Arrays.sort(arr);
       
        
        for(int i=arr.length-1; i>=arr.length-k; i--){
            al.add(arr[i]);
        }
        
        return al;
        
    }
}
