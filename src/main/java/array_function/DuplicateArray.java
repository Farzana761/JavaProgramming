package array_function;
//Find the duplicate element in the given array. [1, 5, 2, 2, 3, 4, 3, 5, 2, 6, 7, 9, 8, 5]
public class DuplicateArray {


        public static void main(String[] args)
        {
            int[] my_array = {1, 5, 2, 2, 3, 4, 3, 5, 2, 6, 7, 9, 8, 5};

            for (int i = 0; i < my_array.length-1; i++)
            {
                for (int j = i+1; j < my_array.length; j++)
                {
                    if ((my_array[i] == my_array[j]) && (i != j))
                    {
                        System.out.println("Duplicate Element : "+my_array[j]);
                    }
                }
            }
        }


}
