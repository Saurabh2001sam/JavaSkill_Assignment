public class RevString1 {
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("ABCDEFG");
        for(int i = 0 ; i<sb.length()/2;i++){
            
            int bp = sb.length() - 1 - i;

            char fc = sb.charAt(i);
            char bc = sb.charAt(bp);

            sb.setCharAt(i, bc);
            sb.setCharAt(bp, fc);
        }
        System.out.println(sb);
    }
}
