import java.util.TreeMap;

public class CheckKeyOfTreeMapExample {
	  public static void main(String[] args) {
		   
		    //create TreeMap object
		    TreeMap<String, String> treeMap = new TreeMap<String, String>();
		   
		    //add key value pairs to TreeMap
		    treeMap.put("1","One");
		    treeMap.put("2","Two");
		    treeMap.put("3","Three");
		   
		    /*
		      To check whether a particular key exists in TreeMap use
		      boolean containsKey(Object key) method of TreeMap class.
		      It returns true if the TreeMap contains mapping for specified key
		      otherwise false.
		    */
		   
		    boolean blnExists = treeMap.containsKey("1");
		    System.out.println("1 exists in TreeMap ? : " + blnExists);
		  }

}
