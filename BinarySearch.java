
/**
* @author stevelyons
*
*/
public class BinarySearch {
 
    /**
     *
     * @param a integer array to be searched
     * @param value element of the array to be searched
     * @param left left most index of the passed array
     * @param right most index of the passed array
     * @return element value if found else -1 if not found
     */
    public int binarySearch(int[] a, int value, int left, int right) {
 
        // choose pivot index element as middle element
        int idx = (left+right)/2;
 
        // check if pivot index exists in the array
        if(idx>=a.length) {
            return -1;
        }
        int pivot = a[idx];
 
        if(left > right)
            return -1;
 
        if(value < pivot) {
            right = idx-1;
            return binarySearch(a, value, left, right);
        } else if(value > pivot) {
            left = idx+1;
            return binarySearch(a, value, left, right);
        } else {
            return pivot;
        }
    }
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a = {1,2,3,4,5};
        BinarySearch bs = new BinarySearch();
 
        System.out.println(bs.binarySearch(a, 3, 0, a.length));
    }
}
