class Book{
    public void setTitle(){
        String Title,  Author;  int year;
       /*  System.out.println("Author is :"+ Author);
        System.out.println("Title is :"+title);*/
    }
   /* public Book(String title, String author){
        this.Title=title;
        this.Author=author;

    }*/
    public double fine(int age, int rate, int days){
        double dueFine;
        if(age<=18){
            dueFine=0.5*days*rate;
            System.out.println("dueFine is "+dueFine);
        }
        else {
            dueFine=rate*days;
            System.out.println("dueFine is "+dueFine);
        }
        return dueFine;

    }
    public void pattern(){
        int i,j;
        for(i=7;i>0;i--){
            for(j=1;j<=i;j++){
                System.out.println("*\t");
            }
            System.out.println();
        }
    }
}

public class Revision {
    public static void main(String[] args) {
       Book user=new Book();
       user.fine(17, 20, 16);
       user.pattern();
    }
    
}
