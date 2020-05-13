 static int sherlockAndAnagrams(String s) {
            int n=s.length();
            Map<String ,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
         {
             for(int j=i+1;j<=n;j++)
              {
                   String t=s.substring(i,j);
                   System.out.println(t);
                    char a[]=t.toCharArray();
                    Arrays.sort(a);
                    t=String.valueOf(a);
                    if(!mp.containsKey(t))
                       mp.put(t,0);
                       mp.put(t,mp.get(t)+1);
              }
         }
            int ct=0,no=0,tmp=0;
            for(Map.Entry i:mp.entrySet())
                    {    tmp=0;
                        no=(int)i.getValue();
                        for(int j=1;j<no;j++)
                            tmp=tmp+j;
                            ct=ct+tmp;
                    }
          System.out.println(mp);
         return ct;
    }
