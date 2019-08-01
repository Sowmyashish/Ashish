package Cisco;

/**
 * Created by ashishsowmya on 6/26/19.
 */
public class ValidateIpAddress
{
    public String validate(String IP)
    {
        String[] ipv4 = IP.split("\\.");
        String[] ipv6 = IP.split("\\:");
        if(ipv6[0] != IP)
        {
            //write code for examining if it is ipv6 or not
            if(ipv6.length != 8)
                return "Niether";
            for(String str:ipv6)
            {
                if(str == "") return "Neither";
            }
            return "ipv6";
        }
        else
        {
            //write code for examining if it is pv4 or not
            if(ipv4.length != 4)
                return "Neither";
            for(String str:ipv4)
            {
                try
                {
                    int val = Integer.valueOf(str);
                    if(val > 255) return "Neither";
                    else
                    if(str.charAt(0) == '0' || str == "") return "Neither";
                }
                catch(NumberFormatException ex)
                {
                    return "Neither";
                }

            }
            return "ipv4";

        }
    }


    public String valid(String IP)
    {
        if(isValidIPv4(IP)) return "IPv4";
        else if(isValidIPv6(IP)) return "IPv6";
        else return "Neither";
    }

    public boolean isValidIPv4(String ip)
    {
        int l = ip.length();
        if(ip.length()<7) return false;
        if(ip.charAt(0)=='.') return false;
        if(ip.charAt(ip.length()-1)=='.') return false;
        String[] tokens = ip.split("\\.");
        if(tokens.length!=4) return false;
        for(String token:tokens) {
            if(!isValidIPv4Token(token)) return false;
        }
        return true;
    }
    public boolean isValidIPv4Token(String token) {
        if(token.startsWith("0") && token.length()>1) return false;
        try {
            int parsedInt = Integer.parseInt(token);
            if(parsedInt<0 || parsedInt>255) return false;
            if(parsedInt==0 && token.charAt(0)!='0') return false;
        } catch(NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public boolean isValidIPv6(String ip) {
        if(ip.length()<15) return false;
        if(ip.charAt(0)==':') return false;
        if(ip.charAt(ip.length()-1)==':') return false;
        String[] tokens = ip.split(":");
        if(tokens.length!=8) return false;
        for(String token: tokens) {
            if(!isValidIPv6Token(token)) return false;
        }
        return true;
    }
    public boolean isValidIPv6Token(String token) {
        if(token.length()>4 || token.length()==0) return false;
        char[] chars = token.toCharArray();
        for(char c:chars) {
            boolean isDigit = c>=48 && c<=57;
            boolean isUppercaseAF = c>=65 && c<=70;
            boolean isLowerCaseAF = c>=97 && c<=102;
            if(!(isDigit || isUppercaseAF || isLowerCaseAF))
                return false;
        }
        return true;
    }


    public static void main(String args[])
    {
        ValidateIpAddress obj  = new ValidateIpAddress();
      String result=  obj.valid("1.4.5.6");
        System.out.println(result);

    }
}
