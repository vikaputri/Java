package pbo;

public class PBO {

    public static void main(String[] args) {
        outerLoop:
            for( int i=1; i<4; i++ ){
                for( int j=1; j<5; j++ ){
                    System.out.println("inside for (j) loop"); //message1
                    if( j == 2 ) continue outerLoop;
                }
                System.out.println("loop i"); //message2
            }
    }
    
}
