package com.series;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted object-oriented high-level programming with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("Basic", "Beginners All Purpose Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        System.out.println(languages.get("Java"));
        languages.put("Java", "this course is about java");
        System.out.println(languages.get("Java"));

        System.out.println("=======================");
        for(String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
        languages.remove("Java", "as");
    }
}
