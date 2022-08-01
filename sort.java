import java.util.Scanner;

class Sort {   
    public static void main(String[] args)
    {       
        int arr[] = { 4, 3, 2, 1 };
        for (int i = 0; i < a.length; i++) 
	{
            for (int j = i + 1; j < a.length; j++)
 {               
                int temp = 0;
                if (a[j] < a[i]) 
{                 
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
 
            System.out.print(a[i] + " ");
        }
    }
}
