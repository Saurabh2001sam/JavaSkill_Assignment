import java.util.InputMismatchException;
import java.util.Scanner;

class ExceptionA {
    public static void main(String[] args) {

        int obt, total;
        int per = 0;

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter marks you scored");
            obt = sc.nextInt();
            System.out.println("Enter total marks");
            total = sc.nextInt();
            per = (obt / total) * 100;
            System.out.println("Percentage : " + per);
            sc.close();
        } catch (InputMismatchException im) {
            System.out.println(im.getMessage());
        } catch (NumberFormatException nf) {
            System.out.println(nf.getMessage());
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}