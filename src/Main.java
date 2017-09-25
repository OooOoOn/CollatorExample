import java.text.Collator;

public class Main {

    public static void main(String[] args) {
        String name1 = "Rodriguez, Miguel";
        String name2 = "Rodriguez, Miguel";

        //compares strings and sorts them in alphabetical order
        Collator c = Collator.getInstance();
        c.setStrength(Collator.PRIMARY);

        if(c.compare(name1, name2) < 0){
            System.out.println(name1 + name2);
        }
        else if(c.compare(name1, name2) > 0){
            System.out.println(name2 + name1);
        }
        else{
            System.out.println(name1 + " has the same position as " + name2);
        }

    }

}
