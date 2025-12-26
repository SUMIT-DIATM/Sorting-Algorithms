package Sorting;
import java.util.Scanner;
public class selection_sort {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :  ");
        int s= sc.nextInt();
        int [] arr=new int[s];
        System.out.println("Enter the elements of the array  :   ");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }

        //selection sorting  using minimum value  :
        int swaps=0;

        for(int i=0;i<s;i++){
          
            int min=arr[i];
            int index=i;
            for(int j=i;j<s-1;j++){
                if (arr[j+1]< min){
                    min = arr[j+1];
                    index=j+1;
                }
            }
            if(index==i) continue;
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
            swaps++;
        }



        System.out.println("After sorting the array is : " );
        for(int i=0;i<s;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nThe number of swaps needed to sort the array is  : "+swaps   );
        sc.close();
    }
    
}
