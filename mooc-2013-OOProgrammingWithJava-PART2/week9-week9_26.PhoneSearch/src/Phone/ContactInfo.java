package Phone;

import java.util.*;

public class ContactInfo {

    private Map<String, Set<String>> phoneNumbers = new HashMap<String, Set<String>>();
    private Map<String, Set<String>> addresses = new HashMap<String, Set<String>>();

    public void addPhoneNumber(String name,String number){
        if(!this.phoneNumbers.containsKey(name)) {
            this.phoneNumbers.put(name, new HashSet<String>());
        }

        Set<String> numbers = this.phoneNumbers.get(name);
        numbers.add(number);
    }

    public String getNumber(String name){
        String result = "";
        if(!phoneNumbers.containsKey(name)){
            result += "  not found";
        }else{
            for(String num : phoneNumbers.get(name)){
                result += "   " + num + "\n";
            }
        }
        return result;
    }

    public String getPerson(String number){
        String result = " not found";

        for(String name : phoneNumbers.keySet()) {
            if (phoneNumbers.get(name).contains(number)) {
                result = name;
            }
        }
        return result;
    }

    public void addAddress(String name, String address){
        if(!this.addresses.containsKey(name)) {
            this.addresses.put(name, new HashSet<String>());
        }

        Set<String> addr = this.addresses.get(name);
        addr.add(address);
    }

    public String personLookup(String name){
        String result = "";
        if(!addresses.containsKey(name) && !phoneNumbers.containsKey(name)){
            result += "  not found";
        }else if(!addresses.containsKey(name)){
            result += "  address unknown\n" + "  phone numbers:\n";
            for(String num : phoneNumbers.get(name)){
                result += "   " + num + "\n";
            }
        }else if(!phoneNumbers.containsKey(name)){
            result += "  address: \n";
            for(String addr : addresses.get(name)){
                result += "   " + addr + "\n";
            }
            result += "  phone number not found";
        }else{
            result += "  address: \n";
            for(String addr : addresses.get(name)){
                result += "   " + addr + "\n";
            }
            result += "  phone numbers:\n";
            for(String num : phoneNumbers.get(name)){
                result += "   " + num + "\n";
            }
        }
        return result;
    }

    public void removePerson(String name){
        phoneNumbers.remove(name);
        addresses.remove(name);
    }

    public List<String> search(String term){
        List<String> result = new ArrayList<String>();
        for(String key : addresses.keySet()){
            if(key.contains(term) || addresses.get(key).toString().contains(term)){
                result.add(key);
            }
        }
        for(String key : phoneNumbers.keySet()){
            if(key.contains(term)){
                if(!result.contains(key)){
                    result.add(key);
                }
            }
        }
        Collections.sort(result);
        return result;
    }
}
