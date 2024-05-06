////import java.util.*;
////
////public class Main {
////
////    public static void main(String[] args) {
////        Sorting<Item> sorting = new Sorting<>();
////        List<Item> list = new ArrayList<>();
////
////        Scanner scanner = new Scanner(System.in);
////        int n = scanner.nextInt();
////
////        for (int i = 1; i <= n; i++) {
////            int currentBid = scanner.nextInt();
////            int maximalBid = scanner.nextInt();
////            Item item = new Item(i, currentBid, maximalBid);
////            list.add(item);
////        }
////
////        sorting.radixSort(list);
////        for (int k = n - 1; k >= 0; k--) {
////            System.out.print(list.get(k).originalIndex + " ");
////        }
////    }
////}
////
////class Item implements Comparable<Item> {
////    int currentBid;
////    int maximalBid;
////    int originalIndex;
////
////    public Item(int originalIndex, int currentBid, int maximalBid) {
////        this.originalIndex = originalIndex;
////        this.currentBid = currentBid;
////        this.maximalBid = maximalBid;
////    }
////
////    @Override
////    public int compareTo(Item other) {
////        if (this.currentBid != other.currentBid) {
////            return -1 * Integer.compare(this.currentBid, other.currentBid);
////        }
////
////        if (this.maximalBid != other.maximalBid) {
////            return Integer.compare(this.maximalBid, other.maximalBid);
////        }
////
////        return Integer.compare(this.originalIndex, other.originalIndex);
////    }
////
////    public int getCurrentBid() {
////        return currentBid;
////    }
////
////    public int getMaximalBid() {
////        return maximalBid;
////    }
////}
////
////class Sorting<T extends Comparable<T>> {
////
////    public void radixSort(List<T> arr, list<item>) {
////        if (arr == null || arr.isEmpty()) return;
////
////        int maxVal = getMaxValue(arr);
////
////        // Perform counting sort for each digit position
////        for (int exp = 1; maxVal / 10 > 0; exp += 1) {
////            countingSort(arr, exp);
////            maxVal /= 10;
////        }
////    }
////
////    private int getMaxValue(List<T> arr) {
////        int max<T> = arr.get(0);
////        for (int i = 1; i < n; i++)
////            if (array[i] > max)
////                max = array[i];
////        return max;
////    }
////
////    private void countingSort(List<T> arr, list<item>, int exp) {
////        List<Integer> number = new ArrayList<>(arr.size());
////        // fill in numbers
////
////        // Create a count array to store the count of each digit
////        int[] count = new int[10];
////        for (Integer element : number) {
////            count[element]++;
////        }
////
////        // Modify the count array to store the actual position of each element
////        for (int i = 1; i < count.length; i++) {
////            count[i] += count[i - 1];
////        }
////
////        // Create a temporary array to store the sorted elements
////        List<T> newArr = new ArrayList<>(arr.size());
////
////        // Build the temporary array in sorted order
////        for (int i = arr.size() - 1; i >= 0; i--) {
////            T element = arr.get(i);
////            int num = number.get(i);
////            int index = count[num] - 1;
////            newArr[index] = element;
////            count[index]--;
////        }
////
////        arr = newArr;
////    }
////}
//
///*
//5
//3 50
//4 150
//3 50
//4 100
//1 200
//*/
//
//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Sorting<Item> sorting = new Sorting<>();
//        List<Item> list = new ArrayList<>();
//
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            int currentBid = scanner.nextInt();
//            int maximalBid = scanner.nextInt();
//            Item item = new Item(i, currentBid, maximalBid);
//            list.add(item);
//        }
//
//        sorting.sortItems(list);
//        for (int k = n - 1; k >= 0; k--) {
//            System.out.print(list.get(k).originalIndex + " ");
//        }
//    }
//}
//
//class Item implements Comparable<Item> {
//    int currentBid;
//    int maximalBid;
//    int originalIndex;
//
//    public Item(int originalIndex, int currentBid, int maximalBid) {
//        this.originalIndex = originalIndex;
//        this.currentBid = currentBid;
//        this.maximalBid = maximalBid;
//    }
//
//    @Override
//    public int compareTo(Item other) {
//        if (this.currentBid != other.currentBid) {
//            return -1 * Integer.compare(this.currentBid, other.currentBid);
//        }
//
//        if (this.maximalBid != other.maximalBid) {
//            return Integer.compare(this.maximalBid, other.maximalBid);
//        }
//
//        return Integer.compare(this.originalIndex, other.originalIndex);
//    }
//
//    public int getCurrentBid() {
//        return currentBid;
//    }
//
//    public int getMaximalBid() {
//        return maximalBid;
//    }
//}
//
//class Sorting<T extends Comparable<T>> {
//
//    public void sortItems(List<Item> items){
//        List<Integer> cArr = new ArrayList<>();
//        for (Item item : items){
//            cArr.add(item.getCurrentBid());
//        }
//
//        radixSort(cArr, items);
//
//        System.out.println("First: ");
//        for (Item item : items) {
//            System.out.println(item.currentBid);
//        }
//
//        for (int i = 0; i <= items.size(); i++){
//            int countLength = 0;
//            if (items.get(i).currentBid == items.get(i + 1).currentBid && countLength == 0){
//                List<Item> forMaximalSort = new ArrayList<>();
//                List<Integer> mArr = new ArrayList<>();
//                for (int j = i; j < cArr.size(); j++){
//                    if (items.get(i).currentBid == items.get(i + 1).currentBid){
//                        countLength++;
//                        forMaximalSort.add(items.get(j));
//                        mArr.add(items.get(j).maximalBid);
//                    }
//                    else{
//                        radixSort(mArr, forMaximalSort);
//                        break;
//                    }
//                }
//                for (int j = 0; j < countLength; j++){
//                    items.set(i + j, forMaximalSort.get(j));
//                }
//                i += countLength;
//            }
//        }
//
//
//        System.out.println("Second: ");
//        for (Item item : items) {
//            System.out.println(item);
//        }
//
//
//        for (int i = 0; i <= items.size(); i++){
//            int countLength = 0;
//            if (items.get(i).maximalBid == items.get(i + 1).maximalBid && countLength == 0){
//                List<Item> forIndexSort = new ArrayList<>();
//                List<Integer> indexArr = new ArrayList<>();
//                for (int j = i; j < cArr.size(); j++){
//                    if (items.get(i).currentBid == items.get(i + 1).currentBid){
//                        countLength++;
//                        forIndexSort.add(items.get(j));
//                        indexArr.add(items.get(j).maximalBid);
//                    }
//                    else{
//                        radixSort(indexArr, forIndexSort);
//                        break;
//                    }
//                }
//                for (int j = 0; j < countLength; j++){
//                    items.set(i + j, forIndexSort.get(countLength - (j + 1)));
//                }
//                i += countLength;
//            }
//        }
//
//        System.out.println("Third: ");
//        for (Item item : items) {
//            System.out.println(item);
//        }
//
//    }
//
//
//
//    public void radixSort(List<Integer> arr, List<Item> items) {
//        if (arr == null || arr.isEmpty()) return;
//
//        int maxVal = getMaxValue(arr);
//
//        // Perform counting sort for each digit position
//        for (int exp = 1; maxVal / 10 > 0; exp += 1) {
//            countingSort(arr, items, exp);
//            maxVal /= 10;
//        }
//
//        System.out.println("First: ");
//        for (Item item : items) {
//            System.out.println(item.currentBid);
//        }
//
//    }
//
//    private int getMaxValue(List<Integer> arr) {
//        int max = arr.get(0);
//        for (int i = 1; i < arr.size(); i++)
//            if (arr.get(i) > max)
//                max = arr.get(i);
//        return max;
//    }
//
//    private void countingSort(List<Integer> arr, List<Item> items, int exp) {
//
//        System.out.println("success");
//
//        List<Integer> number = new ArrayList<>(arr.size());
//        // fill in numbers
//
//        for (int i = 0; i < arr.size(); i ++){
//            number.add(arr.get(i) % (10 * exp));
//        }
//        System.out.println(number);
//
//        // Create a count array to store the count of each digit
//        int[] count = new int[number.size()];
//        for (Integer element : number) {
//            count[element]++;
//        }
//
//        // Modify the count array to store the actual position of each element
//        for (int i = 1; i < count.length; i++) {
//            count[i] += count[i - 1];
//        }
//
//        // Create a temporary array to store the sorted elements
//        int sizeOfNewArr = arr.size();
//        List<Integer> newArr = new ArrayList<>(arr);
//
//        System.out.println("sucess");
//
//        // Build the temporary array in sorted order
//        for (int i = arr.size() - 1; i >= 0; i--) {
//            int element = arr.get(i);
//            int num = number.get(i);
//            int index = count[num] - 1;
//            newArr.set(index, element);
//            count[index]--;
//        }
//
//        arr = newArr;
//        System.out.println("1" + newArr);
//    }
//}
//

//Ksenia Korchagina
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> currentList = new ArrayList<>();
        List<Integer> maximalList = new ArrayList<>();
        List<Item> items          = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int currentBid = scanner.nextInt();
            int maximalBid = scanner.nextInt();

            currentList.add(currentBid);
            maximalList.add(maximalBid);
            items.add(new Item(i, currentBid, maximalBid));
        }

        Sorter<Integer> sorter = new Sorter<Integer>();

        items = sorter.sortItems(currentList, maximalList, items);
        // print items

        for (Item item : items) {
            System.out.print(item.originalIndex + " ");
        }
    }
}

class Item {
    int currentBid;
    int maximalBid;
    int originalIndex;

    public Item(int originalIndex, int currentBid, int maximalBid) {
        this.originalIndex = originalIndex;
        this.currentBid = currentBid;
        this.maximalBid = maximalBid;
    }
}

class Result {
    List<Integer> arr;
    List<Item> items;

    public Result(List<Integer> arr, List<Item> items) {
        this.arr = arr;
        this.items = items;
    }
}

class Sorter<T extends Number> {
    public List<Item> sortItems(List<Integer> currentList, List<Integer> maximalList, List<Item> items){
        items = KseniaKorchagina_radix_srt(maximalList, items, false);
        List<Integer> curList = new ArrayList<>(items.size());
        for (int i = 0; i < items.size(); i++) {
            curList.add(items.get(i).currentBid);
        }
        items = KseniaKorchagina_radix_srt(curList, items, true);

        return items;
    }

    public List<Item> KseniaKorchagina_radix_srt(List<Integer> arr, List<Item> items, boolean isReversed) {
        if (arr == null || arr.isEmpty()) return items;

        int maxVal = getMaxValue(arr);

        int cnt = 1;
        while (maxVal / 10 != 0) {
            cnt++;
            maxVal /= 10;
        }

        // Perform counting sort for each digit position
        for (int c = 0; c < cnt; c++) {
            List<Integer> number = new ArrayList<>(arr.size());

            for (int i = 0; i < arr.size(); i++) {
                number.add(arr.get(i) % 10);
                arr.set(i, arr.get(i) / 10);
            }

            Result res;

            if (isReversed) {
                res = KseniaKorchagina_reversed_count_srt(arr, number, items);
            } else {
                res = KseniaKorchagina_count_srt(arr, number, items);
            }

            arr = res.arr;
            items = res.items;
        }

        return items;
    }

    private int getMaxValue(List<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++)
            if (arr.get(i) > max)
                max = arr.get(i);
        return max;
    }

    private Result KseniaKorchagina_count_srt(List<Integer> arr, List<Integer> number, List<Item> items) {
        // Create a count array to store the count of each digit
        int[] count = new int[10];
        for (Integer element : number) {
            count[element]++;
        }

        // Modify the count array to store the actual position of each element
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        List<Integer> newArr = new ArrayList<>(arr.size());
        List<Item> newItems = new ArrayList<>(items.size());

        for (int i = 0; i < arr.size(); i++) {
            newArr.add(0);
            newItems.add(null);
        }

        // Build the temporary array in sorted order
        for (int i = arr.size() - 1; i >= 0; i--) {
            int element = arr.get(i);
            int num = number.get(i);
            int index = count[num] - 1;
            newArr.set(index, element);
            newItems.set(index, items.get(i));
            count[num]--;
        }

        return new Result(newArr, newItems);
    }

    private Result KseniaKorchagina_reversed_count_srt(List<Integer> arr, List<Integer> number, List<Item> items) {
        // Create a count array to store the count of each digit
        int[] count = new int[10];
        for (Integer element : number) {
            count[element]++;
        }

        // Modify the count array to store the actual position of each element
        for (int i = count.length - 2; i >= 0; i--) {
            count[i] += count[i + 1];
        }

        List<Integer> newArr = new ArrayList<>(arr.size());
        List<Item> newItems = new ArrayList<>(items.size());

        for (int i = 0; i < arr.size(); i++) {
            newArr.add(0);
            newItems.add(null);
        }

        // Build the temporary array in sorted order
        for (int i = arr.size() - 1; i >= 0; i--) {
            int element = arr.get(i);
            int num = number.get(i);
            int index = count[num] - 1;
            newArr.set(index, element);
            newItems.set(index, items.get(i));
            count[num]--;
        }

        return new Result(newArr, newItems);
    }
}
