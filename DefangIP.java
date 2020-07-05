import java.util.*;

public class DefangIP {
	public String defangIPaddr1(String address) {
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
	
	public String defangIPaddr2(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
