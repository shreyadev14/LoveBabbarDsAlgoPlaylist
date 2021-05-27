import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class ReverseAnArray 
{
 public static void main (String args[]) throws IOException

 {InputStreamReader in = new InputStreamReader(System.in);
  BufferedReader br =new BufferedReader(in);
  String [] st=br.readLine().split(" ");
  int length=st.length;
    
  int[] arr=new int[length];
 
 for (int i=0;i<length;i++)
  { arr[i]=Integer.parseInt(st[i]);
  }


  

  
  int start,end;
 
   start =0;
   end=length-1;
 
   while(start<end)
  {arr[start]=arr[start]^arr[end];
   arr[end]=arr[start]^arr[end];
   arr[start]=arr[start]^arr[end];
   start++;end--;
  }

  for(int i=0;i<length;i++)
  {System.out.print(arr[i]+" ");
  }   
  
 }
}
