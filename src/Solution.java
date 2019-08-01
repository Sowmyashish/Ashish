//// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
//// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
//// DEFINE ANY CLASS AND METHOD NEEDED
//import java.util.*;
//
//// CLASS BEGINS, THIS CLASS IS REQUIRED
//public class Solution
//{
//
////
////        private String substring(int beginIndex, String value) {
////            int subLen = value.length() - beginIndex;
////            return (beginIndex == 0) ? value : new String(value, beginIndex, subLen);
////        }
////
////        private String substring(int beginIndex, int endIndex, String value) {
////            int subLen = endIndex - beginIndex;
////            return ((beginIndex == 0) && (endIndex == value.length())) ? value
////                    : new String(value, beginIndex, subLen);
////        }
////{
//    final static int DESTINATION = 9;
//
//    int minimumDistance(int numRows, int numColumns, List<List<Integer>> area)
//    {
//
//        String a = "a";
//        a.substring()
//        if(numRows == 0 || numColumns == 0) {
//            return -1;
//        }
//
//        int output = 0;
//
//        final Queue<int[]> q = new LinkedList<>();
//        q.add(new int[]{0,0});
//
//        while(!q.isEmpty()) {
//            final int size = q.size();
//            for (int i=0; i<size; i++) {
//                int[] cell = q.poll();
//                int x = cell[0];
//                int y = cell[1];
//                if (area.get(x).get(y) == DESTINATION) {
//                    return output;
//                }
//                area.get(x).set(y, 0);
//                if (x - 1 >= 0 && area.get(x - 1).get(y) != 0) {
//                    q.add(new int[]{x - 1, y});
//                }
//                if (y - 1 >= 0 && area.get(x).get(y - 1) != 0) {
//                    q.add(new int[]{x, y - 1});
//                }
//                if (x < numRows - 1 && area.get(x + 1).get(y) != 0) {
//                    q.add(new int[]{x + 1, y});
//                }
//                if (y < numColumns - 1 && area.get(x).get(y + 1) != 0) {
//                    q.add(new int[]{x, y + 1});
//                }
//            }
//            output++;
//        }
//        return -1;
//    }
//
//
//    public static void main(String[] args) {
//       // int[] a = Arrays.asList({1, 0, 0});
//        int[] b = {1, 0, 0};
//        int[] c = {1, 9, 0};
//       // Arrays.asList(a);
//        List<Integer> a = new ArrayList<>()
//
//       // new Solution().minimumDistance(3, 3 )
//    }
//}