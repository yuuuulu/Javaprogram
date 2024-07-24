import java.util.Scanner;
import javax.swing.JOptionPane;

public class First {

    public static void main(String[] args) {



        
       // package of jumping "chat frame"
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"You are "+age+"years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null,"You are "+height+"cm tall");











        //expression = operands & operators
        // operands= values, variables, numbers,quantity
        //operators = +_*/%

        //int friends = 10;

        //friends = friends % 3; //reminder

        //System.out.println(friends);


        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name =scanner.nextLine();
        System.out.println("How ole are you? ");
        int age= scanner.nextInt();
        scanner.nextLine(); // clear the scanner for us
        System.out.println("What is your favorite food?");
        String food=scanner.nextLine();

        // the nextLine() will read the entire line(when we press enter it is similarto put\n to add a new line)
        // but int will not read the entire line, which means excluding \n
        //so the left/n was supposed by computers as a stop
        //so we add scanner.nextLine();



        System.out.println("Hello "+name);
        System.out.println("You are  "+age+" years old");
        System.out.println("You like "+food);






        //System.out.println("I love pizza");
        //System.out.println("It is really good！");

        // this is notes

        /*
         *this
         * is
         * a
         *
         *
         *
         */

        /*
         *int x = 123; //initialization
         *float y =3.14f;
         *boolean z =true;
         *char symbol='@';
         *String name="Bro";

         *System.out.println("My number is:"+name);

         */

         /*
          *String x="water";
          *String y="Kool-aid";
          *String temp;

          *temp =y;
          *y=x;
          *x=temp;


          *System.out.println("x: "+x);
          *System.out.println("y: "+y);


          */







    }
}
