package recurssion;

import java.util.ArrayList;
import java.util.List;

public class AllCombinations {
    public static void main(String[] args) {
        int[] arr={2,3,1};
        List<Integer> list= new ArrayList<>();
        findCombination(arr, 0, list, 0);
        //Collections.sort(list);

        list.stream().forEach(s-> System.out.println(s));


    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> end = new ArrayList<>();
        findCombination(candidates, target, 0, new ArrayList<>(), end);
        return end;
    }

    public static void findCombination(int[] candidates, int target, int index, List<Integer> list, List<List<Integer>> end){

        if(index==candidates.length){
            if(target==0){
                end.add(list);
            }
            return;
        }

        if(candidates[index]<=target){
            list.add(candidates[index]);
            findCombination(candidates, target-candidates[index], index, list, end);
            list.remove(list.size()-1);
        }
        findCombination(candidates, target, index+1, list, end);
    }

    public static void findCombination(int[] arr, int index, List<Integer> list, int sum) {

        if(index==arr.length){
            list.add(sum);
            return;
        }
        sum=sum+arr[index];
        findCombination(arr, index+1, list, sum);
        sum=sum-arr[index];
        findCombination(arr, index+1, list, sum);
    }



}
