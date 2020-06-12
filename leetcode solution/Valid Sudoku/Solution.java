class Solution {
    public boolean isValidSudoku(char[][] c) {
         for(int i=0;i<9;i++)
         {
               
             HashSet<Character> hs=new HashSet<>();
               for(int j=0;j<9;j++)
               {
                   if(c[i][j]!='.')
                   {
                       if(hs.contains(c[i][j]))
                            return false;
                       else
                            hs.add(c[i][j]);
                   }
               }
             
         }
         for(int i=0;i<9;i++)
         {
               
             HashSet<Character> hs=new HashSet<>();
               for(int j=0;j<9;j++)
               {
                   if(c[j][i]!='.')
                   {
                       if(hs.contains(c[j][i]))
                            return false;
                       else
                            hs.add(c[j][i]);
                   }
               }
             
         }
           
             
         for(int i1=0;i1<9;i1=i1+3)
         {
             for(int j1=0;j1<9;j1=j1+3)
             {    
                 HashSet<Character> hs=new HashSet<>();
                 for(int i=i1;i<i1+3;i++)
                {
                 for(int j=j1;j<j1+3;j++)
                 {
                 if(c[i][j]!='.')
                   {
                       if(hs.contains(c[i][j]))
                            return false;
                       else
                            hs.add(c[i][j]);
                   }
                 }
             } 
             }
         }
            
        return true;
    }
}
