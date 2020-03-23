public class firstNonReaptiveCharacter {

    public static void findFirstNonRepetiveCharacter(String str)
    {
        char[] arr=str.toCharArray();
        char buffer=0;
        char toReturn;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<=arr[i])
                {
                   buffer=arr[i];
                   arr[i]=arr[j];
                   arr[j]=buffer;
                }
            }
        }


       /* for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }*/

        for (int i = 0; i <arr.length ; i++) {
            if(arr[arr.length-i-1]!=arr[arr.length-i-2]){
                
            }
        }

    }
    public static void main(String[] args) {
        findFirstNonRepetiveCharacter("aadeekpsss");

    }
}
