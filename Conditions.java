public class Conditions {
    public static void main(String[] args){
    int sal= 2000;
    //if else

//    if (sal<5000){
//        sal=sal+500;
//    }
//    else{
//        sal=sal+700;
//    }

     //multiple if else
     if (sal>7000){
         sal += 300;
     }
     else if(sal>8000){
         sal += 400;
     }
     else{
         sal += 100;
     }

    System.out.println(sal);
    }
}
