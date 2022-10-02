public class cu{

 static int fibo(int sayi){
    
        if(sayi==1) return 1;
        if(sayi==2) return 1;

        else 
        return fibo(sayi-1)+fibo(sayi-2);
 }

    public static void main(String[] args) {
     
        System.out.println(fibo(4)); 
    }



}
