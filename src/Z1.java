public class Z1 {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = findMaximum(tab);
        int min = findMinimum(tab);
        System.out.println("Max: " + max + "Min: " + min);

    }

    private static int findMaximum(int[] tab) {
        int potentialMax = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > potentialMax) {
                potentialMax = tab[i];
            }
        }return potentialMax;

    }

    private static int findMinimum(int[] tab) {
        int potentialMin = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < potentialMin) {
                potentialMin = tab[i];
            }
        } return potentialMin;
    }
}