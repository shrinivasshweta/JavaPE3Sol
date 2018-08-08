package com.stackroute.demo.PE3;
			
			/*public class Vovel {
			
				public String[] getVovel(String[] countries) {
					for(int j=0;j<countries.length;j++) {
						countries[j].replace("a|e|i|o|u","");
					}
				return countries;
				}
			    
				}*/
				
				/*public class Vovel {
					public String[] getVovel(String[] countries) {
				
				String[] vowels = new String[5];
				
				vowels[0] = "a";
				vowels[1] = "e";
				vowels[2] = "i";
				vowels[3] = "o";
				vowels[4] = "u";
				
				String[] res= new String[5];
				int k=0;
				for (int i = 0; i < countries.length; i++)
				 {
				    String country = countries[i];
				
				    for (int j = 0; j < vowels.length; j++)
				    {
				        country = countries[i].replace(vowels[j],"");
				    }
				    res[k]=country;
				    k++;}
				return res;
				}
				}*/

public class Vovel {
	
	public String[] getVovel(String[] st) {
		int len=st.length;
		for(int i=0;i<len;i++)
		{
			st[i]=st[i].replaceAll("[aeiou]", "");
		}
		return st;
	}

}
