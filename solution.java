
package com.google.challenges;
import java.util.regex.Pattern;
import java.util.Arrays;
public class Answer {   
    public static String[] answer(String[] l) {    
        int i,j;
        for(i=0;i<l.length;i++)
        {
            for(j=0;j<l.length;j++)
            {
            //Tokenization of given strings
    		    String[] a= l[i].split(Pattern.quote("."));
	    	    String[] b= l[j].split(Pattern.quote("."));

    		    if(Integer.parseInt(a[0])<Integer.parseInt(b[0]))
	    	    {	
		            String temp = l[i];
			        l[i] = l[j];
			        l[j] = temp;				
        		}
	        	else if(Integer.parseInt(a[0])==Integer.parseInt(b[0]))
		        {
			        if(a.length>1 && b.length>1)
			        {
			            if(Integer.parseInt(a[1])<Integer.parseInt(b[1]))
				        {
					        String temp = l[i];
					        l[i] = l[j];
					        l[j] = temp;
			    	    }
				        else if(Integer.parseInt(a[1])==Integer.parseInt(b[1]))
    				    {
	    				    if(a.length>2 && b.length>2)
		    			    {			
			    		    	if(Integer.parseInt(a[2])<Integer.parseInt(b[2]))
				    		    {
					    		    String temp = l[i];
						    	    l[i] = l[j];
							        l[j] = temp;
						     }
					        }
					        else
					        {
						        if(a.length<b.length)
						        {
							     String temp = l[i];
							     l[i] = l[j];
							     l[j] = temp;		
						        }
					        }
				        }   
			        }
			        else
			        {
				        if(a.length<b.length)
				        {
				        	String temp = l[i];
				    	    l[i] = l[j];
				    	    l[j] = temp;		
				        }
			        }	
    		    }
            }
        }
        return l;
    } 
}
