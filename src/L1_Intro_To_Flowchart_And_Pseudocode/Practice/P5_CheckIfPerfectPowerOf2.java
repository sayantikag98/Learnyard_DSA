package L1_Intro_To_Flowchart_And_Pseudocode.Practice;

public class P5_CheckIfPerfectPowerOf2 {
    public static void main(String[] args) {
        for(int num = 0; num<1001; num++){
            if(checkIfPerfectPower(num)){
                System.out.println(num+" -> Perfect Power");
            }
            else{
                System.out.println(num+" -> Not a perfect power");
            }
        }
    }

    private static boolean checkIfPerfectPower(int num){
        if(num == 0) return false;
        while(num!=1){
            if(num%2!=0) return false;
            num/=2;
        }
        return true;
    }

}
