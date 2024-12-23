class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> order = new ArrayList<Integer>();
        int top=0,bottom=matrix.length-1,left=0,right=matrix[0].length-1,i,j;

        while(top<=bottom  &&  left<=right)
        {
            for(i=left;i<=right;i++)
            {
                order.add(matrix[top][i]);
            }
            top++;

            for(i=top;i<=bottom;i++)
            {
                order.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom)
            {
                for(i=right;i>=left;i--)
                {
                    order.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right)
            {
                for(i=bottom;i>=top;i--)
                {
                    order.add(matrix[i][left]);
                }
                left++;
            }
        }
        return order;
    }
}