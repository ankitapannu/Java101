package main;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// https://leetcode.com/problems/defanging-an-ip-address/

public class LC1108_DefangIP {
	public static String defangIPaddrV1(String address) {
        String result = "";
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                result += "[.]";
            } else {
                result += address.charAt(i);
            }
        }
        return result;
    }
	
	public static String defangIPaddrV2(String address) {
        return address.replaceAll("\\.", "[.]");
    }
	
	public static String defangIPaddrV3(String address) {
		Stream<String> strStream = address.codePoints().mapToObj(c -> String.valueOf((char) c));
		return strStream.map(s -> s.equals(".") ? "[.]" : s).collect(Collectors.joining());
    }
	
	public static String defangIPaddrV4(String address) {
        String result = "";
        for (char c : address.toCharArray()) {
            if (c == '.') {
                result += "[.]";
            } else {
                result += c;
            }
        }
        return result;
    }
}
