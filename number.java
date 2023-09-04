class Solution
 {
    public static void main(String[] args) 
    {
        int array[]=new int[]{999};
        int array1[]=new int[3];
        array1=plusOne(array);
    
        for(int i=0;i<3;i++)
        {
            System.out.println(array1[i]+" ");
        }
        
    }
        public static int[] plusOne(int[] digits)
            {
                for(int i=digits.length-1;i>=0;i--)
                {
                    if(digits[i]<9)
                    {
                        digits[i]++;
                        return digits;
                    }
                    digits[i]=0;
                }
                digits=new int[digits.length+1];
                digits[0]=1;
                return digits;
            }        
    
 }
