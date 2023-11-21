public class Singleton {
    // Instance of Singleton class
    private static Singleton instance;

    // Variables to hold a String and an Environment object
    private String str;
    private Environment environment;

    // Private constructor to prevent instantiation
    private Singleton() {
        str = "";
        environment = new Environment();
    }

    // Method to get the instance of Singleton class
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public Environment getEnvironment(){
        return environment;
    }

    public void setStr(String in){
        str = in;
    }

    // Getter and setter for the String
    public String getStr() {
        return str;
    }
}