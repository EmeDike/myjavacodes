package Chapter7;

public class CountDigitsInStrings {
    public static int countDigitsStrings(String[] strings) {
        int digitCount = 0;

        for (String string : strings) {
            for (int index = 0; index < string.length(); index++) {
                char number = string.charAt(index);
                if (number >= '0' && number <= '9') {
                    digitCount++;
                }
            }
        }
        return digitCount;
    }
}









               // String convert = String.valueOf(number);

                //if(convert.matches("\\d+")){
                //    name.append(convert);
               // }
           // }
        //}

       //return name.length();
    //}

//


