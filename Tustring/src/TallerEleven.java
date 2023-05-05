public class TallerEleven {
    public static int num = 10; 
    
    public int getTallerEleven() {
        int factorial = 1;
        for(int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
    

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("El resultado es : ").append(num).append("! = ");
        for(int i = 1; i <= num; i++) {
            sb.append(i);
            if(i < num) {
                sb.append(" * ");
            }
        }
        sb.append(" = ").append(getTallerEleven());
        return sb.toString();
    }
    
}

