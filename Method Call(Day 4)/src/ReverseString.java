
public class ReverseString {

	 
	    public static void main(String args[])
	    {
	    	
	        String word="applepie";
	        char alpha;
	        String rev="";
	        int len=word.length();
	        
	        for (int i=0; i<len;i++)
	        {
	           
	            alpha=word.charAt(i);
	            rev=alpha+rev;
	        }
	        System.out.println(rev);
	    }

}
