import java.util.HashMap;
public class EmployeeId {
    public static void main(String[] args){
        HashMap<String , Integer> empIds = new HashMap<>();
        empIds.put("Hafsa", 67353);
        empIds.put("Hossei", 85644);
        empIds.put("Azra", 298266);
        System.out.println(empIds);
        System.out.println(empIds.get("Hafsa"));
        System.out.println(empIds.containsKey("Hossei"));
        System.out.println(empIds.containsKey("Kay"));
        System.out.println(empIds.containsValue(85644));
        System.out.println(empIds.containsKey("862756"));
        empIds.put("Hafsa", 98632);
        System.out.println(empIds);
        empIds.replace("Hafsa", 821367);
        System.out.println(empIds);
        empIds.replace("Kay", 902389);
        System.out.println(empIds);
        empIds.putIfAbsent("Hafsa", 293246);
        System.out.println(empIds);
        empIds.putIfAbsent("Sarah", 293246);
        System.out.println(empIds);
        empIds.remove("Sarah");
        System.out.println(empIds);
    }
}
