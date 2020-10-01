//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class HexToBinary
{
    private static String Binary;
	public String getBinary(char hex)
	{
        switch(hex){
            case 'A': Binary = "01000001"; break; 
            case 'B': Binary = "01000010"; break; 
            case 'C': Binary = "01000011"; break; 
            case 'D': Binary = "01000100"; break; 
            case 'E': Binary = "01000101"; break; 
            case 'F': Binary = "01000110"; break; 
            case 'a': Binary = "01100001"; break; 
            case 'b': Binary = "01100010"; break; 
            case 'c': Binary = "01100011"; break; 
            case 'd': Binary = "01100100"; break; 
            case 'e': Binary = "01100101"; break; 
            case 'f': Binary = "01100110"; break; 
            default: Binary = "ERROR"; break;
        }
		return Binary;
	}
}