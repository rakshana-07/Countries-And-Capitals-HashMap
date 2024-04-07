package day4;
import java.util.HashMap;


class Country {
    private HashMap<String, String> countryMap;

    public Country() {
        countryMap = new HashMap<>();
    }

    public void add(String cname, String capname) {
        countryMap.put(cname.toLowerCase(), capname);
    }

    public String search(String cname) {
        if (countryMap.isEmpty()) {
            return "The map is empty";
        }

        String capital = countryMap.get(cname.toLowerCase());
        if (capital == null) {
            return "Data not found";
        }
        return capital;
    }
}
