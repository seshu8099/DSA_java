
class binarysearch {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 99};
        int k = 5;
        // System.out.print(searchInSorted(arr2, 5));
        int mid, top = 0, down = arr.length - 1;
        while (true) {
            mid = (top + down) / 2;
            System.out.println(mid + " " + top + " " + down);
            if (arr[mid] == k) {
                System.out.println("yes");
                break;

            } else if (arr[mid] < k) {
                top = mid + 1;
            } else if (arr[mid] > k) {
                down = mid - 1;
            } else if (top == down || top - down < 2) {
                System.out.println("no");
                break;
            }
        }
    }
}
