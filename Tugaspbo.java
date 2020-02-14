
package tugaspbo;
        
import java.util.Scanner;

public class Tugaspbo {


    public static void main(String[] args) {
        String nama;
        int banyaknilai;
        float rata;
        int min=1000;
        int max=0; 
        float total=0;
        
        Scanner input;
        input = new Scanner(System.in);
        
        System.out.print("NAMA : ");
        nama = input.nextLine(); 
        System.out.print("masukan berapa banayak nilai yang akana di input ? ");
        banyaknilai = input.nextInt();
        int nilai[] = new int[banyaknilai];
            for(int i=0;i<banyaknilai;i++ ){
                System.out.print("nilai ke "+(i+1)+" " );
                nilai[i]=input.nextInt();
            }
            for(int i=0;i<banyaknilai;i++){
                if(nilai[i]>=max){
                    max=nilai[i];
                }
                if(nilai[i]<=min){
                    min=nilai[i];
                }
                total=total+nilai[i];
            }
            rata=total/banyaknilai;
            System.out.println("");
            System.out.println("NAMA            : "+ nama);
            System.out.println("nilai tertinggi : "+max);
            System.out.println("nilai terendah  : "+min);
            System.out.println("rata-rata       : "+rata);
        }
        
    }
    
    