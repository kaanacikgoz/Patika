package Week2;


public class FrequencyOfElements {

    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        frequencyOfElements(list);
    }

    static void frequencyOfElements(int[] arr) {
        for (int i=0;i<arr.length-1;i++) {
            boolean isAdd=false;
            for (int j=0;j<i;j++) {
                if (arr[i]==arr[j]){
                    isAdd = true;
                    break;
                }
            }
            if (isAdd) {
                continue;
            }
            int count=0;
            for (int value:arr) {
                if (value==arr[i]) {
                    count++;
                }
            }
            System.out.println(arr[i]+" sayısı "+count+" kere tekrar edildi.");
        }
    }

}
