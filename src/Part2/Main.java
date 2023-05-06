package Part2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");
        list.add("fig");

        String key = "cherry";
        int beginIdx = 0;
        int endIdx = list.size() - 1;

        System.out.println("Index of key: " + recLinearSearch(list, key, beginIdx, endIdx));


        int[] a = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int search = 13;

        System.out.println("Index of search element: " + binarySearch(a, search));
        System.out.println("Index of search element: " + recursiveBinarySearch(a, search, 0, a.length - 1));

        int[] a2 = {2, 3, 5, 10, 16, 24, 32, 48, 96, 120, 240, 360, 800, 1600};
        search = 10;

        int index = recursiveBinarySearch(a2, search, 0, a.length - 1);
        System.out.println("Index of search element: " + index);
        search = 150;
        index = recursiveBinarySearch(a2, search, 0, a.length - 1);
        System.out.println("Index of search element: " + index);
    }

    public static int recLinearSearch(ArrayList<String> list, String key, int beginIdx, int endIdx) {
        if (beginIdx > endIdx) {
            return -1;
        }

        if (list.get(beginIdx).equals(key)) {
            return beginIdx;
        }

        return recLinearSearch(list, key, beginIdx + 1, endIdx);
    }
    public static int binarySearch(int[] a, int search) {
            int left = 0;
            int right = a.length - 1;

            while (left <= right)
            {
                int mid = left + (right - left) / 2;

                if (a[mid] == search)
                {
                    return mid;
                }

                if (a[mid] < search)
                {

                    left = mid + 1;
                } else
                {
                    right = mid - 1;
                }
            }
            return -1;
        }

    public static int recursiveBinarySearch(int[] a, int search, int low, int high)
    {
        if (low > high)
        {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (a[mid] == search) {
            return mid;
        }

        if (a[mid] > search)
        {
            return recursiveBinarySearch(a, search, low, mid - 1);
        }

        return recursiveBinarySearch(a, search, mid + 1, high);
    }





}

