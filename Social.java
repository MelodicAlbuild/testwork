
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

public class Social
{
    private int compile;
	public int chopAndAdd( String socialNum )
	{
        if(socialNum.contains("-")) {
            if(socialNum.lastIndexOf('-') != socialNum.indexOf('-')) {
                //Find Hyphens
                int check1 = socialNum.indexOf('-');
                int check2 = socialNum.lastIndexOf('-');
                //Gather Numbers - Hyphens
                String build1 = socialNum.substring(0, check1);
                String build2 = socialNum.substring(check1 + 1, check2);
                String build3 = socialNum.substring(check2 + 1, socialNum.length());
                //ParseInts
                int parse1 = Integer.parseInt(build1);
                int parse2 = Integer.parseInt(build2);
                int parse3 = Integer.parseInt(build3);
                //Compile Answer
                compile = parse1 + parse2 + parse3;
            } else {
                compile = -1;
            }
        } else {
            compile = -1;
        }
        return compile;
	}
}