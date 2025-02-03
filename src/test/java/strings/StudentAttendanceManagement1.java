package strings;

//check for l - if it is increase count by 1 and when it reaches 3 - return false
//check for A -if it is, increase count by 1, when it reaches 2 - return false and also if late > 0, then set to 0.
//check for P -if it is, increase count by 1, and also if late > 0, then set to 0.
public class StudentAttendanceManagement1 {

	public static void main(String[] args) {
		checkRecord("LLAPPPA");
	}
	
	public static boolean checkRecord(String s) {
        int absent=0;
        int late=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='P' && late>0) {
                late=0;
                continue;
                }
                if(s.charAt(i) =='A') {
                    absent++;
                    if(late>0){
                        late=0;
                    }
                    if(absent==2){
                        return false;
                    }
                    continue;
                }
                if(s.charAt(i)=='L'){
                    late++;
                    if(late==3){
                        return false;
                    }
                    continue;
                } 

            }
        
        return true;
    }
}
