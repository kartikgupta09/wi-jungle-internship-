public class Wijungleintern {
    public static void main(String[] args) {
        int[] arr1 = {1,5,9};
        int[] arr2 = {2,6,7};
        int[] merge = new int[arr1.length+ arr2.length];

        int i=0,j=0,k=0;
        while(i< arr1.length  && j< arr2.length){
            if(arr1[i]<=arr2[j]){
                merge[k++] = arr1[i++];
            }else{
                merge[k++] = arr2[j++];
            }
        }
        while(i<arr1.length){
            merge[k++] = arr1[i++];
        }
        while(j<arr2.length){
            merge[k++] = arr2[j++];
        }
        int n = merge.length;
        System.out.println(merge[n/2]);

    }
}
