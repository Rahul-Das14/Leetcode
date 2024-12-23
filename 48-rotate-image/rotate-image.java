class Solution {
    public static void reverseArray(int[] arr) 
    {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers towards the center
            left++;
            right--;
        }
    }

    public void rotate(int[][] matrix) 
    {
        int i,j,temp=0;
        for(i=0;i<matrix.length;i++)
        {
            for(j=0;j<matrix.length;j++)
            {
                if(i>j)
                {
                    temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }

        for(i=0;i<matrix.length;i++)
        {
            reverseArray(matrix[i]);
        }

        for(i=0;i<matrix.length;i++)
        {
            for(j=0;j<matrix.length;j++)
            {
                System.out.println(matrix[i][j]);
            }
        }
    }
}