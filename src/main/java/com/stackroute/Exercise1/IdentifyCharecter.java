package com.stackroute.Exercise1;

public class IdentifyCharecter {
    public String Charecter(char c)
    {


        if(Character.isLowerCase(c))
        {
            return "Small Letter";
        }
        else if(Character.isUpperCase(c))
        {
            return "Capital Letter";
        }
        else if(Character.isDigit(c))
        {
            return "Digit";
        }
        return "SpecialCharacter";
    }
}
