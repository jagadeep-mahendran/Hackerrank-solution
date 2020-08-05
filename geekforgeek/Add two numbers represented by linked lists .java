class Solution{
     
     static Node reverse(Node head)
      {
          if(head==null)
             return null;
            Node prev=null;
            Node cur =head;
            Node nxt=null;
            while(cur!=null)
             {
                 nxt=cur.next;
                 cur.next=prev;
                 prev=cur;
                 cur=nxt;
                 
             }
             head=prev;
             return head;
      }
    static Node addLists(Node first, Node second){
        
          if(first==null&&second==null) return null;
          else if(first==null)          return second;
          else if(second==null)         return first;
          
          first=reverse(first);
          second=reverse(second);
          Node res=null;
          Node resend=null;
          int c=0;
          while(first!=null&&second!=null)
           {  
                int x= first.data+second.data+c;
                   if(x>9)
                       x=x%10;
                        
                if(res==null)
                 {   
                      
                     res=new Node(x);
                     resend=res;
                 }
                 else
                 {
                     resend.next=new Node(x);
                     resend=resend.next;
                 }
                 if((first.data+second.data+c)>9)   c=1;
                 else                               c=0; 
                     
                  first=first.next;
                  second=second.next;
           }
           while(first!=null){
               int x=first.data+c;
              if((first.data+c)>9)
                 x=x%10;
                resend.next=new Node(x);
                resend=resend.next;
                if((first.data+c)>9)   c=1;
                 else                   c=0; 
                 first=first.next;
           }
              while(second!=null)
              {
                  int x=second.data+c;
                  if((second.data+c)>9)
                    x=x%10;
                    resend.next=new Node(x);
                    resend=resend.next;
                    if((second.data+c)>9)   c=1;
                     else                    c=0; 
                     second=second.next;
              }
               
              if(c==1)
                    resend.next=new Node(1);
                    
        return reverse(res);  
          
   }
}

