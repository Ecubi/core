package io.github.ecubi.core.util;

import org.apache.commons.lang3.StringUtils;

public class StringsUtils {
    public static final int MAX_LENGTH = 255;

    public static String generateLongString(){
         return StringsUtils.generateLongString(MAX_LENGTH+1);
    }

    public static String generateLongString(int lenght){
        return StringUtils.repeat("*", lenght);
    }
}
