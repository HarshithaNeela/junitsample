
public class deleteacharclass 
{

	public String deletefunc(String string) 
	{
		String remainingchars=string;
		char firstchar,lastchar;
		int stringLength=string.length();
		if(stringLength==0)
		remainingchars= string;
		else	if(stringLength==1) {
			firstchar=string.charAt(0);
			if(firstchar=='A')
				remainingchars= "";
			else remainingchars= string;
			}
		else 
       {
		firstchar=string.charAt(0);
	    lastchar=string.charAt(1);
	   if(firstchar=='A')
	   {
		   remainingchars=string.substring(1,stringLength);
		   firstchar=remainingchars.charAt(0);
		   if(firstchar=='A')
			   remainingchars=remainingchars.substring(1,stringLength-1);
	   }
	   else
	   {
		   if(lastchar=='A')
			  remainingchars=firstchar+""+remainingchars.substring(2,stringLength);
	   }
		
		}return remainingchars;
	}
}
