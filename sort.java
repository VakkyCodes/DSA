public class sort {
public static void bubble(int arr[]){
   for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        } 
}
public static void print(int arr[]){
     for(int i:arr){
            System.out.print(i);
        }
}
public static void selection (int arr[]){
    for(int i=0;i<arr.length-1;i++){
        int minindex=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[minindex]){
                minindex=j;
            }

        }
        int temp=arr[minindex];
        arr[minindex]=arr[i];
        arr[i]=temp;
    }
}
public static void insertion (int arr[]){
    for(int i=1;i<arr.length;i++){
        int key=arr[i];
        int j=i-1;
        //4,1,3,2
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;

        }
        arr[j+1]=key;
    }
}
public static void merge(int l,int r,int arr[],int m){
    int n1=m-l+1;
    int n2=r-m;
    int left[]=new int[n1];
    int right[]=new int[n2];
    for(int i=0;i<n1;i++) left[i]=arr[l+i];
    for(int j=0;j<n2;j++) right[j]=arr[m+1+j];
    int i=0,j=0,k=l;
    while(i<n1 && j<n2){
        if(left[i]<=right[j]) arr[k++]=left[i++];
        else arr[k++]=right[j++];
    }
while (i < n1) arr[k++] = left[i++];
        while (j < n2) arr[k++] = right[j++];
}
public static void sorti(int l,int r,int arr[]){
    if(l<r){
        int m=(l+r)/2;
        sorti(l,m,arr);
        sorti(m+1,r,arr);
        merge(l, r, arr, m);
    }
}
public static int quick(int arr[],int l,int h){
    int pivot=arr[h];
    int i=l-1;
    for(int j=l;j<h;j++){
        if(arr[j]<pivot){
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }
    }
    int temp=arr[i+1];
    arr[i+1]=arr[h];
    arr[h]=temp;
return i+1;
}
public static void qsort(int l,int h,int arr[]){
    if(l<h){
       int pi=quick(arr, l, h);
        qsort(l, pi-1, arr);
        qsort(pi+1, h, arr);
    }
}

public static void main(String[] args) {
        //23156
        int arr[]={2,4,1,9,3,0,5};
        print(arr);
        qsort(0,arr.length-1,arr);
        System.out.println(" ");
        print(arr);

    }
}
