package Singleton_Enum;

public enum SingletonEnum {

    INSTANCE;

    public void giveGods(){
	System.out.println(INSTANCE.hashCode() + " is giving Gods to kids.");	
    }
    
}