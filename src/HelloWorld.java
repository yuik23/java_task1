public class HelloWorld {
    public static void main(String[] args) {
        //1回出力
                System.out.println("1回出力");
                System.out.println("HelloWorld");
        //10回出力
                for(int cnt=1;cnt<=10;cnt++){
                    if( cnt==1){
                        System.out.println("10回出力"+"\n"+"HelloWorld");
                    }else{
                        System.out.println("HelloWorld");
                    }
                }
    }

}
