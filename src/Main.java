/**3.Ölçüsü 5 olan array yaradın. Yalnız cüt indekslərdəki elementləri çap edin.*/

public class Main {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {1, 2, 3, 4, 5};
        //Loop through the array by incrementing value of i by 2
        for (int i = 0; i < arr.length; i = i+2) {
            System.out.println(arr[i]);
        }
    }
}
