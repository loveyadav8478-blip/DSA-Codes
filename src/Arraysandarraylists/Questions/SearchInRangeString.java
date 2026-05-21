package Arraysandarraylists.Questions;

public class SearchInRangeString {
    public static void main(String[] args) {
        String name = "LoveYadav";
        char target = 'e';
        char start = 'o';
        char end = 'v';
        System.out.println(searchInRange(name,start,end,target));

    }
    static boolean searchInRange(String str,char start, char end, char target){
//        if (str.length() == 0){
//            return false;
//        }
        for (int i = start; i < end; i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
