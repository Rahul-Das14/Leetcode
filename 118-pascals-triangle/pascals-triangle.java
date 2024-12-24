class Solution {
    public static int num(int row, int col)
    {
        int i;
        long res=1;
        for(i=0;i<col;i++)
        {
            res=res*(row-i);
            res=res/(i+1);
        }
        return (int) res;
    }


    public List<List<Integer>> generate(int numRows) {

        int i,j;
        List<List<Integer>> ans = new ArrayList<>();
        for(i=1;i<=numRows;i++)
        {
            List<Integer> templist = new ArrayList<>();
            for(j=1;j<=i;j++)
            {
                templist.add(num(i-1,j-1));
            }
            ans.add(templist);
        }

        return ans;
    }
}