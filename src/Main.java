public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for( int i =1; i<=10; i++){
            System.out.println(i);
        }
        System.out.println("Задача 2");
        for(int i=10;i>0;i--){
            System.out.println(i);
        }
        System.out.println("Задача 3");
        for(int i=0;i<17;i=i+2){
            System.out.println(i);
        }
        System.out.println("Задача 4");
for(int i=10;i>=-10;i--)
{
    System.out.println(i);
}
        System.out.println("Задача 5");
for (int i=1904;i<=2096;i=i+4){
    System.out.println(i+" год является високосным");
}
        System.out.println("Задача 6");
        for(int i=7;i<99;i=i+7) {
            System.out.println(i);
        }
        System.out.println("Задача 7");

        for(int i=1;i<=512;i=i*2){
            System.out.println(i);
        }
        System.out.println("Задача 8");
        int salaryMonth=29000;
        float saving=0f;
        for (int month=1; month<=12;month++) {
            saving=saving+salaryMonth;

            System.out.println("Месяц " + month + " ,сумма накоплений равна " + saving + " рублей");

        }
        System.out.println("Задача 9");

        for (int month=1; month<=12;month++) {
            saving = saving + saving/100 ;
            saving = saving + salaryMonth;
            System.out.println("Месяц " + month + " ,сумма накоплений равна " + saving + " рублей");
        }
        System.out.println("Задача 10");
        int namber=2;

for (int i=1;i<=10;i++){
    int result=namber*i;
    System.out.println(namber+ "*"+i+"="+result);
}
    }
}