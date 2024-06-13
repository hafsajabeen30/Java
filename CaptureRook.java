public class CaptureRook {
    String[] arr1;
    String[] arr2;
    public CaptureRook() {
    }
    public boolean canCapture(String[] arr1, String[] arr2){
        if(arr1[0].equals(arr2[0]) || arr1[1].equals(arr2[1])){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        String[]  rook1 = new String[]{"A", "1"};
        String[] rook2 = new String[]{"A", "2"};
        CaptureRook rooks = new CaptureRook();
        boolean result = rooks.canCapture(rook1, rook2);
        System.out.println("Can the rooks capture each other? " + result );
    }
}



