package Feb9;

public class MethodOverloading {
    static void myName(String userName){
        System.out.println(userName);
    }

    static void myName(String userName,int number){
        System.out.println(userName + number );
    }

    public static void main(String[] args) {
        String name = "Raju";
        int num =78;
        myName(name);
        myName(name,num);
    }
}
