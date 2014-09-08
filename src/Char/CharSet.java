package Char;

public class CharSet {
	
	private char[] chars;
	int count = 0;
	int a =0;
	String end = "";
	
	public CharSet(){
		
		chars = new char[100];
		
	}
	
	public void insert(char ch) {
		
		if (contains(ch) == false)
		{
				chars[count] = ch;
				count++;	
		}
	}
	
	public boolean contains (char ch){
		
		for(int i = 0; i <= count; i++){
			if (chars[i] == ch)
				return true;
		}
		return false;
	}
	
	public String toString()
	{
		for(int k = 0; k < count ; k++){
		end += Character.toString(chars[a]);
		end += " ";
		a++;
		}
		return end;
	}

}
