package ReplitTry;
/*Complete the method so that it takes in a 2-D array and returns the sums of the rows as an integer array.

        For example, the if we run rowSums for the following 2D array:
        {
        {1,1,2}, //sum = 4
        {3,1,2}, //sum = 6
        {3,5,3}, //sum = 11
        {0,1,2}  //sum = 3
        }


        Then we should get the following array back:
        {4,6,11,3}*/
public class R231_RowSum
    {
        public static void main(String[] args)
        {
            int[][] a = {
                    {1,1,2}, //sum = 4
                    {3,1,2}, //sum = 6
                    {3,5,3}, //sum = 11
                    {0,1,2}  //sum = 3
            };

            int[] sums = rowSums(a);

            for(int sum : sums)
                System.out.println(sum);
            //this should print 4 6 11 3
        }

        public static int[] rowSums(int[][] nums)
        {
            int[] b=new int[nums.length];

            for(int i=0; i<=nums.length-1;i++){

                for(int j=0; j<=nums[i].length-1;j++){
                    b[i]+=nums[i][j];

                }


            }


            return b;
        }
    }
