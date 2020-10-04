package while1;
class While1{
    public static void main(String args[]){
        int a=1;
        while(a<=5){
            int b=1;
            while(b<=a){
                System.out.print(a+"");
                b++;
            }
            System.out.println("");
            a++;
        }
    }
}