package io.github.ecubi.core.util;

import org.bson.types.ObjectId;

public class IdGenerator {
    public static String generateDomainId(){
        return new ObjectId().toString();
    }
}
