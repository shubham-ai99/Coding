package Arrays;

public class Arr {

    /*
        Array declaration, instantiation, initialization
        how to add members to array
        how to traverse array
        how to print array

     */

    public static void main(String[] args){
        int a[]=new int[4];//declaration and instantiation
        a[0]=10;//initialization
        a[1]=20;
        a[2]=70;
        a[3]=40;

        System.out.println("Array elements ");
        //traversing array
        for(int i=0;i<a.length;i++)//length is the property of array
            System.out.println( + a[i]);

        System.out.println();


        System.out.println("b Array elements ");
        int b[]={11,22,33,44};//declaration, instantiation and initialization
        for(int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }

        System.out.println();

        System.out.println("c Array elements using for-each");
        int c[]={3,6,9};
        for (int i:c) {//for-each
            System.out.println(i);
        }

        System.out.println("d Array elements ");


        int d[]={1,2,3,4,5};
        for( int i:d){
            System.out.println(i);
        }

    }
}
