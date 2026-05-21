package Arraysandarraylists.Sorting;
class FirstMissingPositive{
    public int firstMissingPositive(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[correct] != arr[i]) {
                swap(arr,i, correct);
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
                return j+1;
            }
        }
        return arr.length+1;
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

