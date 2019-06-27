package com.stackroute.Exercise1;


public class VowelConsonant{
    public  String Check(String s)
    {
        String result="";
        for(int i=0;i<s.length();i++)
        {
            char  c=s.charAt(i);
            if( (c >= 'a' && c<= 'z') || (c >= 'A' && c<= 'Z'))
            {
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||
                        c=='I'||c=='O'||c=='U')
                {
                    result+= "Vowel";
                }
                else
                {
                    result+= "Consonant";
                }

            }
            else
            {
                result+="Error";
            }

        }
        return result;
    }
}