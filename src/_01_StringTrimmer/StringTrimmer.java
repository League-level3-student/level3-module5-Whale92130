package _01_StringTrimmer;

public class StringTrimmer {

    /*
     * This method removes the specified number of characters from the right
     * side of the specified string and returns the trimmed string. 
     */
    static public String trimString(String str, int removesLeft) {
        // 1. If there are no removes left
    	if (removesLeft > 0) {
            StringBuilder build = new StringBuilder();
            build.append(str);
            build.deleteCharAt(build.length()-1);
            removesLeft--;
            return(trimString(build.toString(), removesLeft));
    	}
    	else {
    		return str;
    	}
            // 2. Return the string

        // 3. Else you need to remove the last letter from the string,
        //    reduce removesLeft by 1, and then call trimString() 
    }
}
