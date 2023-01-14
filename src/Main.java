/*
In this section we will see how find any number is present in element or not.
______________________________________________________________________________
Question : Search the given element x in array, If present return the index else return -1.
____________________________________________________________________________________________
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("ENTER THE ELEMENT OF ARRAY :");
        for (int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int ans = -1;
        System.out.println("Enter number you want to check : ");
        int x = sc.nextInt();
        System.out.println("PRINTING THE FINAL VALUE :");
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                ans = i;
            }
        }
        System.out.println(ans);
        }
    }
