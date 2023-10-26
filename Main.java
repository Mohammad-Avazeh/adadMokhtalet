package mokhtalet;

public class Main {
    public static void main(String[] args){
        AdadMokhtalet number1 = new AdadMokhtalet(-5,5);
        AdadMokhtalet number2 = new AdadMokhtalet(9 ,-12);
        /**
         * مشخصات این شی جدید ساخته و درون این شی ذخیره می شود.
         * در صورت لزوم برای دسترسی به هر بخش آن از تابع های get استفاده می کنیم.
         */
        AdadMokhtalet number3 =number1.add(number2);

        System.out.println("adad az jam is : \""+ number3.get_Bakhsh_Haghighy() + " + i ("+ number3.get_baksh_mohomi()+")  \"");

        AdadMokhtalet aa=new AdadMokhtalet("-6i");
        AdadMokhtalet number4=number1.tafriq(aa);
        number4.print_Number();

        System.out.print("*****\nnumber1 = ");
        number1.print_Number();
        System.out.print("\nnumber2 = ");
        number2.print_Number();
        System.out.print("\nnumber3 = ");
        number3.print_Number();
        System.out.print("\nnumber4 = ");
        number4.print_Number();
        System.out.println("******");

    }
}
