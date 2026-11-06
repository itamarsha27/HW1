import java.util.Arrays;

public class Assignment01Q04 {

    private static int[] shiftOnce(int[] array) {
        int temp = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = temp;
        return array;
    }

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if (move == 0 || array.length == 0 || move % array.length == 0) {
            return array;
        }
        if (direction != 'L' && direction != 'R') {
            return array;
        }
        if (move < 0) {
            if (direction == 'L') {
                direction = 'R';
            }
            else{
                direction = 'L';
            }
            move = -move;
        }
        move = move % array.length;
        if (direction == 'L') {
            move = array.length - move;
        }
        for (int i = 0; i < move; i++) {
            array = shiftOnce(array);
        }
        return array;
    }
    

    

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}
