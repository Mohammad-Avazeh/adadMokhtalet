package mokhtalet;

public class AdadMokhtalet {
    private int bakhsh_Haghighy , bakhsh_mohomi;

    public AdadMokhtalet(){
        bakhsh_Haghighy=0 ;
        bakhsh_mohomi=0;
    }
    public AdadMokhtalet(int haghighy){
        bakhsh_Haghighy=haghighy;
        bakhsh_mohomi=0;
    }
    public AdadMokhtalet(String mohomi){
        bakhsh_Haghighy=0;
        bakhsh_mohomi =convertInt(mohomi);
        //System.out.println(bakhsh_mohomi);

    }
    public AdadMokhtalet(int haghighy , int mohomi){
        bakhsh_Haghighy=haghighy;
        bakhsh_mohomi=mohomi;
    }



    public int convertInt(String mohomiValue) {
        String[] list = mohomiValue.split("i", 2);
        int bakshMohomi = Integer.parseInt(list[0]);

        return bakshMohomi;
    }
//------------------------------------------------------------------------------------------------------------------
    public AdadMokhtalet add( AdadMokhtalet number2){
        /**
         * علت اینکه x را تعریف می کنیم این است که جمع دو عدد مختلط باید در یک مختلط باشد.
         * x برای این تعریف شده که این کار جمع کردن را انجام دهد.
         */
        AdadMokhtalet x = new AdadMokhtalet();

        /**
         * در bakhsh_haghighy یا اولین عبارت پس از مساوی ، مربوط به number 1 در کلاس اصلی می باشد. که باید با همین مقدار در number 2 جمع شود.
         * سپس این مقدار را باید در یک همان متغیر از شی سوم بریزد.
         * در واقعیت باید قسمت های موهومی با هم جمع شوند و قسمت های حقیقی هم با هم جمع شوند. پس این نتایج در آنجا نوشته می شود.
         * اطلاعات جدید در متغیر مربوط به شی number 3 ذخیره می شود.(همان شی ای که قرار است دو شی را با هم جمع کند)
         */

        x.bakhsh_Haghighy = bakhsh_Haghighy+number2.bakhsh_Haghighy;
        x.bakhsh_mohomi = bakhsh_mohomi + number2.bakhsh_mohomi;
        return x;
    }
//****************************************************************************************************************
    public AdadMokhtalet tafriq(AdadMokhtalet number2){
        AdadMokhtalet y= new AdadMokhtalet(3,48);
        y.bakhsh_Haghighy=bakhsh_Haghighy-number2.bakhsh_Haghighy;
        y.bakhsh_mohomi=bakhsh_mohomi-number2.bakhsh_mohomi;
        return y;
    }
//--------------------------------------------------------------------------------------------------------------
    public int get_Bakhsh_Haghighy(){
        return bakhsh_Haghighy;
    }
    public int get_baksh_mohomi(){
        return bakhsh_mohomi;
    }
//------------------------------------------------------------------------------------------------------------------
    public void print_Number(){
        System.out.println("number is : \""+bakhsh_Haghighy + " + i("+bakhsh_mohomi+ ") \"");
    }

}
