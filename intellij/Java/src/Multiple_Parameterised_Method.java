public class Multiple_Parameterised_Method {
    public static void main(String args[]) {

    int a,b,c;
        add(a= 23, b= 54, c= 64);
    }

    public static void add(int a,int b,int c) {
        int sum;
        sum = a+b+c;

        System.out.println("sum of the "+a+"and"+b+"and"+c+"is: "+sum);
    }

}
