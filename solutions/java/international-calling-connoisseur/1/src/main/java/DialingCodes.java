import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DialingCodes {
    
    Map<Integer, String> dialingList = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return dialingList;
    }

    public void setDialingCode(Integer code, String country) {
        dialingList.put(code, country);
    }

    public String getCountry(Integer code) {
return dialingList.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (dialingList.containsValue(country) || dialingList.containsKey(code))
            return;
        dialingList.put(code, country);

    }

    public Integer findDialingCode(String country) {
        return dialingList.entrySet()
        .stream()
        .filter(p -> p.getValue().equals(country))
        .map(Map.Entry::getKey)
        .findFirst()
        .orElse(null);
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if (!dialingList.containsValue(country))
            return;
        Integer existingCode = findDialingCode(country);
        dialingList.remove(existingCode);
        dialingList.put(code, country);
    }
}
